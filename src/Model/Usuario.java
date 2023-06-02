package Model;

public class Usuario {
    /**
     * Nombre del usuario e identificador
     */
    private String nombreUsuario;
    /**
     * Clave al momento de loggearse
     */
    private String contraseña;

    /**
     * Constructor vacío de Usuario
     */
    public Usuario() {
    }

    /**
     * Constructor vacío de Usuario
     * @param nombreUsuario Nombre del usuario e identificador
     * @param contraseña Clave al momento de loggearse
     */
    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
}
