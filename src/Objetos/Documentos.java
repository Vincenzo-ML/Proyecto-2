/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;
/**
 *
 * @author Enzo
 */
public class Documentos {

    private String Name;
    private int tamaño;
    private String tipo;
    private Long Tiempo;


    public Documentos(String Name, int tamaño, String tipo, Long Tiempo) {
        this.Name = Name;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.Tiempo = null;
    }

    public String getName() {
        return Name;
    }


    public void setName(String Name) {
        this.Name = Name;
    }


    public int gettamaño() {
        return tamaño;
    }

 
    public void settamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public String gettipo() {
        return tipo;
    }

 
    public void settipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Long Gettime(){
        return Tiempo;
    }
    
    public void setTime(Long Tiempo){
        this.Tiempo = Tiempo;
    }
}
