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
    
    ListaResumen[] Tabla;
    ListaAutor [] TablaAutor;
    ListaPC [] TablaPC;
    int sizeTablaInves;
    int sizeTablaPC;
    int sizeTablaAutor;
    
            
    public HashTable(){
        this.Tabla = new ListaResumen[26];
        this.TablaAutor = new ListaAutor[26];
        this.TablaPC = new ListaPC[26];
        this.sizeTablaInves = 0;
        this.sizeTablaPC = 0;
        this.sizeTablaAutor = 0;
    }
    public boolean agregarResumen(ClaseResumen Elemento){
        int letra = Elemento.getTitulo().charAt(0);
        if(this.Tabla[letra-65] == null){
                this.Tabla[letra-65] = new ListaResumen();
                if(this.Tabla[letra-65].Agregar(Elemento)){
                    sizeTablaInves++;
                return true;
                }
            }
            else{
                if(this.Tabla[letra-65].Agregar(Elemento)){
                sizeTablaInves++;
                return true;}
                //se agrego
            }
        return false; //ya esta en la inves
    }
    
    public Autor[] agregarautor(ClaseResumen Elemento, String[] autorsito){
        Autor[] autores = new Autor[autorsito.length];
        int indice = 0;
        for(String autor: autorsito){      
            int letra = autor.charAt(0);
            if(this.TablaAutor[letra-65] == null){               
                this.TablaAutor[letra-65] = new ListaAutor();
            this.TablaAutor[letra-65].insertarFinal(new Autor(autor));
            this.TablaAutor[letra-65].getHead().AgregarPerteneciente(Elemento);
            sizeTablaAutor++;
            autores[indice] = this.TablaAutor[letra - 65].getHead();
            indice++;
            
            }
            else{
                Autor primero = this.TablaAutor[letra - 65].getHead();
                for(int x = 0; x < this.TablaAutor[letra-65].getSize(); x++){
                    if(autor == primero.getAutor()){
                        primero.AgregarPerteneciente(Elemento);
                        autores[indice] = primero;
                        indice++;
                    }
                    else{
                        primero = primero.getNext();
                    }
                }
                this.TablaAutor[letra-65].insertarFinal(new Autor(autor));
                this.TablaAutor[letra-65].getLast().AgregarPerteneciente(Elemento);
                sizeTablaAutor++;
                autores[indice] = this.TablaAutor[letra-65].getLast();
                indice++;
            }
            
        }
        return autores;
    }
    public void agregarPC(ClaseResumen Elemento){
        for(PalabraClave pc: Elemento.getPalabrasClaves()){
            int letra = pc.getPalabra().toLowerCase().charAt(0);
            if(this.TablaPC[letra-97] == null){
            this.TablaPC[letra-97] = new ListaPC();
            this.TablaPC[letra-97].insertarFinal(pc);
            sizeTablaPC++;
            }
            else{
                this.TablaPC[letra-97].insertarFinal(pc);
                sizeTablaPC++;
            }
            
        }
        
    }
    
    public ListaAutor buscarautor(String autor){
        ListaAutor encontradas = new ListaAutor();
        int letra = autor.charAt(0);
        ListaAutor ubicacion = this.TablaAutor[letra-65];
        if(ubicacion != null){
        Autor auxiliar = ubicacion.getHead();
        for (int i = 0; i<ubicacion.getSize(); i++ ){
            if (autor.equals(auxiliar.getAutor())){
               Autor introducir = new Autor(auxiliar.getAutor());
               ClaseResumen pertenecienteaux = auxiliar.getPerteneciente().getFirst();
               for(int xy = 0 ; xy<auxiliar.getPerteneciente().getSize(); xy++){
                   introducir.AgregarPerteneciente(pertenecienteaux);
               }               
                encontradas.insertarFinal(introducir);
                auxiliar = auxiliar.getNext();
                }
            else{
            auxiliar = auxiliar.getNext();}
            }}
        if(!encontradas.isEmpty()){
        return encontradas;
        }
        else{
            return null;
        }
    }

    public ListaPC buscarPC(String palabra){
        ListaPC encontradas = new ListaPC();
        int letra = palabra.charAt(0);
        ListaPC ubicacion = this.TablaPC[letra-97];
        if(ubicacion != null){
        PalabraClave auxiliar = ubicacion.getHead();
        for (int i = 0; i<ubicacion.getSize(); i++ ){
            if (palabra.equals(auxiliar.getPalabra())){
               PalabraClave introducir = new PalabraClave(auxiliar.getPalabra(), auxiliar.getPerteneciente());
               
                encontradas.insertarFinal(introducir);
                auxiliar = auxiliar.getNext();
                }
            else{
            auxiliar = auxiliar.getNext();}
            }}
        if(!encontradas.isEmpty()){
        return encontradas;
        }
        else{
            return null;
        }
    }


    public ListaResumen[] getTabla() {
        return Tabla;
    }

    public ListaAutor[] getTablaAutor() {
        return TablaAutor;
    }

    public ListaPC[] getTablaPC() {
        return TablaPC;
    }

    public int getSizeTablaInves() {
        return sizeTablaInves;
    }

    public int getSizeTablaPC() {
        return sizeTablaPC;
    }

    public int getSizeTablaAutor() {
        return sizeTablaAutor;
    }
    
}
