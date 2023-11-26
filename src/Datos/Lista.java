/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Nodos.Nodo;
import Objetos.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Enzo
 */
public class Lista<T> {

    private Nodo head;
    private Nodo tail;
    private int size;
    

    public Lista() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public Nodo getHead() {
        return head;
    }


    public void setHead(Nodo head) {
        this.head = head;
    }


    public Nodo getTail() {
        return tail;
    }


    public void setTail(Nodo tail) {
        this.tail = tail;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }
    

    public boolean isEmpty(){
        return head == null;
    }
    

    public int len(){
        return getSize();
    }
    

    public void delete(){
        head = null;
        tail = null;
        size = 0;
    }
    
  
    
    public final void append(T data){
        Nodo newNode = new Nodo(data);
        if(isEmpty() == true){
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }
    

    public void preappend(T data){
        Nodo newNode = new Nodo(data);
        if(isEmpty() == true){
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    public T get(int position){
        Nodo pointer = head;
        if(position < 0 || position >= len()){
            return null;
        }
        else if(position == 0){
            return (T) head.getData();
        }
        else if(position == len()-1){
            return (T) tail.getData();
        }
        else{
            for(int x = 1; x <= position; x++){
                pointer = pointer.getNext();
            }
            return (T) pointer.getData();
        }
    }

    public void insert(int position, T data){
        boolean run = true;
        Nodo newNode = new Nodo(data);
        while(run == true){
            if(position < 0 || position >= len()){
                run = false;
            }
            else{
                if(position == 0){
                    preappend(data);
                    run = false;
                }
                else{
                    Nodo pointer = head;
                    for(int x = 1; x < position; x++){
                        pointer = pointer.getNext();
                    }
                    newNode.setNext(pointer.getNext());
                    pointer.setNext(newNode);
                    size++;  
                    run = false;
                }
            }
        }
    }

    public void pop(int position){
        Nodo pointer = head;
        if(position == 0){
            head = head.getNext();
            size--;
        }
        else if(position == len()-1){
            for(int x = 2; x < len(); x++){
                pointer = pointer.getNext();
            }
            pointer.setNext(null);
            tail = pointer;
            size--;
        }
        else{
            for(int x = 0; x < position-1; x++){
                pointer = pointer.getNext();
            }
            pointer.setNext(pointer.getNext().getNext());
            size--;
        }
    }

    public int find(T data){
        if(head.getData() == data){
            return 0;
        }
        else if(tail.getData() == data){
            return size-1;
        }
        else{
            Nodo pointer = head;
            for(int x = 0; x < len(); x++){
                if(pointer.getData() == data){
                    return x;
                }
                pointer = pointer.getNext();
            }
        }
        return 0;
    }    
    
    

    
    public void replace(int position, T data){
        boolean run = true;
 
        while(run == true){
            if(position < 0 || position >= len()){
                run = false;
            }
            else{
                if(position == 0){
                    head.setData(data);
                    run = false;
                }
                else if(position == len()-1){
                    tail.setData(data);
                    run = false;
                }
                else{
                    Nodo pointer = head;
                    for(int x = 0; x < position; x++){
                        pointer = pointer.getNext();
                    }
                    pointer.setData(data);
                    run = false;
                }
            }
        }
    }    

    public boolean exist(T data){
        if(head.getData() == data){
            return true;
        }
        else if(tail.getData() == data){
            return true;
        }
        else{
            Nodo pointer = head;
            for(int x = 0; x < len(); x++){
                if(pointer.getData() == data){
                    return true;
                }
                pointer = pointer.getNext();
            }
        }
        return false;
    }
    
    public void print(){
        Nodo pointer = getHead();
        while(pointer != null){
            System.out.println("["+ pointer.getData() +"]");
            pointer = pointer.getNext();
        }
    }
    
    public Persona EncontrarPersona(String name){
        for(int x = 0; x < this.len(); x++){
            Persona person = (Persona) this.get(x);
            if(person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }
    
    public Documentos EncontrarDocumento(String name){
        for(int x = 0; x < this.len(); x++){
            Documentos doc = (Documentos) this.get(x);
            if(doc.getName().equals(name)){
                return doc;
            }
        }
        return null;
    }

}