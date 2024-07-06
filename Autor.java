/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author Dayleen
 */
public class Autor {
    String autor;
    ClaseResumen perteneciente;
    Autor next;

    public Autor() {
        this.autor = null;
        this.perteneciente = null;
        this.next = null;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ClaseResumen getPerteneciente() {
        return perteneciente;
    }

    public void setPerteneciente(ClaseResumen perteneciente) {
        this.perteneciente = perteneciente;
    }

    public Autor getNext() {
        return next;
    }

    public void setNext(Autor next) {
        this.next = next;
    }
    
    
    
}
