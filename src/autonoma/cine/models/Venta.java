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
    private ArrayList<Boleta>bolateas;
    /*
    * constructor
    */
    public Venta(ArrayList<Boleta> bolateas) {
        this.bolateas = bolateas;
    }
    /*
    * metodos de acepso
    */

    public ArrayList<Boleta> getBolateas() {
        return bolateas;
    }

    public void setBolateas(ArrayList<Boleta> bolateas) {
        this.bolateas = bolateas;
    }
    /*
    * metodo agrgar boleta
    */
    private void agregarBoleta(Boleta b){
        
    }
    
}
