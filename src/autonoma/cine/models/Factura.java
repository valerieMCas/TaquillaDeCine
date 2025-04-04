/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.cine.models;

import java.util.ArrayList;

/**
 * Reoresentar la factura del cine
 * contiene un ArrayList de venta
 * @author valerie moreno
 * @since 4042025
 * @version 1.0
 *
 */
public class Factura {
    private Venta venta;
    private double total;

    public Factura(Venta venta) {
        this.venta = venta;
        this.total = venta.calcularTotal();  // Calcula el total al crear la factura
    }

    public Venta getVenta() {
        return venta;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Factura\n" + 
               "Número de boletos: " + venta.getBoletas().size() + "\n" + 
               "Total: $" + total;
    }
}
