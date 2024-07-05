/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author samue
 */
public class ListaResumen {
    ClaseResumen first;
    ClaseResumen last;
    int Size = 0;

    public ListaResumen() {
        this.first = null;
        this.last = null;
    }
    public boolean Agregar(ClaseResumen elemento){
        if (this.first==null){
            this.first = elemento;
            this.last = elemento;
                    this.Size++;
                    return true;
        
        }
        else{
            ClaseResumen aux = this.first; 
            if(elemento.getTitulo() == aux.getTitulo()){return false;}
            if(elemento.getTitulo().charAt(1)< aux.getTitulo().charAt(1) ){
                this.first = elemento;
                elemento.setNext(aux);
                        this.Size++;

                return true;
                
            }
            else if(elemento.getTitulo().charAt(1) == aux.getTitulo().charAt(1) ){
                if(elemento.getTitulo().charAt(2)< aux.getTitulo().charAt(2) ){
                this.first = elemento;
                elemento.setNext(aux);
                        this.Size++;

                                return true;

            }
                else {
                if(this.last == this.first){
                    this.first.setNext(elemento);
                    this.last = elemento;
                            this.Size++;

                                    return true;

                }
                else{
                ClaseResumen aux2 = this.first.getNext();
                this.first.setNext(elemento);
                elemento.setNext(aux2);
                        this.Size++;

                                return true;

                }
                }
            }
            ClaseResumen aux3 = aux.getNext();
        for (int i = 1; i<this.Size; i++){
            if(elemento.getTitulo() == aux3.getTitulo()){return false;}
            if(elemento.getTitulo().charAt(1)< aux3.getTitulo().charAt(1) ){
                aux.setNext(elemento);
                elemento.setNext(aux3);
                        this.Size++;

                                return true;

            }
            else if(elemento.getTitulo().charAt(1) == aux3.getTitulo().charAt(1) ){
                if(elemento.getTitulo().charAt(2)< aux3.getTitulo().charAt(2) ){
                aux.setNext(elemento);
                elemento.setNext(aux3);
                        this.Size++;

                                return true;

            }
                else {
                    if(aux3.getNext() == null){
                        aux3.setNext(elemento);
                                this.Size++;

                        return true;
                    }
                aux = aux3;
                aux3 = aux.getNext();
                aux.setNext(elemento);
                elemento.setNext(aux3);
                        this.Size++;

                return true;
                }
            }
        aux = aux.getNext();
        aux3 = aux3.getNext();
        
        }
        
        }
        this.last.setNext(elemento);
        this.last = elemento;
                this.Size++;

        return true;
    }
    
}
