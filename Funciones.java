/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2.dayleenm.samuelo.anao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author ani
 */
public class Funciones {
    /**ReadDoc
 * Funcion para leer el archivo de texto 
 * 
 * @return
 * @throws FileNotFoundException
 * @throws IOException 
 * @return Cadena String con todo lo que tiene el archivo
 */
    

    public String ReadDoc() throws FileNotFoundException, IOException{
        String line = "";
        String Cadena = "";
        
        javax.swing.JFileChooser jfc = new javax.swing.JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Select txt");
	jfc.setAcceptAllFileFilterUsed(false);
	FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo texto", "txt");
	jfc.addChoosableFileFilter(filter);

	int Value = jfc.showOpenDialog(null);
		

	if (Value == javax.swing.JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();          
        
            BufferedReader in = new BufferedReader(new FileReader(file));
            while ((line = in.readLine()) != null) {
               Cadena += line;
               Cadena += "\n";
                
	}
    }
        return Cadena;
    }
    
    public String SeleccionarResumen(String historial) throws IOException{
        String [] Historial= historial.split("\n");
        String resumen = ReadDoc();
        String []resumenPartes = resumen.split("\n");
        for(int i= 0; i<Historial.length;i++){
            String[] año= Historial[i].split(",");
            if (resumenPartes [0] == año[0]){
                return "";
               
            }
        }   
        return resumen;
        
    }
    
    public String SeleccionarHistorial() throws IOException{
        String resumen = ReadDoc();
        
        return resumen;
        
    }
    
    
}


     