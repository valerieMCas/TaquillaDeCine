package autonoma.cine.exception;

/**
 *
 * @author Kamii
 */
public class NombreInvalidoException extends RuntimeException {
    public NombreInvalidoException() {
        super("El nombre de la película no puede ser nulo o vacío.");
    }
}
