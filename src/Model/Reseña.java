package Model;

/**
 * Clase de Reseña, que es hecha por un Usuario para dar su opinion de un Edificio/CasaApartamento/Hotel
 */
public class Reseña {
    /**
     * nombre del usuario que hizo la reseña
     */
    private String nombreUsuario;
    /**
     * nombre de la recidencia para la que se hizo la reseña
     */
    private String nombreRecidencia;

    /**
     * valoración que dio el usuario a la recidencia, este va de 0 a 10
     */
    private float estrellasUsuario;
    /**
     * opinion que deja el Usuario sobre la recidencia
     */
    private String comentarioReseña;

    /**
     * Constructor con valores de Reseña
     * @param nombreUsuario nombre del usuario que hizo la reseña
     * @param nombreRecidencia nombre de la recidencia para la que se hizo la reseña
     * @param estrellasUsuario valoración que dio el usuario a la recidencia, este va de 0 a 10
     * @param comentarioReseña opinion que deja el Usuario sobre la recidencia
     */
    public Reseña(String nombreUsuario, String nombreRecidencia, float estrellasUsuario, String comentarioReseña) {
        this.nombreUsuario = nombreUsuario;
        this.nombreRecidencia = nombreRecidencia;
        this.estrellasUsuario = estrellasUsuario;
        this.comentarioReseña = comentarioReseña;
    }

    /**
     * Constructor vacio de Reseña
     */
    public Reseña() {
    }

    /**
     * obtiene el nombre del usuario que hizo la reseña
     * @return nombre del usuario que hizo la reseña
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre del usuario que hizo la reseña
     * @param nombreUsuario el nombre del usuario que hizo la reseña
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * obtiene el nombre de la recidencia para la que se hizo la reseña
     * @return el nombre de la recidencia para la que se hizo la reseña
     */
    public String getNombreRecidencia() {
        return nombreRecidencia;
    }

    /**
     * Establece el nombre de la recidencia para la que se hizo la reseña
     * @param nombreRecidencia el nombre de la recidencia para la cual fue hecha la reseña
     */
    public void setNombreRecidencia(String nombreRecidencia) {
        this.nombreRecidencia = nombreRecidencia;
    }

    /**
     * obtiene la valoración que dio el usuario a la recidencia, este va de 0 a 10
     * @return la valoración que dio el usuario a la recidencia, este va de 0 a 10
     */
    public float getEstrellasUsuario() {
        return estrellasUsuario;
    }

    /**
     * Establece la valoración que dio el usuario a la recidencia, este va de 0 a 10
     * @param estrellasUsuario la valoración que quieres que el usuario le de a la recidencia, este va de 0 a 10
     */
    public void setEstrellasUsuario(float estrellasUsuario) {
        this.estrellasUsuario = estrellasUsuario;
    }

    /**
     * obtiene la opinion que deja el Usuario sobre la recidencia
     * @return la opinion que deja el Usuario sobre la recidencia
     */
    public String getComentarioReseña() {
        return comentarioReseña;
    }

    /**
     * Establce la opinion que deja el Usuario sobre la recidencia
     * @param comentarioReseña el comentario que quieres que el usuario le de a la recidenciasssss
     */
    public void setComentarioReseña(String comentarioReseña) {
        this.comentarioReseña = comentarioReseña;
    }
}
