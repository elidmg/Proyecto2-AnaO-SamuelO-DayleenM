/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author samue
 */
public class HashTable {
    final int AsciiReferencia = 65;
    ListaResumen[] Tabla;
    ListaAutor [] TablaAutor;
    ListaPC [] TablaPC;
            
    public HashTable(){
        this.Tabla = new ListaResumen[26];
        this.TablaAutor = new ListaAutor[26];
        this.TablaPC = new ListaPC[26];
    }
    public boolean agregarResumen(ClaseResumen Elemento){
        int letra = Elemento.getTitulo().charAt(0);
        return this.Tabla[letra-65].Agregar(Elemento);
    }
    public void agregarautor(ClaseResumen Elemento){
        for(Autor autor: Elemento.getAutores()){
        
            int letra = autor.getAutor().charAt(0);
            this.TablaAutor[letra-65].insertarFinal(autor);
        }
        
    }
    public void agregarPC(ClaseResumen Elemento){
        for(PalabraClave pc: Elemento.getPalabrasClaves()){
        
            int letra = pc.getPalabra().charAt(0);
            this.TablaPC[letra-65].insertarFinal(pc);
        }
        
    }
}
