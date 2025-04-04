package autonoma.cine.exception;

/**
 *
 * @author Kamii
 */
public class FuncionNulaException extends RuntimeException{
    public FuncionNulaException(){
        super("La función no puede ser nula.");
    }
}
