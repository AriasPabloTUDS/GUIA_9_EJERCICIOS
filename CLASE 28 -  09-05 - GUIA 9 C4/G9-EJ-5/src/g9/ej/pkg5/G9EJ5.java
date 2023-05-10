/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9.ej.pkg5;

import Entidades.Servicios.PersonaServicio;

/**
 *
 * @author Pablo
 */
public class G9EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaServicio ps = new PersonaServicio();
        ps.crearPersona();
        ps.calcularEdad();
        System.out.println(ps.menorQue(49));
        ps.mostrarPersona();
    }
    
}
