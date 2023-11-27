/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;
import Datos.Lista;


/**
 *
 * @author diego
 */
public class Persona {
    private String name;
    private String prioridad;
    private Lista<Documentos> documentos = new Lista<> ();

    public Persona() {
    }
    
    public Persona(String name, String prioridad ,Lista<Documentos> documentos) {
        this.name = name;
        this.prioridad = prioridad;
        this.documentos = documentos;
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getprioridad() {
        return prioridad;
    }   

    public void setprioridad(String prioridad) {
        this.prioridad = prioridad;
    }
   
    public Lista getdocumentos() {
        return documentos;
    }
    
    public void addDocumento(Documentos doc){
        this.documentos.append(doc);
    }
    
}
