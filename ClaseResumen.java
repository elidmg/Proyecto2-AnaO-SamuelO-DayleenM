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

    public ClaseResumen(String resumen) {
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
        break;
        }
        this.cuerpo += resumenSeparado[i];
        i++;
        
        }
        
        //Remplazar ": " por caracteres largos cualquiera, hacer un .split de esos caracteres y quedarme solo con el segundo elemento, finalmente hacer un .split de ",".
    
    
    
    }



}
    

