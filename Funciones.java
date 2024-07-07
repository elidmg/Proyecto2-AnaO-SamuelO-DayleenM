/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Clases.ClaseResumen;
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
 * @return
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

    public String SeleccionarResumen() throws IOException{
        String resumen = ReadDoc();
        
        return resumen;
    }
    
    public String SeleccionarHistorial() throws IOException{
        String resumen = ReadDoc();
        
        return resumen;
        
    }
    public String FrecuenciaClave(String palabra, ClaseResumen resumen){
        int contador = 0;
        String cuerpo = resumen.getCuerpo().replace(",", "");
        cuerpo = cuerpo.replace(".", "");
        cuerpo = cuerpo.replace(";", "");
        cuerpo = cuerpo.replace(":", "");
        String[] ResumenSeparado = cuerpo.split(" ");
        String[] PalabraSeparada = palabra.split(" ");
        int aux  = 0;
        for (int i = 0; i<ResumenSeparado.length;i++){
            boolean [] verdad = new boolean [PalabraSeparada.length];
            if (PalabraSeparada[aux] == ResumenSeparado[i]){
                verdad[aux] = true;
                aux++;
                while(aux<PalabraSeparada.length){
                    if(PalabraSeparada[aux] == ResumenSeparado[i+aux]){
                        verdad[aux] = true;
                        aux++;
                    }
                    else{break;}
                }
                
            }
        if (verdad[verdad.length-1] == true){
        contador++;
        }
        
        
        }
        String completo = "La palabra (" + palabra + ") fue encontrada : " + Integer.toString(contador) + " veces.";
        return completo;
        }
    
    }
    
    



     