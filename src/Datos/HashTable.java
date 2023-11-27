/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Objetos.*;
import Nodos.*;

public class HashTable {
    
    private int size;
    private int max;
    public Arreglo<Lista<NHash>> tabla;
    
    public HashTable(int max){
        this.size = 0;
        this.max = max;
        this.tabla = new Arreglo(max); 
        
        for(int i= 0;i<max; i++){
            Lista temp = new Lista();
            tabla.insert(temp);
        }
    }
    
    public void insert(NHash x) {
        int index = x.getKey().hashCode() % max;
        

        if (tabla.get(index) == null) {
            Lista<NHash> lista = new Lista();
            lista.append(x);
            tabla.replaceAtIndex(lista, index);
            
          
        } else {
            Lista<NHash> lista = tabla.get(index);
            lista.append(x);
            tabla.replaceAtIndex(lista, index);
            
             }
    }
    
    public void deleteByPerson(String key) {
        int index = key.hashCode() % max;

        if (tabla.get(index) != null) {
            Lista<NHash> lista = tabla.get(index);
            for (int i= 0;i<lista.getSize(); i++){
                NHash x = lista.get(i);
                if(x.getElementhash().getName().equals(key)){
                    lista.pop(i);
                    tabla.replaceAtIndex(lista, index);
                }
            }  
        }
    }
    
    
    public Lista<Documentos> FindAllDocbyPerson(String key){
        int index = key.hashCode() % max;
        Lista<Documentos> Ls = new Lista<>();
        
        if (tabla.get(index) != null) {
            Lista<NHash> lista = tabla.get(index);
            for (int i= 0;i<lista.getSize(); i++){
                NHash x = lista.get(i);
                if(x.getElementhash().getName().equals(key)){
                    Ls.append(x.getElementhash());
                }
            }  
        }
        return Ls;
    }
    
    
    public void deleteByTime(Long T, String key) {
        int index = key.hashCode() % max;

        if (tabla.get(index) != null) {
            Lista<NHash> lista = tabla.get(index);
            for (int i= 0;i<lista.getSize(); i++){
                NHash x = lista.get(i);
                if(x.getTime() == T){
                    lista.pop(i);
                    tabla.replaceAtIndex(lista, index);
                }
            }  
        }
    }
    
    public Long FindTime(String key, Documentos sdx){
        int index = key.hashCode() % max;
        Long xx = null;
        
        if (tabla.get(index) != null) {
            Lista<NHash> lista = tabla.get(index);
            for (int i= 0;i<lista.getSize(); i++){
                NHash x = lista.get(i);
                if(x.getElementhash().equals(sdx)){
                   xx = x.getTime();
                }
            }  
        }
        return xx;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Arreglo getTabla() {
        return tabla;
    }

    public void setTabla(Arreglo tabla) {
        this.tabla = tabla;
    }
    
    public void printData() {
        for (int i = 0; i < tabla.getTmax(); i++) {
            System.out.println("Lista " + i + ":");
            Lista x = tabla.get(i);
            
            for(int yy = 0; yy < x.getSize(); yy++) {          
                System.out.println(x.get(i));
            }
        }
    }
    
    public void deleateafterprint(NMonticulo x){
        Documentos doc = x.getElementmont();
       
        for(int i= 0;i<tabla.getSize(); i++){
            Lista<NHash> lista = tabla.get(i);
            for(int ii= 0;ii<lista.getSize(); ii++){
                if(lista.get(ii).getElementhash() == doc){
                    lista.pop(ii);
                }
            }
        }
    }
}
  

