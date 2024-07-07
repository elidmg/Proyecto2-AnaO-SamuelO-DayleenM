/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.*;

/**
 *
 * @author samue
 */
public class LeerHistorial {
    File archivoescribir;
    FileReader archivoleer;

    public LeerHistorial() throws FileNotFoundException {
        this.archivoleer = new FileReader("Resumenes.txt");
        this.archivoescribir = new File("Resumenes.txt");
    }
    public String[] leerarchivo() throws IOException{
        BufferedReader cargar = new BufferedReader(this.archivoleer);
        String infoaux = "";
        while(cargar.readLine()!= null){
            infoaux += cargar.readLine();
        }
        
        String [] info = infoaux.split("\nFIN_RESUMEN");
        return info;
    }
    public void guardarhistorial(HashTable Tabla) throws IOException{
        ListaResumen[] Datos = Tabla.getTabla();
        String guardado = "";
        for (ListaResumen resumenes:Datos){
            if (resumenes.getFirst()!=null){
                ClaseResumen primero = resumenes.getFirst();
                for (int x=0; x<resumenes.getSize();x++){
                    guardado+= primero.getTitulo() + "\nAutores\n" ;
                    for (Autor autor: primero.getAutores()){
                        guardado+= autor.getAutor() + "\n";                    
                    }
                    guardado +="Resumen\n";
                    guardado +=primero.getCuerpo() + "\nPalabras Claves: ";
                    for(PalabraClave pc:primero.getPalabrasClaves()){
                        if(pc == primero.getPalabrasClaves()[primero.getPalabrasClaves().length-1]){
                        guardado += pc.getPalabra()+".";
                        }
                        else{
                        guardado+= pc.getPalabra();
                        }
                    }
                guardado+= "\nFIN_RESUMEN";
                primero= primero.getNext();
                }
            
            }
        
        }
        try{FileWriter escribir = new FileWriter(this.archivoescribir); 
        escribir.write(guardado);}
        catch(IOException ex){
            this.archivoescribir.createNewFile();
            FileWriter escribir = new FileWriter(this.archivoescribir); 
            escribir.write(guardado);
        }
        
    }
}
