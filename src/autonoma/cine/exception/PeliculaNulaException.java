package autonoma.cine.exception;

/**
 *
 * @author Kamii
 */
public class PeliculaNulaException extends RuntimeException {
    public PeliculaNulaException() {
        super("No se puede agregar o eliminar una película nula.");
    }
}