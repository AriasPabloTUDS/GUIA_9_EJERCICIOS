/*



 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class FechaServicio {

    Scanner leer = new Scanner(System.in);

    /* Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro 
a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     */
    public Date fechaNacimiento() {
        System.out.println("Crear Fecha de nacimiento");
        System.out.print("Ingrese el día: ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("Ingrese año: ");
        int anio = leer.nextInt();
        return new Date(anio-1900, mes-1, dia);
        
    }

    /*
    Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. 
Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
     */
    public Date fechaActual(){
        Date fechaActual = new  Date();
        return fechaActual;
    }
    
 /*
    Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
     */
    public int diferencia(Date fN , Date fA){
        int anio = fA.getYear() - fN.getYear();
        return anio;
        
    }
}
