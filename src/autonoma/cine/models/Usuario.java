package autonoma.cine.models;

/**
 * Clase abstracta que representa un usuario en el sistema del cine.
 * Cada usuario puede tener un descuento aplicado a la compra de boletos.
 * 
 * @author camila prada 
 * @version 1.0.0
 * @since 2025-04-03
 */
public abstract class Usuario {
    /** Nombre del usuario (opcional) */
    private String nombre;
    /** Descuento aplicado al usuario. */
    protected double descuento;
    /**
    * Constructor por defecto de Usuario.
    * Inicializa el nombre como una cadena vacía y el descuento en 0.
    */
    public Usuario() {
        this.nombre = "";
        this.descuento = 0;
    }

    /**
     * Obtiene el valor del descuento aplicado al usuario.
     * Este valor representa una cantidad fija en dinero que se descontará 
     * del precio base de la boleta al momento de calcular el precio final.
     * 
     * @return El descuento del usuario como un valor en pesos.
     */
    public double getDescuento() {
        return descuento;
    }
    
    
    
    /**
    * Metodo abstracto que calcula el porcentaje de descuento aplicado al usuario.
    * Metodo que debe ser implemnetado por las subclases para definir su decuento.
    */
    public abstract double calcularPorcentajeDescuento();
}
