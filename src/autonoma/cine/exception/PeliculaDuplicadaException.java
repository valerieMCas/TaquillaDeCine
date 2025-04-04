package autonoma.cine.exception;

/**
 *
 * @author Kamii
 */
public class PeliculaDuplicadaException extends RuntimeException {
    public PeliculaDuplicadaException() {
        super("La película ya está en la cartelera.");
    }
}
