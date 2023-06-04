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
    private float precioHabitacionPromedio;
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
     * @param precioHabitacionPromedio el precio de las habitaciones del hotel
     * @param estrellasUsuario la valoracion que le dieron los usuarios al edificio
     * @param numHabitacionesTotales el numero total de habitaciones que tiene el hotel
     */
    public Edificio(String nombreRecidencia, String calle, int numEdificioCalle, float precioHabitacionPromedio, int estrellasUsuario, int numHabitacionesTotales) {
        this.nombreRecidencia = nombreRecidencia;
        this.calle = calle;
        this.numEdificioCalle = numEdificioCalle;
        this.precioHabitacionPromedio = precioHabitacionPromedio;
        this.estrellasUsuario = estrellasUsuario;
        this.numHabitacionesTotales = numHabitacionesTotales;
    }

    /**
     * Constructor vacío de Edificio
     */
    public Edificio() {
    }
}
