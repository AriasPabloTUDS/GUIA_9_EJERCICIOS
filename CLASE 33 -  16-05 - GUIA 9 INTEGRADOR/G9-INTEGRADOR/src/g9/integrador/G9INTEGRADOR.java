/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9.integrador;

import Entidad.Estudiante;
import Entidad.Servicio.EstudianteServicio;
import java.lang.reflect.Array;

/**
 *
 * @author Pablo
 */
public class G9INTEGRADOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteServicio es = new EstudianteServicio();

//Manualmente definimos los datos de los estudiantes en dos vectores para los nombres y los promedios respectivamente
        String[] nombEstud = {"Pablo", "Eloy", "Fernanda", "Isabel", "Marco", "Clara", "Victos", "Veronica"};
        double[] promedEstud = {7.5, 9.5, 5.75, 8.10, 3.9, 8.95, 7.25, 9.75};

//Usamos metodo inicializarEstudiantes del EstudianteServicio para cargarle manualmente los datos de cada estudiante
        Estudiante[] estudiantes = es.inicializarEstudiantes(nombEstud, promedEstud);

//Usamos metodo de EstudianteServicio para mostrar el promedio de todo el curso        
        es.mostrarPromedios(estudiantes,"General del curso");

//Usamos un sout y el metodo promedio para mostrar por pantalla el promedio genera
        System.out.println("");
        System.out.println("Promedio general del curso: " + es.promedio(estudiantes));
        System.out.println("");

//Usamos el metodo sobrePromedio de EstudianteSrvicio para traer a una vaiable en el main los estudiantes
//cuyos promedios estan por encima del promedio del curso
        Estudiante[] conSP;
        conSP = es.sobrePromedio(estudiantes);

//Usamos metodo de EstudianteServicio para mostrar el los estudiantes con promedios superiores al promedio del curso
        es.mostrarPromedios(conSP,"superior al General");
        
        for (int i = 2; i <= 128; i*=2) {
            System.out.println("impresion ["+i+"]");
        }
    }

}
