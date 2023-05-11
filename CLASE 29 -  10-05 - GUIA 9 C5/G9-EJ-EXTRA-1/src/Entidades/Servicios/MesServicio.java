/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. 
A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, 
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje,
y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package Entidades.Servicios;

import Entidades.Mes;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class MesServicio {
    
    Scanner leer = new Scanner(System.in);
    Mes todosLosMeses = new Mes();
    Mes mesSecreto;
    
    public Mes inicializarMesSecretoAlAzar(){
        int aleatorio = (int)(Math.random()*12);
        
        String mesAleat;
        mesAleat = todosLosMeses.getMeses()[aleatorio];
        return mesSecreto = new Mes(mesAleat);
    }
    
    
    public void adivinaElMes(){
        System.out.println("Hola ¡vamos a jugar a adivinar el mes que estoy pensando!");
        
        boolean adivino = false;
        do {            
            System.out.println("Escribe el mes, veamos si adivinas");
            String mesUsuario = leer.next();
            if (mesSecreto.getMesSecreto().equalsIgnoreCase(mesUsuario)) {
                System.out.println("¡Adivinaste! "+mesSecreto.getMesSecreto()+" es el mes en el que pense ¡Felicitaciones!");
                adivino = true;
            } else System.out.println("Noo que mal, intenta otra vez");
        } while (!adivino);
    }
}
