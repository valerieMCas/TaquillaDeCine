package autonoma.cine.main;

import autonoma.cine.exception.PrecioMenorACero;
import autonoma.cine.models.Boleta;
import autonoma.cine.models.Funcion;
import autonoma.cine.models.FuncionNoche;
import autonoma.cine.models.FuncionTarde;
import autonoma.cine.models.Pelicula;
import autonoma.cine.models.PrimeraFuncion;
import autonoma.cine.models.Usuario;
import autonoma.cine.models.UsuarioAdulto;
import autonoma.cine.models.UsuarioPersonaMayor;

/**
 * Aplicación principal para simular la compra de boletas en el cine.
 * Crea películas, funciones y usuarios, y calcula el precio de boletas
 * según los descuentos aplicados.
 * 
 * @author Camila Prada
 * @version 1.0.0
 * @since 2025-04-04
 */
public class CineApp {
    public static void main(String[] args) {
        /** 
        * Se crean las funciones del cine
        */
        Funcion f1 = new FuncionTarde();
        Funcion f2 = new PrimeraFuncion();
        Funcion f3 = new FuncionNoche();

        /** 
        * Se crean las películas del cine 
        */        
        
        Pelicula p1 = new Pelicula(" Minions ", 40000);
        Pelicula p2 = new Pelicula(" Moana ", 60000);
        
        /** 
        * Asociar funciones a la película p1
        */  
        
        p1.agregarFuncion(f1);
        p1.agregarFuncion(f2);
        p1.agregarFuncion(f3);

        /** 
        * Se crean los usuarios
        */ 
        
        Usuario usuario1 = new UsuarioPersonaMayor();
        Usuario usuario2 = new UsuarioAdulto();

        /** 
        * Simular la compra de boletas para cada función
        */ 
        
        for (Funcion funcion : p1.getFunciones()) {
            Boleta boleta = new Boleta(0, p1, funcion, usuario2);

            try {
                double precioFinal = boleta.calcularPrecio(); 
                System.out.println("------------------------------------------------------");
                System.out.println("Función: " + funcion.getClass().getSimpleName());
                System.out.println("Precio base: $" + p1.getCostoBase());
                System.out.println("Descuento función: " + funcion.getPorcentajeDescuento() + "%");
                System.out.println("Descuento usuario: $" + usuario2.getDescuento());
                System.out.println("TOTAL: $" + precioFinal);
                System.out.println("Boleta: " + boleta);
                System.out.println("======================================================");
            } catch (PrecioMenorACero e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
