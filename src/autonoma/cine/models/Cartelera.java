package autonoma.cine.models;

import autonoma.cine.exception.NombreInvalidoException;
import autonoma.cine.exception.PeliculaDuplicadaException;
import autonoma.cine.exception.PeliculaNoEncontradaException;
import autonoma.cine.exception.PeliculaNulaException;
import java.util.ArrayList;

/**
 * Representa una Cartelera de peliculas en el sistema del cine.
 * Contiene un ArrayList de peliculas 
 * 
 * @author Camila Prada 
 * @version 1.0.0
 * @since 2025-04-03
 */
public class Cartelera {
    
    /**
     * Lista de películas disponibles en la cartelera.
     */
    private ArrayList<Pelicula> peliculas;
    
    /**
     * Constructor de la clase Cartelera.
     * 
     * @param peliculas Lista inicial de películas en la cartelera.
     * @throws ListaNulaException si la lista de películas es nula.
     */
    public Cartelera(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    /**
     * Obtiene la lista de películas de la cartelera.
     * 
     * @return Lista de películas disponibles.
     */
    public ArrayList<Pelicula> getPeliculas() {
        return new ArrayList<>(peliculas);
    }
    
    /**
     * Agrega una nueva película a la cartelera.
     * 
     * @param p Película a agregar.
     * @throws PeliculaNulaException si la película es nula.
     * @throws PeliculaDuplicadaException si la película ya existe en la cartelera.
     */
    public boolean agregarPelicula(Pelicula p) throws PeliculaNulaException, PeliculaDuplicadaException{
        if (p == null) {
            throw new PeliculaNulaException();
        }
        for(Pelicula peliculaExistente: peliculas){
            if(peliculaExistente.getNombre().equals(p.getNombre())){
                throw new PeliculaDuplicadaException();
            }
        }
        peliculas.add(p);
        return true;
            
    }
    
    /**
     * Elimina una película de la cartelera.
     * 
     * @param p Película a eliminar.
     * @throws PeliculaNulaException si la película es nula.
     * @throws PeliculaNoEncontradaException si la película no está en la cartelera.
     */
    public boolean eliminarPelicula(String nombre) throws PeliculaNoEncontradaException{
        for(int i=0; i<peliculas.size(); i++){
            if(peliculas.get(i).getNombre().equals(nombre)){
                peliculas.remove(i);
                return true;
            }
        }
        throw new PeliculaNoEncontradaException();
    }
    
    /**
     * Busca una película en la cartelera por su nombre.
     * 
     * @param nombre Nombre de la película a buscar.
     * @return La película encontrada o null si no existe.
     * @throws NombreInvalidoException si el nombre es nulo o vacío.
     */
    public Pelicula buscarPelicula(String nombre) throws NombreInvalidoException{
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new NombreInvalidoException();
        }
        for (Pelicula p : peliculas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
    
  
}


