/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author Pablo
 */
public class ArregloServicio {
    
    
    public void inicializarA(double [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random()*100;
        }
    }
    
    public void mostrarArreglo(double [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Dato "+"["+i+"] = "+arreglo[i]);
        }
    }
    
     public void inicializarB(double [] arreglo){
        Arrays.fill(arreglo, 99.8);
    }
    
    public void ordenar(double[] arreglo){
        Arrays.sort(arreglo);
    }
}
