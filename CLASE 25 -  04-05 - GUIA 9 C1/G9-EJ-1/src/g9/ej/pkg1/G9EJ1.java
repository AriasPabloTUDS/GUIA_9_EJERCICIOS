/*
 Crear una clase CadenaServicio en el 
paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar 
la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package g9.ej.pkg1;

import Entidades.Cadena;
import Entidades.Servicios.CadenaServicio;

/**
 *
 * @author Pablo
 */
public class G9EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CadenaServicio cs = new CadenaServicio();
        
        cs.crearCadena();
        //cs.mostrarVocales();
        //cs.invertirFrase();
        //cs.vecesRepetido();
        //cs.compararLongitud();
        //cs.unirFrase();
        //cs.reeemplazar();
        System.out.println(cs.contiene());
        
        }
}
