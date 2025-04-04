package autonoma.cine.models;

/**
 * Representa la primera función del día con el mayor descuento disponible.
 * @author Kamii
 * @Version 1.0.0
 * @Since 2025-04-04
 */
public class PrimeraFuncion extends Funcion{
    
    public PrimeraFuncion(){
        this.porcentajeDescuento = (float) 50.0;
    }

    @Override
    public float calcularPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
}
