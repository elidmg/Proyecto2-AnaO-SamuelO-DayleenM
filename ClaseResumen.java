/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author samue
 */
public class ClaseResumen {
    private String titulo;
    private String cuerpo;
    private PalabraClave [] PalabrasClaves;
    private String [] autores;
    private ClaseResumen Next;

    public ClaseResumen(String resumen) {
        this.Next = null;
        String[] resumenSeparado = resumen.split("\n");
        int i = 0;
        String cadena = "";
        while(true){
        String[] aux = resumenSeparado[i].split("");
        cadena += resumenSeparado[i];
        if (aux[aux.length-1] == "."){
            this.titulo = cadena;
            break;
        }
        else{
        i++;
        }
}
        String cadena2 = "";
        for(i +=1; i<resumenSeparado.length; i++){
            if(resumenSeparado[i]!="AUTORES" & resumenSeparado[i]!= ""){
                if(resumenSeparado[i] == "Resumen"){
                break;
                }
            cadena2 += resumenSeparado[i] + ",";
            }
        
        }
        cadena2+=".";
        cadena2 = cadena2.replace(",.", "");
        this.autores = cadena2.split(",");
        i++;
        this.cuerpo = "";
        while(true){
            if(resumenSeparado[i] == "" ){
                i++;
                break;
            }
            this.cuerpo += resumenSeparado[i];
            i++;

        }
        
        
        String cadena3 = "";
        while(true){
        String[] aux = resumenSeparado[i].split("");
        cadena3 += resumenSeparado[i];
        if (aux[aux.length-1] == "."){
            break;
        
        }
        i++;
        }
    
    cadena3 = cadena3.replace(".", "");
    String [] ArrayAux = cadena3.split(": ");
    String[] auxclave= ArrayAux[1].split(",");
    this.PalabrasClaves = new PalabraClave[auxclave.length];
    int indice = 0;
    for (String palabraclave : auxclave){
        this.PalabrasClaves[indice].setPalabra(palabraclave);
        this.PalabrasClaves[indice].setPerteneciente(this);
        indice++;
    }
    
    }
    public void setNext(ClaseResumen Next) {
        this.Next = Next;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String[] getPalabrasClaves() {
        String[] palabrass = new String[this.PalabrasClaves.length];
        for (int i = 0; i<palabrass.length; i++){
            palabrass[i] = this.PalabrasClaves[i].getPalabra();
        }
        return palabrass;
    }

    public String[] getAutores() {
        return autores;
    }

    public ClaseResumen getNext() {
        return Next;
    }
    

    
}
    

