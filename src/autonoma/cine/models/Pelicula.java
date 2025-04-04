package autonoma.cine.models;

import autonoma.cine.exception.ListaNulaException;
import java.util.ArrayList;

/**
 * Representa una Película en el sistema del cine.
 * Contiene informacion basica como el nombre de la pelicula
 * y su costo base para ser utilizada en operaciones del sistema.
 * 
 * @author Camila Prada 
 * @version 1.0.0
 * @since 2025-04-03
 */
public class Pelicula {
    
    /** 
     * Nombre de la película.
     */
    private String nombre;

    /**
     * Costo base de la película (sin impuestos ni cargos adicionales).
     */
    private float costoBase;
    /**
    * Lista de funciones en las que se proyecta la película.
    */
    private ArrayList<Funcion> funciones;

    /**
     * Constructor de Pelicula
     * 
     * @param nombre El nombre de la película.
     * @param costoBase El costo base de la película.
     */
    public Pelicula(String nombre, float costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
        this.funciones = new ArrayList<>();
    }

    /**
     * Obtiene el nombre de la película.
     * 
     * @return El nombre de la película.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece o actualiza el nombre de la película.
     * 
     * @param nombre El nuevo nombre de la película.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el costo base de la película.
     * 
     * @return El costo base de la película.
     */
    public float getCostoBase() {
        return costoBase;
    }

    /**
     * Establece o actualiza el costo base de la película.
     * 
     * @param costoBase El nuevo costo base de la película.
     */
    public void setCostoBase(float costoBase) {
        this.costoBase = costoBase;
    }
    /**
     * Obtiene la lista de funciones asociadas a la película.
     * 
     * @return Lista de funciones.
     */
    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }
    
        /**
     * Agrega una nueva función a la lista de funciones de la película.
     * @param funcion La función que se desea agregar.
     * @throws IllegalArgumentException si la función es nula.
     */
    public void agregarFuncion(Funcion funcion) throws ListaNulaException{
        if (funcion == null) {
            throw new ListaNulaException();
        }
      funciones.add(funcion); 
    } 
}
