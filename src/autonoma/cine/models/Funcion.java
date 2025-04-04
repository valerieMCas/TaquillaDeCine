package autonoma.cine.models;

/**
 * Representa una Función en el sistema del cine.
 * Cada función está asociada a una película específica.
 * 
 * @author Camila Prada
 * @version 1.0.0
 * @since 2025-04-03
 */
public abstract class Funcion {

    /** Película asociada a la función */
    private Pelicula pelicula;
    private String horario;
    protected float porcentajeDescuento;
    
    /**
     * Constructor por defecto, inicializa con 0% de descuento.
     */
    public Funcion() {
        this.porcentajeDescuento = 0.0f;
    }

    /**
     * Crea una nueva función para una película específica.
     * 
     * @param pelicula La película que se proyectará en esta función.
     * @param horario El horario de la función.
     */
    
    public Funcion(Pelicula pelicula, String horario) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.porcentajeDescuento = 0.0f;
        
    }

    /**
     * Obtiene la película asociada a la función.
     * 
     * @return La película de la función.
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Establece o cambia la película de la función.
     * 
     * @param pelicula La nueva película de la función.
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * Obtiene el horario de la función.
     * 
     * @return El horario de la función.
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Establece un nuevo horario para la funcion.
     * 
     * @param horario El nuevo horario de la funcion.
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
    * Devuelve el porcentaje de descuento que aplica la funcion.
    * Debe ser implementado por las subclases.
    * 
    * @return Porcentaje de descuento.
    */
    public abstract float  calcularPorcentajeDescuento();
    
    /**
     * Muestra la información de la función.
     * 
     * @return Detalles de la función en formato de texto.
     */
    @Override
    public String toString() {
        return "Funcion de '" + pelicula.getNombre() + "' a las " + horario;
    }
}
