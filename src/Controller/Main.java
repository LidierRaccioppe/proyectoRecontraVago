package Controller;

import Model.Modelo;
import View.VistaVagos;

import javax.swing.*;

public class Main {
        Modelo mod = new Modelo();
        public static void main(String[] args) {
                // Este sera el proyecto de Lidier Máximo López Raccioppe.
                // El proyecto sera hacer un programa parecido a trivago pero en java, destinado mas a la reseña.
                VistaVagos rellena = new VistaVagos();
                rellena.setVisible(true);
        }


        /**
         * Metodo para registrar un nuevo usuario en la base de datos
         * @param nombreObt el campo de texto donde esta el nombre e identificador del Usuario
         * @param contraseñaObt el campo de contraseña donde esta la contraseña del Usuario
         */
        public void insertarUsuario(JTextField nombreObt, JPasswordField contraseñaObt){
                mod.insertarUsuario(nombreObt,contraseñaObt);
        }
        /**
         * Metodo para registrar una nueva reseña en la base de datos
         * @param nombreObt el campo de texto donde esta el nombre e identificador del Usuario
         * @param recidenciaObt el campo de texto donde esta el nombre e identificador de la Recidencia
         * @param valoraObt campo de texto donde esta la valoracion de los usuario a la residencia
         * @param comentaObt area de texto donde esta el comentario que dejo el usuario a la residencia
         */
        public void insertarReseña(JTextField nombreObt,JTextField recidenciaObt, JTextField valoraObt, JTextArea comentaObt) {
                mod.insertarReseña(nombreObt,recidenciaObt,valoraObt,comentaObt);
        }
        /**
         * Esto muestra los nombres de los hoteles que hay dentro de la base de datos
         */
        public void mostarHoteles(){
                mod.mostarHoteles();
        }
        /**
         * muestra las reseñas que sean de ambos campos
         * @param nombreUserObt el nombre e identificador del usuario que hizo una reseña
         * @param residenciaObt el nombre e identificador del edificio que fue reseñado
         */
        public void mostrarReseña(JTextField nombreUserObt,JTextField residenciaObt){
                mod.mostrarReseña(nombreUserObt,residenciaObt);
        }
}