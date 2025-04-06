/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.cine.exception;

/**
 *
 * @author usuario
 */
public class UsuarioYaRegistradoException extends RuntimeException{
    public UsuarioYaRegistradoException(){
        super("El usuario ya esta registrado");
    }
}
