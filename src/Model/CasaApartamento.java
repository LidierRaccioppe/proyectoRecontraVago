package Model;

/**
 * Clase de CasaApartamento, que hereda de Edificio y ofresen mas libertad, por lo que se mira la distancia al centro
 */
public class CasaApartamento extends Edificio{
    /**
     * Distancia que tiene con el centro de la urbanizacion
     */
    private float distanciaCentro;

    /**
     * Constructor con valores de CasaApartamento y con valores de Edificio
     * @param nombreRecidencia nombre e identificador del Edificio
     * @param calle calle en la que se encuentra el Edificio
     * @param numEdificioCalle número correspondiente del Edificio en la calle que se encuentra
     * @param precioHabitacion el precio de las habitaciones del hotel
     * @param estrellasUsuario la valoracion que le dieron los usuarios al hotel
     * @param numHabitacionesTotales el numero total de habitaciones que tiene el hotel
     * @param distanciaCentro Distancia que tiene con el centro de la urbanizacion
     */
    public CasaApartamento(String nombreRecidencia, String calle, int numEdificioCalle, float precioHabitacion, int estrellasUsuario, int numHabitacionesTotales, float distanciaCentro) {
        super(nombreRecidencia, calle, numEdificioCalle, precioHabitacion, estrellasUsuario, numHabitacionesTotales);
        this.distanciaCentro = distanciaCentro;
    }

    /**
     * Constructor con valores de CasaApartamento y sin valores de Edificio
     * @param distanciaCentro Distancia que tiene con el centro de la urbanizacion
     */
    public CasaApartamento(float distanciaCentro) {
        this.distanciaCentro = distanciaCentro;
    }

    /**
     * Constructor vacio de CasaApartamento y con valores de Edificio
     * @param nombreRecidencia nombre e identificador del Edificio
     * @param calle calle en la que se encuentra el Edificio
     * @param numEdificioCalle número correspondiente del Edificio en la calle que se encuentra
     * @param precioHabitacion el precio de las habitaciones del hotel
     * @param estrellasUsuario la valoracion que le dieron los usuarios al hotel
     * @param numHabitacionesTotales el numero total de habitaciones que tiene el hotel
     */
    public CasaApartamento(String nombreRecidencia, String calle, int numEdificioCalle, float precioHabitacion, int estrellasUsuario, int numHabitacionesTotales) {
        super(nombreRecidencia, calle, numEdificioCalle, precioHabitacion, estrellasUsuario, numHabitacionesTotales);
    }

    /**
     * Constructor vacio de CasaApartamento y sin valores de Edificio
     */
    public CasaApartamento() {
    }
}
