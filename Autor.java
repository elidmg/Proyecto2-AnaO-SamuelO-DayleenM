/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Dayleen
 */
public class Autor {
    String autor;
    Autor next;
    ListaResumen perteneciente = new ListaResumen();

    public Autor(String autorito) {
        this.autor = autorito;
        
        this.next = null;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ListaResumen getPerteneciente() {
        return perteneciente;
    }

    public void AgregarPerteneciente(ClaseResumen perteneciente) {
        this.perteneciente.Agregar(perteneciente);
    }

   

    public Autor getNext() {
        return next;
    }

    public void setNext(Autor next) {
        this.next = next;
    }
    
    
    
}
