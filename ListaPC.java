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
        if(isEmpty()){
            this.head = palabra;
            this.last = palabra;
        }
        else{
            this.last.setNext(palabra);
            this.last = palabra;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public PalabraClave getHead() {
        return head;
    }

    public PalabraClave getLast() {
        return last;
    }

    public void setLast(PalabraClave last) {
        this.last = last;
    }


    
    
    
    
    
    
    
}

    

