/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author Enzo
 */
public class NodoBB<T>{
    
    private long Time;
    private T data;
    private NodoBB izquierdo;
    private NodoBB derecho;

    public NodoBB(long Time, T data) {
        this.Time = Time;
        this.data = data;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    public long getTime() {
        return Time;
    }

    public NodoBB getIzq() {
        return izquierdo;
       
    }

    public void setIzq(NodoBB izq) {
        this.izquierdo = izq;
    }
    
    public NodoBB getDer() {
        return derecho;
    }
    
    public void setDer(NodoBB der) {
        this.derecho = der;
    }
    
    
    public T getData() {
        return data;
    }

    public boolean isLeaf() {
        return getIzq() == null && getDer() == null;
    }
}
