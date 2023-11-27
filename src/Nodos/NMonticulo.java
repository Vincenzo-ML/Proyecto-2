/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Objetos.Documentos;


public class NMonticulo<T> {
    private long Time;
    private Documentos element;
    private Integer next;

    public NMonticulo(long Time, Documentos element) {
        this.Time = Time;
        this.element = element;
        this.next = null;
    }
    
    public Documentos getElementmont() {
        return element;
    }

    public void setElementmont(Documentos element) {
        this.element = element;
    }
    
    public String getName(){
        return element.getName();
    }

    public long getTime() {
        return Time;
    }
    
    public void settime(Long x) {
        this.Time = x;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }   
    
    public int gettamaño(){
        return element.gettamaño();
    }
    
}

