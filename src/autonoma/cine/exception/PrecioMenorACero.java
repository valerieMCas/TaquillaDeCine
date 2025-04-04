/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.cine.exception;

/**
 *
 * @author usuario
 */
public class PrecioMenorACero extends RuntimeException{
    public PrecioMenorACero(){
        super("El precio final debe ser superior a cero");
    }
}
