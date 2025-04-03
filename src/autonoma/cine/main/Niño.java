package autonoma.cine.main;

/**
 * Representa a un usuario de tipo Niño en el sistema del cine.
 * 
 * @author camila prada 
 * @version 1.0.0
 * @since 2025-04-03
 */
class Niño extends Usuario {
    
    /**
     * Constructor de Niño.
     * Inicializa el descuento en 500, ya que este es su descuento.
     */
    public Niño() {
        this.descuento = 500; 
    }

    /**
     * Devuelve el descuento correspondiente de Niño.
     *
     * @return el valor fijo de descuento (500).
     */
    @Override
    public double calcularPorcentajeDescuento() {
        return this.descuento;
    }
}
