/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author samue
 */
public class PalabraClave {
    String palabra;
    ClaseResumen perteneciente;
    PalabraClave next;

    public PalabraClave(PalabraClave palabra) {
        this.palabra = null;
        this.perteneciente = null;
        this.next = null;
    }

    public String getPalabra() {
        return palabra;
    }

    public ClaseResumen getPerteneciente() {
        return perteneciente;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setPerteneciente(ClaseResumen perteneciente) {
        this.perteneciente = perteneciente;
    }

    public void setNext(PalabraClave next) {
        this.next = next;
    }

    public PalabraClave getNext() {
        return next;
    }
    
}
