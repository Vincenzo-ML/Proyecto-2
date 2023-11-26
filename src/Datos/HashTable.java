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

public class HashTable {
    
    private int size;
    public Lista[] tabla;
    
    public HashTable(int size){
        this.size = size;
        this.tabla = new Lista[size]; 
        
        for(int i= 0;i<size; i++){
            Lista temp = new Lista();
            this.tabla[i] = temp;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Lista[] getTabla() {
        return tabla;
    }

    public void setTabla(Lista[] tabla) {
        this.tabla = tabla;
    }
    
    private int HashFunction(String usuario){
        int hashCode = usuario.hashCode();
        return Math.abs(hashCode) % tabla.length; 
    }
            
    public void insert(Persona Persona){
        String persona = Persona.getName();
        int index = HashFunction(persona);
        tabla[index].insert(index,persona);  
    }
    
    
    public void delete(Persona Persona){
        String persona = Persona.getName();
        int index = HashFunction(persona);
        tabla[index].pop(index);
    }
    
    //esta malo esto
    public void search (Persona Persona){
        String persona = Persona.getName();
        int index = HashFunction(persona);
        tabla[index].pop(index);
    }
    
    public void printData() {
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Lista " + i + ":");
            tabla[i].print();
            System.out.println();
        }
    }
}
