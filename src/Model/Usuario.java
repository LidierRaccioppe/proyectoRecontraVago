package Model;

/**
 * Clase de Usuario
 */
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
     * Constructor no vacio de Usuario
     * @param nombreUsuario Nombre del usuario e identificador
     * @param contraseña Clave al momento de loggearse
     */
    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el nombre del usuario
     * @return nombre que el usuario tiene
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * establece el nombre del usuario
     * @param nombreUsuario el string que queremos que sea el nuevo nombre del usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene la contraseña del usuario
     * @return contraseña que el usuario tiene
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * establece la contraseña del usuario
     * @param contraseña el string que queremos que sea la nueva contraseña del usuario
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
