/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author samue
 */
public class HashTable {
    final int AsciiReferencia = 65;
    ListaResumen[] Tabla;
    
    public HashTable(){
        this.Tabla = new ListaResumen[26];
    }
    public boolean agregar(ClaseResumen Elemento){
        int letra = Elemento.getTitulo().charAt(0);
        return this.Tabla[letra-65].Agregar(Elemento);
    }
}
