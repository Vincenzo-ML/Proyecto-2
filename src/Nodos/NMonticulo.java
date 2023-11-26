/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

/**
 *
 * @author Enzo
 */
public class NMonticulo<T> {
    private long Time;
    private T element;
    private Integer next;

    public NMonticulo(long Time, T element) {
        this.Time = Time;
        this.element = element;
        this.next = null;
    }
    
    public T getElementmont() {
        return element;
    }

    public void setElementmont(T element) {
        this.element = element;
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
    
}
