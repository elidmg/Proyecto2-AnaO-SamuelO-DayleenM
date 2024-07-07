/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Indatech
 */
public class GlobalClass {
    ClaseResumen resumen;
    HashTable tablas;

    public GlobalClass(ClaseResumen resumensito, HashTable tablitas) {
        this.resumen = resumensito;
        this.tablas = tablitas;
    }

    public ClaseResumen getResumen() {
        return resumen;
    }

    public void setResumen(ClaseResumen resumen) {
        this.resumen = resumen;
    }

    public HashTable getTablas() {
        return tablas;
    }

    public void setTablas(HashTable tablas) {
        this.tablas = tablas;
    }
      
    
    
}
