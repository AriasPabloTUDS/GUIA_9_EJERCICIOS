/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class Estudiante {
    private String nombre;
    private double promedio;

    public Estudiante() {
    }

    public Estudiante(String nombe, double nota) {
        this.nombre = nombe;
        this.promedio = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre= " + nombre + ", promedio = " + promedio + '}';
    }
    
    
}
