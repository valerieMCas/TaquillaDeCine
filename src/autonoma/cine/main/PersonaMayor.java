package autonoma.cine.main;

/**
 * Representa a un usuario de tipo Persona Mayor en el sistema del cine.
 * 
 * @author camila prada 
 * @version 1.0.0
 * @since 2025-04-03
 */
public class PersonaMayor extends Usuario{
    
    /**
    * Constructor de Persona Mayor.
    * Inicializa el descuento en 1000, ya que este es su descuento.
    */
    public PersonaMayor(){
        this.descuento = 1000;
    }
    
    /**
    * Devuelve el descuento correspondiente de Persona Mayor.
    *
    * @return el valor fijo de descuento (1000).
    */
    @Override
    public double calcularPorcentajeDescuento(){
        return this.descuento;
    }
}
