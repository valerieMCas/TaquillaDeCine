package autonoma.cine.models;

/**
 * Representa una función de la tarde con un descuento específico.
 * @author Kamii
 * @Version 1.0.0
 * @Since 2025-04-04
 */
public class FuncionTarde extends Funcion{
    
    public FuncionTarde(){
        this.porcentajeDescuento = (float) 10.0;
    }
    
    @Override
    public  float calcularPorcentajeDescuento(){
        return porcentajeDescuento;
    }
}
