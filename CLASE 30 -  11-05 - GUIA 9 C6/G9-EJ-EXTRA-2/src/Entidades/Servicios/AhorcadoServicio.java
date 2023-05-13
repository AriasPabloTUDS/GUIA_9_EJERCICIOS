/*
Definir los siguientes métodos en AhorcadoService:

 */
package Entidades.Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);
    Ahorcado ah;

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, 
pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, 
quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor
que ingresó el usuario.
     */
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra: ");
        String palabra = leer.next();
        int cantDeLetras = palabra.length();
        String[] palabraMisteriosa = new String[cantDeLetras];
        for (int i = 0; i < palabra.length(); i++) {
            palabraMisteriosa[i] = palabra.substring(i, i + 1);
        }
        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        int jugadasMax = leer.nextInt();
        return ah = new Ahorcado(palabraMisteriosa, jugadasMax);
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
     */
    public void longitud() {
        System.out.println("La longitud de la palabra a encontrar es de: " + ah.getPalabraMisteriosa().length + " letras.");
        //return ah.getPalabraMisteriosa().length;
    }

    /*
    Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la 
palabra o no. También informará si la letra estaba o no.
     */
    public void buscar() {
        int intentos = 0;
        int aciertos = 0;
        int fallos = 0;
        boolean verif = false;

        String[] parcial = new String[ah.getPalabraMisteriosa().length];
        do {
            System.out.println("tienes " + (ah.getJugadasMaximas() - intentos) + " intentos");
            intentos++;
            System.out.println("Ingrese una letra: ");
            String letra = leer.next();
            for (int i = 0; i < ah.getPalabraMisteriosa().length; i++) {
                if (letra.equalsIgnoreCase(ah.getPalabraMisteriosa()[i])) {
                    ah.setCantidadDeLetrasEncontradas(ah.getCantidadDeLetrasEncontradas() + 1);
                    System.out.println("");
                    System.out.println("¡Felicitaciones! la letra forma parte de la palabra");
                    parcial[i] = ah.getPalabraMisteriosa()[i];
                } 
            }
//Imprimir palabra parcial
            for (int i = 0; i < ah.getPalabraMisteriosa().length; i++) {
                if (parcial[i] == null) {
                    System.out.print("_");
                    fallos++;
                } else {
                    System.out.print(parcial[i]);
                    aciertos++;
                }
            }
            System.out.println("");
          
//Comparar el parcial con la palabra misteriosa
if (ah.getCantidadDeLetrasEncontradas()==
        ah.getPalabraMisteriosa().length) {
                verif = true;
            }
//Verificar los intentos máximos alcanzados
            if (ah.getJugadasMaximas() == intentos) {
                verif = true;
            }
        } while (!verif);
//Mandar mensaje según resultados        
        if (ah.getCantidadDeLetrasEncontradas()==
                ah.getPalabraMisteriosa().length) {
            System.out.println(" ¡GANASTE! ");
        }else System.out.println("¡PERDISTE!");

    }

    /*
    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas
y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que,
cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
     */
 /*
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
     */
 /*
    Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando 
el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
     */
}
