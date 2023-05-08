/*
 Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los 
cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor
vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos 
números. Crear una clase
 */
package Entidades;

/**
 *
 * @author Pablo
 */
public class ParDeNumeros {
    private double numero1;
    private double numero2;

    public ParDeNumeros() {
        numero1 = Math.random()*100;
        numero2 = Math.random()*100;
    }

    public ParDeNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
