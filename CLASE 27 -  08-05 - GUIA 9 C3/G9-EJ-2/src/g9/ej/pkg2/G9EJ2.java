/*
 

 */
package g9.ej.pkg2;

import Entidades.Servicios.ParDeNumeroServicio;

/**
 *
 * @author Pablo
 */
public class G9EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    ParDeNumeroServicio pdns = new ParDeNumeroServicio();
    
    pdns.crearParDeNumeros();
    pdns.mostrarValores();
    pdns.devolverMayor();
    pdns.calcularPotencia();
    pdns.calcularRaiz();
    }
    
}
