/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.cine.models;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Venta {
    /*
    * contiene un ArrayList de boleta
    */
    private ArrayList<Boleta>boletas;
    /*
    * constructor
    */
    public Venta(ArrayList<Boleta> bolateas) {
        this.boletas = boletas;
    }
    /*
    * metodos de acepso
    */

    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }

    public void setBoletas(ArrayList<Boleta> boletas) {
        this.boletas = boletas;
    }
    /*
    * metodo agrgar boleta
    */
    public void agregarBoleta(Boleta b){
        boletas.add(b);
    }
    public double calcularTotal(){
        double total=0;
        for (int i=0; i<boletas.size(); i++){
            total+=boletas.get(i).getPrecioFinal();
        }
        return total;
    }
    
}
