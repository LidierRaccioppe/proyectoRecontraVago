package Model;

/**
 * Clase de Hotel, que hereda de Edificio y ofresen pisos y calidad de servicios
 */
public class Hotel extends Edificio{
    /**
     * Número de pisos que tiene el edificio
     */
    private int numPisos;
    /**
     * La calidad de los servicios que da el edificio
     */
    private float calidadServicios;

    /**
     *  Constructor con valores de Hotel y valores heredados de Edificio
     * @param nombreRecidencia nombre e identificador del Edificio
     * @param calle calle en la que se encuentra el Edificio
     * @param numEdificioCalle número correspondiente del Edificio en la calle que se encuentra
     * @param precioHabitacion el precio de las habitaciones del hotel
     * @param estrellasUsuario la valoracion que le dieron los usuarios al hotel
     * @param numHabitacionesTotales el numero total de habitaciones que tiene el hotel
     * @param numPisos Número de pisos que tiene el edificio
     * @param calidadServicios La calidad de los servicios que da el edificio
     */
    public Hotel(String nombreRecidencia, String calle, int numEdificioCalle, float precioHabitacion, int estrellasUsuario, int numHabitacionesTotales, int numPisos, float calidadServicios) {
        super(nombreRecidencia, calle, numEdificioCalle, precioHabitacion, estrellasUsuario, numHabitacionesTotales);
        this.numPisos = numPisos;
        this.calidadServicios = calidadServicios;
    }

    /**
     * Contstructor de solo valores de Hotel
     * @param numPisos Número de pisos que tiene el edificio
     * @param calidadServicios La calidad de los servicios que da el edificio
     */
    public Hotel(int numPisos, float calidadServicios) {
        this.numPisos = numPisos;
        this.calidadServicios = calidadServicios;
    }

    /**
     * Constructor sin valores de Hotel y con valores de Edificio
     * @param nombreRecidencia nombre e identificador del Edificio
     * @param calle calle en la que se encuentra el Edificio
     * @param numEdificioCalle número correspondiente del Edificio en la calle que se encuentra
     * @param precioHabitacion el precio de las habitaciones del hotel
     * @param estrellasUsuario la valoracion que le dieron los usuarios al hotel
     * @param numHabitacionesTotales el numero total de habitaciones que tiene el hotel
     */
    public Hotel(String nombreRecidencia, String calle, int numEdificioCalle, float precioHabitacion, int estrellasUsuario, int numHabitacionesTotales) {
        super(nombreRecidencia, calle, numEdificioCalle, precioHabitacion, estrellasUsuario, numHabitacionesTotales);
    }

    /**
     * Obtiene el número de pisos del Hotel
     * @return numPisos que el edificio/recidencia tiene
     */
    public int getNumPisos() {
        return numPisos;
    }

    /**
     * establece el número de pisos del Hotel
     * @param numPisos el int que queremos que sea el nuevo número de pisos del Hotel
     */
    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    /**
     * Obtiene la calidad de los servicios del Hotel
     * @return calidadServicios que el edificio/recidencia tiene
     */
    public float getCalidadServicios() {
        return calidadServicios;
    }

    /**
     * establece el número de pisos del Hotel
     * @param calidadServicios el float que queremos que sea la nueva calidad de los servicios del Hotel
     */
    public void setCalidadServicios(float calidadServicios) {
        this.calidadServicios = calidadServicios;
    }
}
