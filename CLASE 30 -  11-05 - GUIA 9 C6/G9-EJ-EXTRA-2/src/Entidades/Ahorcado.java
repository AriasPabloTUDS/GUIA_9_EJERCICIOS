/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con 
la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
 */
package Entidades;

/**
 *
 * @author Pablo
 */
public class Ahorcado {
    private String[] palabraMisteriosa;
    private int cantidadDeLetrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraMisteriosa, int jugadasMaximas) {
        this.palabraMisteriosa = palabraMisteriosa;
        this.jugadasMaximas = jugadasMaximas;
    }
    

    public Ahorcado(String[] palabraMisteriosa, int cantidadDeLetrasEncontradas, int jugadasMaximas) {
        this.palabraMisteriosa = palabraMisteriosa;
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }
    

    public String[] getPalabraMisteriosa() {
        return palabraMisteriosa;
    }

    public void setPalabraMisteriosa(String[] palabraMisteriosa) {
        this.palabraMisteriosa = palabraMisteriosa;
    }

    public int getCantidadDeLetrasEncontradas() {
        return cantidadDeLetrasEncontradas;
    }

    public void setCantidadDeLetrasEncontradas(int cantidadDeLetrasEncontradas) {
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }



    @Override
    public String toString() {
        return "Ahorcado{" + "palabraMisteriosa=" + palabraMisteriosa + ", cantidadDeLetrasEncontradas=" + cantidadDeLetrasEncontradas + ", jugadasMaximas=" + jugadasMaximas + '}';
    }
    
    
}
