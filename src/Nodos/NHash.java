/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Datos.Lista;

public class NHash<T> {
    
    private String key;
    private Lista docs;
    

    public NHash(String Key, Lista element) {
        this.key = Key;
        this.docs = element;
    }
    
    public Lista getElementhash() {
        return docs;
    }

    public void setElementhash(Lista element) {
        this.docs = element;
    }

    /*public long getTime() {
        return Time;
    }
    
    public void settime(Long x) {
        this.Time = x;
    }
    */
}


