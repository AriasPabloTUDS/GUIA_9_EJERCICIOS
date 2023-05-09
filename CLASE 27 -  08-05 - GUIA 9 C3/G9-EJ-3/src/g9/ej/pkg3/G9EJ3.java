/*

 */
package g9.ej.pkg3;

import Servicios.ArregloServicio;

/**
 *
 * @author Pablo
 */
public class G9EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        ArregloServicio as = new ArregloServicio();
        
        System.out.println("     Arreglo A     ");
        as.inicializarA(arregloA);
        as.mostrarArreglo(arregloA);
        System.out.println("     Arreglo B     ");
        as.inicializarB(arregloB,arregloA);
        as.mostrarArreglo(arregloB);
        System.out.println("     Método ordenar     ");
        as.ordenar(arregloA);
        as.mostrarArreglo(arregloA);

    }
    
}
