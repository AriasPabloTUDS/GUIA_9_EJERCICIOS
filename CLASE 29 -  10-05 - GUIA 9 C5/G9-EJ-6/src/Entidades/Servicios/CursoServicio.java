/*


Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello,
se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a 
la semana que se repite el encuentro.
 */
package Entidades.Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class CursoServicio {
     Scanner leer = new Scanner(System.in);
     private Curso crso;
    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en 
cada repetición que se ingrese el nombre de cada alumno.
    */
    
    public String[] cargarAlumnos(String nombreCurso){
        String[] alums = new String[5];
        System.out.println("Carga de alumnos a "+nombreCurso);
        for (int i = 0; i < alums.length; i++) {
            System.out.println("Ingrese el nombre del alumno: "+"["+(i+1)+"]");
            String alum = leer.next();
            alums[i] = alum;
        }
        return alums;
    }
    
    /*
    Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le 
asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos()
para asignarle valor al atributo alumnos
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadHorasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];
    */
    public Curso crearCurso(){
        System.out.println("Crear curso");
        System.out.print("Ingrese el nombre del Curso: ");
        String nombreCurso = leer.next();
        System.out.print("Ingrese la cantidad de horas por dia: ");
        int cantidadHorasPorDia = leer.nextInt();
        System.out.print("Ingrese la cantidad de horas por semana: ");
        int cantidadHorasPorSemana = leer.nextInt();
        System.out.print("Ingrese el turno: ");
        String turno = leer.next();
        System.out.print("Ingrese el precio por hora: ");
        int precioPorHora = leer.nextInt();
        String[] alums = new String[5];
        alums = cargarAlumnos(nombreCurso);
        return crso = new Curso(nombreCurso, cantidadHorasPorDia, cantidadHorasPorSemana, turno, precioPorHora,alums);
    }
    
    public void mostrarCurso(){
        System.out.println("Curso "+crso.getNombreCurso());
        System.out.println("Cantidad de horas por dia: "+crso.getCantidadHorasPorDia());
        System.out.println("Cantidad de horas por semana: "+crso.getCantidadHorasPorSemana());
        System.out.println("Turno: "+crso.getTurno());
        System.out.println("Precio por hora: "+crso.getPrecioPorHora());
        System.out.println("Alumnos: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno "+"["+(i+1)+"]: "+crso.getAlumnos()[i]);
            System.out.println("");
        }
    }
    
    
    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello,
se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a 
la semana que se repite el encuentro.
    */
    public void calcularGananciaSemanal(){
        System.out.println("La ganancia semanal para el curso "+crso.getNombreCurso()+" es de $: "+
                crso.getCantidadHorasPorSemana()*crso.getPrecioPorHora()*crso.getAlumnos().length);
    }

 
}
