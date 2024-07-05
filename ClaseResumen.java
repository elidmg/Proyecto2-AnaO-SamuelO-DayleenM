/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hash;

/**
 *
 * @author samue
 */
public class ClaseResumen {
    String titulo;
    String cuerpo;
    String [] PalabrasClaves;
    String [] autores;
    ClaseResumen Next;

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
    this.autores = ArrayAux[1].split(",");
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
        return PalabrasClaves;
    }

    public String[] getAutores() {
        return autores;
    }

    public ClaseResumen getNext() {
        return Next;
    }
    

    
}
    

