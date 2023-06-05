package Model;
import com.lidier.validar.Excepcion;
import com.lidier.validar.Validaciones;

import static java.lang.Integer.parseInt;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Observable;

/**
 * Clase Modelo, para el manejo de los datos
 */
public class Modelo extends Observable {
    private Usuario usuar = new Usuario();
    private Reseña res = new Reseña();

    // creo el arrayList
    public ArrayList<String> hoteles = new ArrayList<>();

    /**
     * Metodo para registrar un nuevo usuario en la base de datos
     * @param nombreObt el campo de texto donde esta el nombre e identificador del Usuario
     * @param contraseñaObt el campo de contraseña donde esta la contraseña del Usuario
     */
    public void insertarUsuario(JTextField nombreObt,JPasswordField contraseñaObt){
        usuar.setNombreUsuario(nombreObt.getText());
        usuar.setContraseña(contraseñaObt.getText());

        //esto servie para los inserts, pero por comodidad sera no tan local, ademas no ser necesario el try
        String consulta = "insert into Usuarios (nombre, contraseña) values (?,?);";
        Conection conect = new Conection();

        try {
            /*
            prepara un comando usando el string que les demos, pero antes debe de conectarse al base,
            tambien debemos poner los argumentos
            */
            CallableStatement cs = conect.conectandose().prepareCall(consulta);
            /*esto es para que en los interogantes que dejamos antes estos
            sean llenados en el orden de los numero que pondremos ahora*/
            cs.setString (1, usuar.getNombreUsuario());
            cs.setString (2, usuar.getContraseña());
            // Ejecutara todas la linea preparadas disponibles en orden
            cs.execute();
            // para la retroalimentacion
            JOptionPane.showMessageDialog(null, "La Insercion fue exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error en la insercion"+e.getMessage());
        }
    }
    /**
     * Metodo para registrar una nueva reseña en la base de datos
     * @param nombreObt el campo de texto donde esta el nombre e identificador del Usuario
     * @param recidenciaObt el campo de texto donde esta el nombre e identificador de la Recidencia
     * @param valoraObt campo de texto donde esta la valoracion de los usuario a la residencia
     * @param comentaObt area de texto donde esta el comentario que dejo el usuario a la residencia
     */
    public void insertarReseña(JTextField nombreObt,JTextField recidenciaObt, JTextField valoraObt, JTextArea comentaObt){
        res.setNombreUsuario(nombreObt.getText());
        res.setNombreRecidencia(recidenciaObt.getText());
        res.setEstrellasUsuario(Integer.parseInt(valoraObt.getText()));
        res.setComentarioReseña(comentaObt.getText());

        //esto servie para los inserts, pero por comodidad sera no tan local, ademas no ser necesario el try
        String consulta = "insert into Reseñas (nombre, nombreResidencia, valoracion, comentario) values (?,?,?,?);";
        Conection conect = new Conection();

        try {
            /*
            prepara un comando usando el string que les demos, pero antes debe de conectarse al base,
            tambien debemos poner los argumentos
            */
            CallableStatement cs = conect.conectandose().prepareCall(consulta);
            /*esto es para que en los interogantes que dejamos antes estos
            sean llenados en el orden de los numero que pondremos ahora*/
            cs.setString (1, res.getNombreUsuario());
            cs.setString (2, res.getNombreRecidencia());
            try{
                cs.setString (2,Float.toString(Validaciones.floatValido0Hasta10(res.getEstrellasUsuario())));
            }catch(Excepcion ex){
                System.out.println("error"+ex.getMessage());
            }
            cs.setString (2, res.getComentarioReseña());
            // Ejecutara todas la linea preparadas disponibles en orden
            cs.execute();
            // para la retroalimentacion
            JOptionPane.showMessageDialog(null, "La Insercion fue exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error en la insercion"+e.getMessage());
        }
    }

    /**
     * Esto muestra los nombres de los hoteles que hay dentro de la base de datos
     */
    public void mostarHoteles(){
        //reviso conexion por si se actualizo
        Conection conexion = new Conection();
        Connection connection = conexion.conectandose();

        try {
        String consulta = "select * from Hotel;";

        try (Statement recado = connection.createStatement(); // Funciona como una "," dentro de los parametros de una funcion
             ResultSet resultSet = recado.executeQuery(consulta)) {


            //guardo en el arrayList los nombres de los edicisios
            while (resultSet.next()) {
                // me permite enfocar en una columna en concreto
                String nombreHotel = resultSet.getString("nombre");
                // añado el string a la arrayList de Strings
                hoteles.add(nombreHotel);
            }

            // muestro los nombres de los hoteles, por eso tambien hice la array de String
            // para evitar problemas si hay algo que no sea String dentro de ahi
            for (String hotel : hoteles) {
                System.out.println(hotel);
            }
            setChanged();
            notifyObservers(hoteles.size());
        }} catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error en el mostrar"+e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * muestra las reseñas que sean de ambos campos
     * @param nombreUserObt el nombre e identificador del usuario que hizo una reseña
     * @param residenciaObt el nombre e identificador del edificio que fue reseñado
     */
    public void mostrarReseña(JTextField nombreUserObt,JTextField residenciaObt){

        Conection conexion = new Conection();
        Connection conectacion = conexion.conectandose();

        try {
            String consulta = "select * from Reseña where nombre = ? AND nombreResidencia = ?";

            try (Statement recado = conectacion.createStatement(); // Funciona como una "," dentro de los parametros de una funcion
                 ResultSet resultSet = recado.executeQuery(consulta)) {


                //guardo en el arrayList los nombres de los edicisios
                while (resultSet.next()) {
                    // me permite enfocar en una columna en concreto
                    String nombreUsuario = resultSet.getString("nombre");
                    String nombreResidencia = resultSet.getString("nombreResidencia");
                    String valoracion = resultSet.getString("valoracion");
                    String comentario = resultSet.getString("comentario");
                    // añado el string a la arrayList de Strings
                    // hoteles.add(nombreHotel);
                    // ya no la uso debido al mayor numero de variables y la necesidad de tener que usar otros medios
                    System.out.println("Nombre de Usuario:"+ nombreUsuario);
                    System.out.println("Nombre de Residencia:"+ nombreResidencia);
                    System.out.println("Valoración:"+ valoracion);
                    System.out.println("Comentario:"+ comentario);
                    System.out.println("");
                    System.out.println("");
                }
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error en el mostrar"+e.getMessage());
        } finally {
            try {
                if (conectacion != null) {
                    conectacion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}