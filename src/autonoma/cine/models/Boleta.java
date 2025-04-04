/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.cine.models;

import autonoma.cine.exception.PrecioMenorACero;

/**
 * Reoresentar las boletas a vendar
 * @author valerie moreno
 * @since 4042025
 * @version 1.0
 */
public class Boleta {
    /**
    *atributo que nos va ayudar a calular el precio final
    */
    private double precioFinal;
   /**
    * instancia de pelicula
    */
    Pelicula pelicula;
    /**
    * instancia de funcion
    */
    Funcion funcion;
    /**
    * instancia de usuario y el metodo adtract 
    */
    Usuario usuario;

    public Boleta(double precioFinal, Pelicula pelicula, Funcion funcion, Usuario usuario) {
        this.precioFinal = precioFinal;
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.usuario = usuario;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public double calcularPrecio (Funcion f){
        double precioBase = pelicula.getCostoBase();
        double descuentoFuncion = funcion.porcentajeDescuento;
        double descuentoCalculado = (precioBase*descuentoFuncion)/100;
        double descuentoUsuario = precioBase-usuario.descuento;
        precioFinal = precioBase-(descuentoUsuario + descuentoFuncion);
        try{
            if(precioFinal>0){
                throw new PrecioMenorACero();
            }
        }catch(PrecioMenorACero e){
            System.out.println(e.getMessage());
        }
        return precioFinal;
    }
    public String toString() {
        return "Boleta para la pelicula " +pelicula.getNombre() +"Con un total de "+ this.precioFinal;
    }
}
