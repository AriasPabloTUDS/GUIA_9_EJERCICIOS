/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, 
pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, 
quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor
que ingresó el usuario.
     */
    public Ahorcado crearjuego() {
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        String[] aux = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            aux[i] = palabra.substring(i, i + 1);
        }
        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        int jugadas = leer.nextInt();
        return new Ahorcado(aux, jugadas);
    }
// Inicializar un Vector parcial


    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
     */
    public int longitud(Ahorcado ah) {
        return ah.getPalabraMisteriosa().length;
    }

    /*
    Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la 
palabra o no. También informará si la letra estaba o no.
     */
    public void buscar(Ahorcado ah) {
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        String aux = "";
        
        for (int i = 0; i < longitud(ah); i++) {
            System.out.println(ah.getPalabraMisteriosa()[i]);
            System.out.println(aux.substring(i,i+1));
        }
        
        System.out.println("p "+aux);
//        if (ah.getPalabraMist().contains(letra)) {
//            System.out.println("La letra ''" + letra.toUpperCase() + "'' forma parte de la palabra");
//        } else {
//            System.out.println("la letra ''" + letra.toUpperCase() + "'' no esta en la palabra");
//        }
//        for (int i = 0; i < longitud(); i++) {
//                if (letra.equalsIgnoreCase(ah.getPalabraMisteriosa()[i])) {
//                    parcial[i] = ah.getPalabraMisteriosa()[i];
//                } 
//            }
    
    }

    /*
    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas
y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que,
cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public boolean encontradas() {

    }

    /*
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
     */
    public int intentos() {

    }
//Metodo inicializar parcial

    public String[] inicializarParcial() {

    }
//Metodo llenar parcial con *

    public void llenarParcial() {

    }

//Metodo mostrar parcial
    public void mostarParcial(String letra) {

    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando 
el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
     */
    public void juego() {
        boolean verif = false;
        crearjuego();
        longitud();
        inicializarParcial();
        llenarParcial();
        do {

            buscar();
            encontradas();
            mostarParcial(letra);
            if (intentos() == 0) {
                verif = true;
            }
            if (ah.getPalabraMist().length() == ah.getCantidadDeLetrasEncontradas()) {
                verif = true;
            }
        } while (!verif);
        if (ah.getJugadasMaximas() == 0) {
            System.out.println("ohh lo siento ¡perdiste!...");
        }
        if (ah.getPalabraMist().length() == ah.getCantidadDeLetrasEncontradas()) {
            System.out.println("Bien la palabra es " + ah.getPalabraMist().toUpperCase());
            System.out.println("¡ Felicitaciones GANASTE !");
        }

    }

}
