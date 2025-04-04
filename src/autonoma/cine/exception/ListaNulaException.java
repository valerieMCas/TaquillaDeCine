package autonoma.cine.exception;

/**
 *
 * @author Kamii
 */
public class ListaNulaException extends RuntimeException {
    public ListaNulaException() {
        super("La lista de películas no puede ser nula.");
    }
}