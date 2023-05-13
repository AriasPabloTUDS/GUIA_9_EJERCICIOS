/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la 
información de cada curso. Para ello, A continuación, se 

Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en 
cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le 
asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos()
para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello,
se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a 
la semana que se repite el encuentro.

 */
package g9.ej.pkg6;

import Entidades.Curso;
import Entidades.Servicios.CursoServicio;

/**
 *
 * @author Pablo
 */
public class G9EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CursoServicio servicioCurso = new CursoServicio();
        
        servicioCurso.crearCurso();
        servicioCurso.mostrarCurso();
        servicioCurso.calcularGananciaSemanal();
        
        
    }
   
}
