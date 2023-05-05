/*
 Crear una clase CadenaServicio en el 
paquete servicios que implemente los siguientes métodos:
 */
package Entidades.Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 * @author Pablo
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("/n");
    private Cadena cd;

    public Cadena crearCadena() {
        System.out.println("Ingrese una cadena: ");
        String cadin = leer.nextLine();
        return cd = new Cadena(cadin);
    }
    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
la frase ingresada.
     */
    public void mostrarVocales() {
        int i=0;
        int contador = 0;
        String frs = cd.getFrase();
        for (i = 0; i < cd.getFraselong(); i++) {
            if (("a".equalsIgnoreCase(frs.substring(i, i+1)))
                    || "e".equalsIgnoreCase(frs.substring(i, i+1))
                    || "i".equalsIgnoreCase(frs.substring(i, i+1))
                    || "o".equalsIgnoreCase(frs.substring(i, i+1))
                    || "u".equalsIgnoreCase(frs.substring(i, i+1))) 
            {
                contador++;
            }
        }
        System.out.println("La frase tiene: " +contador + " vocales");
    }

    /*
    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase() {

    }

    /*
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(String letra) {

    }

    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud(String frase) {

    }

    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrase(String frase) {

    }

    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar 
la frase resultante.
     */
    public void reeemplazar(String letra) {

    }

    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public void contiene(String letra) {

    }

    /**
     * @return the cad
     */
    public Cadena getCad() {
        return cd;
    }

    /**
     * @param cad the cad to set
     */
    public void setCad(Cadena cad) {
        this.cd = cad;
    }
}
