package autonoma.cine.models;

/**
 *
 * Representa una función de la noche con un descuento específico.
 * @author Kamii
 * @Version 1.0.0
 * @Since 2025-04-04
 */
public class FuncionNoche extends Funcion{
    public FuncionNoche(){
        this.porcentajeDescuento = (float) 0.0;
    }
    
    @Override
    public float calcularPorcentajeDescuento(){
        return porcentajeDescuento;
    }
}
