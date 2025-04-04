package autonoma.cine.exception;

/**
 *
 * @author Kamii
 */
public class PeliculaNoEncontradaException extends RuntimeException {
    public PeliculaNoEncontradaException() {
        super("La película no está en la cartelera.");
    }
}