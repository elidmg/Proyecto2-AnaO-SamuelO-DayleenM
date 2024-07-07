/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Dayleen
 */
public class ListaAutor {
    private Autor head; 
    private int size;
    private Autor last;

    public ListaAutor() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }
    
    public void insertarFinal(Autor autor){
        if(isEmpty()){
            this.head = autor;
            this.last = autor;
        }
        else{
            this.last.setNext(autor);
            this.last = autor;
        }
        size++;
    }

    
    
    public Autor getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public Autor getLast() {
        return last;
    }

    
    
    
    
    
    
}
