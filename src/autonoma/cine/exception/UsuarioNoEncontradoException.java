/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.cine.exception;

/**
 *
 * @author usuario
 */
public class UsuarioNoEncontradoException extends RuntimeException{
    public UsuarioNoEncontradoException(){
        super("El usuario no se encontro");
    }
}
