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
        String cadIn = leer.nextLine();
        return cd = new Cadena(cadIn);
    }

    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
la frase ingresada.
     */
    public void mostrarVocales() {
        int contadorVocales = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < cd.getFraselong(); i++) {
            char letra = cd.getFrase().charAt(i);
            if (vocales.indexOf(letra) != -1) {
                contadorVocales++;
            }
        }
        System.out.println("La frase tiene: " + contadorVocales + " vocales");
    }

    /*
    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase() {
        String aux = "";
        for (int i = cd.getFraselong() - 1; i >= 0; i--) {
            aux += cd.getFrase().charAt(i);
        }
        System.out.println("Frase invertida: " + aux);
    }

    /*
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido() {
        System.out.println("Ingrese el caracter: ");
        char caract = leer.nextLine().charAt(0);
        int contador = 0;
        for (int i = 0; i < cd.getFraselong(); i++) {
            if (cd.getFrase().toLowerCase().charAt(i) == caract) {
                contador++;
            }
        }
        System.out.println("el caracter se repite: " + contador + " veces");
    }

    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud() {
        System.out.println("Ingrese la frase para comparar: ");
        String frase2 = leer.nextLine();
        if (cd.getFraselong() == frase2.length()) {
            System.out.println("La longitud de las frases son iguales");
        } else {
            System.out.println("La longitud de las frases son diferentes");
        }

    }

    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrase() {
        System.out.println("Ingrese la frase para unir: ");
        String frase2 = leer.nextLine();
        System.out.println(cd.getFrase() + " , " + frase2);
    }

    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar 
la frase resultante.
     */
    public void reeemplazar() {
        System.out.println("Ingrese el caracter");
        char caracter = leer.nextLine().charAt(0);
        String aux = "";
        aux = cd.getFrase().toLowerCase().replace('a', caracter);
        System.out.println("Caracter 'a' reemplazado: " + aux);
    }

    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public boolean contiene() {
        System.out.println("Ingrese el caracter");
        char caracter = leer.nextLine().charAt(0);
        boolean retorno = false;
        for (int i = 0; i < cd.getFraselong(); i++) {
            if (cd.getFrase().charAt(i)==caracter) {
                retorno = true;
            }
        }
        return retorno;
        
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
