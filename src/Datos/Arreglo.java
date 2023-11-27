/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Nodos.NodoA;

public class Arreglo<T> {
    private Integer head;
    private int Tmax;
    private int size;
    private NodoA<T>[] array;
    
    public Arreglo(int Tmax) {
        this.head = null;
        this.Tmax = Tmax;
        this.size = 0;
        this.array = new NodoA[0];
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
    
    public int len() {
        return size;
    }
    
    
    public T get(int index) {
        
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        return array[index].getElement();
    }

    public void insert(T data) {
        if (size >= Tmax) {
            System.out.println("Array is full. Cannot insert more elements.");
            return;
        }

        NodoA<T> newNode = new NodoA<>(data);

        if (isEmpty()) {
            head = 0;
            array = new NodoA[Tmax];
            array[head] = newNode;
        } else {
            int newIndex = (head + size) % Tmax;
            array[newIndex] = newNode;
        }

        size++;
    }
    
    public void insertAtIndex(T element, int index) {
    
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (size >= Tmax) {
            throw new IllegalStateException("Array is full");
        }


        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = new NodoA<>(element);
        size++;
    }
    
    public void replaceAtIndex(T element, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        array[index] = new NodoA<>(element);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("The array is empty.");
        } else {
            System.out.println("Elements in the array:");
            for (int i = 0; i < len(); i++) {
                System.out.print(getArray()[i].getElement() + " ");
            }
            System.out.println();
        }
 }
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
    





