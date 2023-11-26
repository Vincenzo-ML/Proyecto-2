/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Datos.Lista;
import Objetos.*;

public class NHash<T> {
    
    private String key;
    private Documentos doc;
    private Long t;
    

    public NHash(String Key, Documentos element, Long t) {
        this.key = Key;
        this.doc = element;
        this.t = t;
    }
    
    public Documentos getElementhash() {
        return doc;
    }

    public void setElementhash(Documentos element) {
        this.doc = element;
    }
    
    public String getKey() {
        return key;
    }
    
    public void setKey(String x) {
        this.key = x;
    }

    public long getTime() {
        return t;
    }
    
    public void settime(Long x) {
        this.t = x;
    }
    
}

