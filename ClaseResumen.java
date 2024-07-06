/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author samue
 */
public class ClaseResumen {
    private String titulo;
    private String cuerpo;
    private PalabraClave [] PalabrasClaves;
    private Autor [] autores;
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
        String [] auxautores = cadena2.split(",");
        this.autores = new Autor [auxautores.length];
        int indice = 0;
        for (String autor : auxautores){
        this.autores[indice].setAutor(autor);
        this.autores[indice].setPerteneciente(this);
        indice++;
        }
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
    int indice2 = 0;
    for (String palabraclave : auxclave){
        this.PalabrasClaves[indice2].setPalabra(palabraclave);
        this.PalabrasClaves[indice2].setPerteneciente(this);
        indice2++;
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

    public PalabraClave [] getPalabrasClaves() {
        
        return this.PalabrasClaves;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public ClaseResumen getNext() {
        return Next;
    }
    

    
}
    

