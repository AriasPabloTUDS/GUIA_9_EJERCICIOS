/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Estudiante;
import java.lang.reflect.Array;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author Pablo
 */
public class EstudianteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("/N");

    //Metodo para vrear multilples estudiantes
    public Estudiante crearEstudiante(String nombre, double promedio) {
        return new Estudiante(nombre, promedio);
    }

    //Metodo para inicializar los alumnos que le pasemos como parametros
    //y pasarcelos al main para trabajar en fomrma de Array
    public Estudiante[] inicializarEstudiantes(String[] nombEstud, double[] promedEstud) {
        Estudiante[] arrayEstudiantes = new Estudiante[nombEstud.length];

        for (int i = 0; i < nombEstud.length; i++) {
            Estudiante estudiante = new Estudiante(nombEstud[i], promedEstud[i]);
            arrayEstudiantes[i] = estudiante;
        }
        return arrayEstudiantes;
    }

    //Metodo para mostrar promedio de alumnos de un curso recive un abjeto del tipo Array
    public void mostrarPromedios(Estudiante[] estudiantes, String ident) {
        System.out.println("    Promedios "+ident);
        for (Estudiante estudiante : estudiantes) {
            if (estudiante!=null) {
                System.out.println("Nombre Estudiante: " + estudiante.getNombre() + " - Promedio: " + estudiante.getPromedio());
            }
            
        }
    }
    
    //Metodo que solo retorna el promedio general del curso sin sout
    public double promedio(Estudiante[] estudiantes){
        double sumar = 0;
        int cantEstud = estudiantes.length;
        for (Estudiante estudiante : estudiantes) {
            sumar = sumar + estudiante.getPromedio();
        }
        return (sumar / cantEstud);
    }

    //Metodo para retornar un arreglo con los nombres de los alumnos que recibieron una
    //nota mayor al promedio del curso
    public Estudiante[] sobrePromedio(Estudiante[] es) {
        Estudiante[] arrayEstudiantes = new Estudiante[es.length];
        for (int i = 0; i < es.length; i++) {
            if (es[i].getPromedio() > promedio(es)) {
                 Estudiante estudiante = new Estudiante(es[i].getNombre(), es[i].getPromedio());
                arrayEstudiantes[i] = estudiante;
            }
        }
        return arrayEstudiantes;
    }


}
