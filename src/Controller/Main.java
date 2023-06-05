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
}