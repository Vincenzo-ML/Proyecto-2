/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Nodos.NodoA;
import Objetos.*;
/**
 *
 * @author Enzo
 */
public class Arreglo<T> {
    private Integer head;
    private int Tmax;
    private int size;
    private NodoA<T>[] array;
    
    public Arreglo(int Tmax) {
        this.head = null;
        this.Tmax = Tmax;
        this.size = 0;
        this.array = new NodoA[Tmax];
    }
    
    public Integer getHead() {
        return head;
    }
    
    public void setHead(Integer head) {
        this.head = head;
    }

    public int getTmax() {
        return Tmax;
    }

    public void setTmax(int Tmax) {
        this.Tmax = Tmax;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }

    public NodoA[] getArray() {
        return array;
    }

    public void setArray(NodoA[] array) {
        this.array = array;
    }
    
    public int len(){
        return getSize();
    }
    
    
    private void swap(int index1, int index2) {
        NodoA temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }


    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    
    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }


    public void insert(NodoA element) {
        if (size >= Tmax) {
            throw new IllegalStateException("Heap is full");
        }


        array[size] = element;


        int currentIndex = size;
        while (currentIndex > 0 && array[currentIndex].getTime() < array[getParentIndex(currentIndex)].getTime()) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }

        size++;
    }



    public NodoA removeMin() {
       if (size == 0) {
           throw new IllegalStateException("Heap is empty");
       }

       NodoA minElement = array[0];

       array[0] = array[size - 1];
       array[size - 1] = null;

       int currentIndex = 0;
       while (getLeftChildIndex(currentIndex) < size) {
           int minChildIndex = getLeftChildIndex(currentIndex);
           if (getRightChildIndex(currentIndex) < size && array[getRightChildIndex(currentIndex)] != null && array[getRightChildIndex(currentIndex)].getTime() <= array[minChildIndex].getTime()) {
               minChildIndex = getRightChildIndex(currentIndex);
           }

           if (array[currentIndex] != null && array[minChildIndex] != null && array[currentIndex].getTime() > array[minChildIndex].getTime()) {
               swap(currentIndex, minChildIndex);
               currentIndex = minChildIndex;
           } else {
               break;
           }
       }

       size--;

       return minElement;
   }

        
//Ignoren el de eliminar por ahora ya que debo enlazarlo al hash table pero ahi esta el boceto 
    
/*    public void TransformIntoMin(String searchString) {
    if (size == 0) {
        throw new IllegalStateException("Heap is empty");
    }
    
    int index = -1;
    for (int i = 0; i < size; i++) {
        if (array[i] != null && array[i].getElement().getName == searchString) {
            index = i;
            break;
        }
    }
    
    if (index == -1) {
        throw new IllegalArgumentException("String not found in heap");
    }
    
    array[index].setTime(0);
    
    int currentIndex = index;
    while (getLeftChildIndex(currentIndex) < size) {
        int minChildIndex = getLeftChildIndex(currentIndex);
        if (getRightChildIndex(currentIndex) < size && array[getRightChildIndex(currentIndex)] != null && array[getRightChildIndex(currentIndex)].getTime() <= array[minChildIndex].getTime()) {
            minChildIndex = getRightChildIndex(currentIndex);
        }
        
        if (array[currentIndex] != null && array[minChildIndex] != null && array[currentIndex].getTime() > array[minChildIndex].getTime()) {
            swap(currentIndex, minChildIndex);
            currentIndex = minChildIndex;
        } else {
            break;
        }
    }
    
    removeMin();
}
  */ 
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i].getElement());
        }
        System.out.println("");
} 
    
    
}


