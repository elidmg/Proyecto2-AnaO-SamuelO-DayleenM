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
    }

    public boolean isEmpty(){
        return head == null;
    }
    
    public void insertarFinal(Autor autor){
        Autor newNode = new Autor(autor);
        if(isEmpty()){
            head = newNode;
        }
        else{
            Autor nodo = head;
            while(nodo.getNext() != null){
                nodo = nodo.getNext();
            }
            nodo.setNext(newNode);
        }
        size++;
    }

    public Autor getHead() {
        return head;
    }

    public void setHead(Autor head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Autor getLast() {
        return last;
    }

    public void setLast(Autor last) {
        this.last = last;
    }
    
    
    
    
    
    
    
}
