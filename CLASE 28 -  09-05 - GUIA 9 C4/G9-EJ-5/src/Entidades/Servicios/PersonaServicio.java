
package Entidades.Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    private Persona pers = crearPersona();
    
//    Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Crear Fecha de nacimiento");
        System.out.print("Ingrese el día: ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("Ingrese año: ");
        int anio = leer.nextInt();
        Date fNac = new Date(anio-1900, mes-1, dia);
        return new Persona(nombre, fNac);
    }
//    Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    
    public void calcularEdad(){
        Date fechaAct = new Date();
        int anio = fechaAct.getYear() - pers.getfNac().getYear();
        System.out.println("La edad de "+pers.getNombre()+" es "+anio+" año/s");
        
    }
    
//    Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad 
//    consultada o false en caso contrario.
    
    public boolean menorQue(int edad){
        return pers.getfNac().getYear() < edad;
    }
    
//    Método mostrarPersona que muestra la información de la persona deseada.
    public void mostrarPersona(){
        System.out.println(pers);
    }
    
}
