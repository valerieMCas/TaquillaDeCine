package autonoma.cine.models;

/**
 * Representa una factura generada por una venta de boletería.
 * Cada factura está asociada a una única venta y contiene el total pagado.
 * 
 * @author Valerie Moreno
 * @since 2025-04-04
 * @version 1.0
 */
public class Factura {
    
    /**
     * Venta asociada a esta factura.
     */
    private Venta venta;

    /**
     * Total a pagar por la venta.
     */
    private double totalFactura;

    /**
     * Constructor que crea una factura con una venta específica.
     * 
     * @param venta La venta asociada a la factura.
     */
    public Factura(Venta venta) {
        this.venta = venta;
        this.totalFactura = venta.calcularTotal();
    }



    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
        this.totalFactura = venta.calcularTotal(); 

    }

    public double getTotal() {
        return totalFactura;
    }


    public void setTotal(double total) {
        this.totalFactura = total;
    }

    /**
     * Devuelve una representación en texto de la factura.
     * 
     * @return Información de la factura en formato texto.
     */


    @Override
    public String toString() {
        return "Factura\n" +
               "Número de boletas: " + venta.getBoletas().size() + "\n" +
               "Total: $" + totalFactura;
    }
}
