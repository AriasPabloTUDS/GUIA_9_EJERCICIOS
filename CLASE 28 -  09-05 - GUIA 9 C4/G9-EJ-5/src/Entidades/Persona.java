/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Pablo
 */
public class Persona {
    private String nombre;
    private Date fNac;

    public Persona() {
    }

    public Persona(String nombre, Date fNac) {
        this.nombre = nombre;
        this.fNac = fNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNac() {
        return fNac;
    }

    public void setfNac(Date fNac) {
        this.fNac = fNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fNac=" + fNac + '}';
    }
    
    
}
