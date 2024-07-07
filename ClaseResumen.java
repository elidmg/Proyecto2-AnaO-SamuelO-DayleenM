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
    private Autor[] autores;
    private ClaseResumen Next;
    

    public ClaseResumen(String resumen, HashTable tablita) {
        this.Next = null;
        String[] resumenSeparado = resumen.split("\n");
        int i = 0;
        String cadena = "";
        while(true){
        String[] aux = resumenSeparado[i].split("");
        cadena += resumenSeparado[i];
        if (aux[aux.length-1].contains(".")){
            this.titulo = cadena;
            break;
        }
        else{
        i++;
        }
        }
        String cadena2 = "";
      i++;
      if(resumenSeparado[i].equals("Autores")){
                i++;
        while( !resumenSeparado[i].equals("Resumen") ){
            cadena2 += resumenSeparado[i] + ",";
            i++;
            }
        
        }
        cadena2+=".";
        cadena2 = cadena2.replace(",.", "");
      
        String [] auxautores = cadena2.split(",");
        
        
        
            this.autores=tablita.agregarautor(this,auxautores);
            
       
        i++;
        this.cuerpo = resumenSeparado[i];
        i++;
        
        String cadena3 = "";
        while(true){
        String[] aux50 = resumenSeparado[i].split("");
        cadena3 += resumenSeparado[i];
        if (".".equals(aux50[aux50.length-1])){
            break;
        
        }
        i++;
        }
    
    cadena3 = cadena3.replace(".", "");
    String [] ArrayAux = cadena3.split(": ");
    String[] auxclave= ArrayAux[1].split(",");
    for(int xy = 1; xy < auxclave.length; xy++){
    auxclave[xy] = auxclave[xy].replaceFirst(" ", "");
    
    }
    this.PalabrasClaves = new PalabraClave[auxclave.length];
    int indice2 = 0;
    for (String palabraclave : auxclave){
        this.PalabrasClaves[indice2] = new PalabraClave(palabraclave.toLowerCase(), this);
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
    

