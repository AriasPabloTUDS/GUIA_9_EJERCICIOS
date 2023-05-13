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
public class AhorcadoServicioV2 {

    Scanner leer = new Scanner(System.in);
    Ahorcado ah = new Ahorcado();

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, 
pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, 
quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor
que ingresó el usuario.
     */
    public void crearjuego() {
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        int longitudPalabra = palabra.length();
        String[] vector = new String[longitudPalabra];
        for (int i = 0; i < longitudPalabra; i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        int jugadas = leer.nextInt();
        ah.setPalabraMisteriosa(vector);
        ah.setJugadasMaximas(jugadas);
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
     */
 /*
    Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la 
palabra o no. También informará si la letra estaba o no.
     */
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
