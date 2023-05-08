/*
ParDeNumerosService, en el paquete Servicios, que deberá además implementar
los siguientes métodos:
 */
package Entidades.Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author Pablo
 */
public class ParDeNumeroServicio {
private ParDeNumeros pdn;

    public ParDeNumeros crearParDeNumeros(){
        return pdn = new ParDeNumeros();
        
    }
    /*
    Método mostrarValores que muestra cuáles son los dos números guardados.
    */
    public void mostrarValores(){
        System.out.println("Valor del número 1= "+pdn.getNumero1());
        System.out.println("Valor del número 2= "+pdn.getNumero2());
    }
    
    /*
    Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    */
    public void devolverMayor(){
        System.out.println("el número mayor es: "+Math.max(pdn.getNumero1(), pdn.getNumero2()));
    }
    
    /*
    Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al
menor número. Previamente se deben redondear ambos valores.
    */
    public void calcularPotencia(){
        double mayor = Math.round(Math.max(pdn.getNumero1(), pdn.getNumero2()));
        double menor = Math.round(Math.min(pdn.getNumero1(), pdn.getNumero2()));
        System.out.println(mayor);
        System.out.println(menor);
        System.out.println("La potencia del mayor valor elevada al menor valor es: "+Math.pow(mayor, menor));
}
    
    /*
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de
calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */

    public void calcularRaiz(){
        double menor = Math.abs(Math.min(pdn.getNumero1(), pdn.getNumero2()));
        System.out.println(menor);
        System.out.println("La raiz cuadrada del menor valor es: "+Math.sqrt(menor));
    }
    
    
}
