package Model;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * Clase Conection, es para conectarse a la base de datos
 */
public class Conection {

    /**
     * Objeto palanca
     */
    private Connection con = null;

    /**
     * ip o direccion del servidor
     */
    private static final String URL = "localhost";

    /**
     * nombre del usuario con el que entrar a la base
     */
    private static final String USER = "root";

    /**
     * contraseña con la que entrar a la base
     */
    private static final String CLAVE = "root";

    /**
     * el nombre de la base de datos a la que vamos a entrar
     */
    private static final String BASE = "Vago";

    /**
     * El puerto en el que esta alojada la base
     */
    private static final String PUERTO = "3306";

    /**
     * necesaria para establacer la conexion, con un mayor orden
     */
    String cadena = "jdbc:mysql://" + URL + ":" + PUERTO + "/" + BASE;

    /**
     * Metodo para poder conectarse
     * @return la conexion
     */
    public Connection conectandose() {

        try {
            // Con esto inicialisamos dinamicamente un objeto de la clase de dentro
            Class.forName("com.mysql.cj.jdbc.Driver");

            //con esto cargamos el driver
            con = DriverManager.getConnection(cadena, USER, CLAVE);
            // Para tener una retroalimentacion de que salio bien
            JOptionPane.showMessageDialog(null,"Base de datos creada correctamente");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error en la conexion a la base de datos" + e.toString());
        } finally {
            try {
                // Cerramos posibles conexiones abiertas
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println("Error cerrando conexiones: "
                        + e.toString());
            }
        }
        return con;
    }
}