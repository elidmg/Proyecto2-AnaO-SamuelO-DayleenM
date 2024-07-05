/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Dayleen
 */
public class ListaPC {
    private PalabraClave head; 
    private int size;
    private PalabraClave last;

    public ListaPC() {
        this.head = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return head == null;
    }
    
    public void insertarFinal(PalabraClave palabra){
        PalabraClave newNode = new PalabraClave(palabra);
        if(isEmpty()){
            head = newNode;
        }
        else{
            PalabraClave nodo = head;
            while(nodo.getNext() != null){
                nodo = nodo.getNext();
            }
            nodo.setNext(newNode);
        }
        size++;
    }

    public PalabraClave getHead() {
        return head;
    }

    public void setHead(PalabraClave head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PalabraClave getLast() {
        return last;
    }

    public void setLast(PalabraClave last) {
        this.last = last;
    }
    
    
    
    
    
    
    
}

    

