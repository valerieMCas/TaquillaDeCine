package autonoma.cine.main;

/**
 * Representa a un usuario de tipo Adulto en el sistema del cine.
 * 
 * @author camila prada 
 * @version 1.0.0
 * @since 2025-04-03
 */
public class Adulto extends Usuario{

    /**
    * Constructor de Adulto.
    * Inicializa el descuento en 0, ya que este es su descuento.
    */
    public Adulto() {
        this.descuento = 0;
    }

    /**
    * Devuelve el descuento correspondiente de adulto.
    *
    * @return el valor fijo de descuento (0).
    */
    @Override
    public double calcularPorcentajeDescuento() {
       return this.descuento;
    }
    
    
    
}
