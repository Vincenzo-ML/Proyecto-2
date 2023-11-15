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
    private String tamaño;
    private String tipo;


    public Documentos(String Name, String tamaño, String tipo) {
        this.Name = Name;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public String getName() {
        return Name;
    }


    public void setName(String Name) {
        this.Name = Name;
    }


    public String gettamaño() {
        return tamaño;
    }

 
    public void settamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    public String gettipo() {
        return tipo;
    }

 
    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    
}
