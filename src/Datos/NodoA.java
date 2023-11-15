/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author Enzo
 */
public class NodoA<T> {
    private long Time;
    private T element;
    private Integer next;

    public NodoA(long Time, T element) {
        this.Time = Time;
        this.element = element;
        this.next = null;
    }
    
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }
    
    public long getTime() {
        return Time;
    }
}
