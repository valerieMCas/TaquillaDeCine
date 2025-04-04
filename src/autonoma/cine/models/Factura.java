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
    /**
     * Lista de ventas de poleteria.
     */
    private ArrayList<Venta>ventas;

    private double total;
    Venta venta;
    public Factura(ArrayList<Venta> ventas, double total) {
        this.ventas = ventas;
        this.total = total;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public String toString() {
        return "Factura\n" + 
               "Número de boletos: " + venta.getBoletas().size() + "\n" + 
               "Total: $" + total;
    }
}
