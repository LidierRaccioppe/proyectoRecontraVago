package Model;

public class Edificio {
    /**
     * Nombre del edificio e identificador
     */
    private String nombreRecidencia;
    /**
     * Calle del edificio
     */
    private String calle;
    /**
     * Número del edificio en la calle
     */
    private int numEdificioCalle;
    /**
     * Precio que tiene las habitaciones del edificio
     */
    private float precioHabitacion;
    /**
     * Promedio de la estancia en el edificio dada por usuario comunes
     */
    private int estrellasUsuario;
    /**
     * Número de Habitaciones totales del edificio
     */
    private int numHabitacionesTotales;

    /**
     * Constructor no vacio de Edificio
     * @param nombreRecidencia nombre e identificador del Edificio
     * @param calle calle en la que se encuentra el Edificio
     * @param numEdificioCalle número correspondiente del Edificio en la calle que se encuentra
     * @param precioHabitacion el precio de las habitaciones del hotel
     * @param estrellasUsuario la valoracion que le dieron los usuarios al edificio
     * @param numHabitacionesTotales el numero total de habitaciones que tiene el hotel
     */
    public Edificio(String nombreRecidencia, String calle, int numEdificioCalle, float precioHabitacion, int estrellasUsuario, int numHabitacionesTotales) {
        this.nombreRecidencia = nombreRecidencia;
        this.calle = calle;
        this.numEdificioCalle = numEdificioCalle;
        this.precioHabitacion = precioHabitacion;
        this.estrellasUsuario = estrellasUsuario;
        this.numHabitacionesTotales = numHabitacionesTotales;
    }

    /**
     * Constructor vacío de Edificio
     */
    public Edificio() {
    }

    /**
     * Obtiene el nombre del usuario
     * @return nombreRecidencia que el edificio/recidencia tiene
     */
    public String getNombreRecidencia() {
        return nombreRecidencia;
    }

    /**
     * establece el nombre del edificio/recidencia
     * @param nombreRecidencia el string que queremos que sea el nuevo nombre de la recidencia/edificio
     */
    public void setNombreRecidencia(String nombreRecidencia) {
        this.nombreRecidencia = nombreRecidencia;
    }

    /**
     * Obtiene la calle del Edificio
     * @return calle que en el que el edificio/recidencia se encuentra
     */
    public String getCalle() {
        return calle;
    }

    /**
     * establece el nombre del edificio/recidencia
     * @param calle el string que queremos que sea la nueva calle de la recidencia/edificio
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número del Edificio con respecto a la calle
     * @return numEdificioCalle que en el que el edificio/recidencia se encuentra
     */
    public int getNumEdificioCalle() {
        return numEdificioCalle;
    }

    /**
     * establece el número del edificio/recidencia con respecto a la calle
     * @param numEdificioCalle el string que queremos que sea el nuevo numero de la recidencia/edificio con respecto a la calle
     */
    public void setNumEdificioCalle(int numEdificioCalle) {
        this.numEdificioCalle = numEdificioCalle;
    }

    /**
     * Obtiene el precio de las habitaciones del Edificio
     * @return precioHabitacion precio que tiene las habitaciones del edificio/recidencia
     */
    public float getPrecioHabitacion() {
        return precioHabitacion;
    }

    /**
     * establece el precio de las habitacion del edificio/recidencia
     * @param precioHabitacion el float que queremos que sea el nuevo precio de las habitaciones de la recidencia/edificio
     */
    public void setPrecioHabitacion(float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    /**
     * Obtiene la valoracion que le dieron los usuairos al Edificio
     * @return valoracion que tiene el edificio/recidencia dada por los usuarios
     */
    public int getEstrellasUsuario() {
        return estrellasUsuario;
    }

    /**
     * establece la valoracion del edificio/recidencia
     * @param estrellasUsuario el valor que queremos que sea la nueva valoracion de la recidencia/edificio
     */
    public void setEstrellasUsuario(int estrellasUsuario) {
        this.estrellasUsuario = estrellasUsuario;
    }

    /**
     * Obtiene la cantidad total de habitaciones que tiene el Edificio
     * @return cantidad que tiene el edificio/recidencia dada por los usuarios
     */
    public int getNumHabitacionesTotales() {
        return numHabitacionesTotales;
    }

    /**
     * establece la cantidad total de habitaciones que tiene el edificio/recidencia
     * @param numHabitacionesTotales el valor que queremos que sea la nueva cantidad de habitaciones de la recidencia/edificio
     */
    public void setNumHabitacionesTotales(int numHabitacionesTotales) {
        this.numHabitacionesTotales = numHabitacionesTotales;
    }
}
