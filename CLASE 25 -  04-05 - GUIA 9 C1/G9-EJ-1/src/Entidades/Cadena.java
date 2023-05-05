/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos
una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente.
Agregar getters y setters. El constructor con frase como atributo debe setear la 
longitud de la frase de manera automática.
 */
package Entidades;

/**
 *
 * @author Pablo
 */
public class Cadena {
    private String frase;
    private int fraselong;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        fraselong = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getFraselong() {
        return fraselong;
    }

    public void setFraselong(int fraselong) {
        this.fraselong = fraselong;
    }

    
    
    
    
}
