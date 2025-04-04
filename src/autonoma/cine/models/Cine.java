/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.cine.models;

import autonoma.cine.exception.PeliculaNoEncontradaException;
import autonoma.cine.exception.PeliculaNulaException;
import autonoma.cine.exception.UsuarioNoEncontradoException;
import autonoma.cine.exception.UsuarioYaRegistradoException;
import autonoma.cine.exception.UsuariosNulaException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Cine {
    Cartelera carteleras;
    private ArrayList<Factura> facturas = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public Cine(Cartelera carteleras, ArrayList<Factura> Facturas, ArrayList<Usuario>usuarios) {
        this.carteleras = carteleras;
        this.facturas = facturas;
        this.usuarios = usuarios;
    }
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> Facturas) {
        this.facturas = Facturas;
    }
    
    public Factura venderBoletas(Venta venta) {
        Factura factura = new Factura(venta);
        facturas.add(factura);
        return factura;
    }
    public void agregarUsuario(Usuario u) {
        try{
            if (usuarios.contains(u)) {
                throw new UsuarioYaRegistradoException();
            }
        }catch(UsuarioYaRegistradoException e){
            System.out.println(e.getMessage());
        }
        usuarios.add(u);
        System.out.println("Usuario agregado: " + u.getnombre());
    }
    public void eliminarUsuario(Usuario usuario) {
        try {
            if (usuarios.remove(usuario)) {
            throw new UsuarioNoEncontradoException();
            }
        }catch(UsuarioNoEncontradoException e){
            System.out.println(e.getMessage());
        }
    }
    public void eliminarPelicula(String nombre){
        this.carteleras.eliminarPelicula(nombre);
    }
    public void agregarPelicula(Pelicula p){
        this.carteleras.agregarPelicula(p);
    }
    public void listarUsuarios() {
        try{
            if (usuarios.isEmpty()) {
                throw new UsuariosNulaException();
            }
        }catch(UsuariosNulaException e){
            System.out.println(e.getMessage());
        }
        System.out.println(" Lista de usuarios:");
        for (Usuario u : usuarios) {
            System.out.println("- " + u.getnombre() + " (Descuento: " + u.calcularPorcentajeDescuento() + "%)");
        }
    }
    public void listarPeliculas(){
        try{
            if (carteleras.getPeliculas().isEmpty()) {
                throw new PeliculaNulaException();
            }
        }catch(PeliculaNulaException e){
            System.out.println(e.getMessage());
        }
        System.out.println(" Lista de peliculas:");
        for (Pelicula p : carteleras.getPeliculas()) {
            System.out.println("- " + p.getNombre() + " costo $" + p.getCostoBase());
        }
    }   
    
}
