/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Nodos.NMonticulo;
import Nodos.NodoA;
import Objetos.Persona;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

public class Monticulo<T> {
    private Integer head;
    private int Tmax;
    private int size;
    private NMonticulo<T>[] array;
    
    public Monticulo(int Tmax) {
        this.head = null;
        this.Tmax = Tmax;
        this.size = 0;
        this.array = new NMonticulo[Tmax];
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

    public NMonticulo[] getArray() {
        return array;
    }

    public void setArray(NMonticulo[] array) {
        this.array = array;
    }
    
    public int len(){
        return getSize();
    }
    
    
    private void swap(int index1, int index2) {
        NMonticulo temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public int getParentIndex(int index) {
        return (index - 1) / 2;
    }


    public int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    
    public int getRightChildIndex(int index) {
        return 2 * index + 2;
    }


    public void insert(NMonticulo element) {
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



    public NMonticulo removeMin() {
       if (size == 0) {
           throw new IllegalStateException("Heap is empty");
       }

       NMonticulo minElement = array[0];

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
    
    public NMonticulo<T> getNode(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    } 
    
    public String getNodeName(int index) {
        if (index >= 0 && index < size) {
            return array[index].getName();
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    } 
    
    public void eliminardemonticulo(Long t) {
        Lista<NMonticulo> lista = new Lista();

        int initialSize = size;

        for(int i = 0; i < initialSize; i++){
            NMonticulo element = removeMin();

            if(element.getTime() != t){
                lista.append(element);
            }
        }

        for(int i = 0; i < lista.len(); i++){
            insert(lista.get(i));
        }
    }
    
    public String reg(Graph g, String name, int intento){
        int x = 0;
        if(g.getNode(name) != null){
            String name1 = name + intento;
            name = reg(g, name1, x + 1);
        }
        return name;
    }
    
    public void VerArbol() {
        System.setProperty("org.graphstream.ui", "swing");
        Graph g = new SingleGraph("hp");
    
        for (int x = 0; x < size; x++) {
            String name = array[x].getName();
            if (g.getNode(name) == null) {
                g.addNode(name);
                g.getNode(name).setAttribute("ui.label", name);
            } else {
                String nameN = reg(g,name, 1);
                g.addNode(nameN);
                g.getNode(nameN).setAttribute("ui.label", nameN);
            
                String edgeId = name + nameN;
                if (g.getEdge(edgeId) == null) {
                    g.addEdge(edgeId, name, nameN, true);
                }
            }
        }

        for (int x = 0; x < size; x++) {
            int leftChildIndex = getLeftChildIndex(x);
            int rightChildIndex = getRightChildIndex(x);

            if (leftChildIndex < size) {
                NMonticulo leftChild = array[leftChildIndex];
                String edgeId = array[x].getName() + leftChild.getName();
                if (g.getEdge(edgeId) == null) {
                    g.addEdge(edgeId, array[x].getName(), leftChild.getName(), true);
                }
            }

            if (rightChildIndex < size) {
                NMonticulo rightChild = array[rightChildIndex];
                String edgeId = array[x].getName() + rightChild.getName();
                if (g.getEdge(edgeId) == null) {
                    g.addEdge(edgeId, array[x].getName(), rightChild.getName(), true);
                }
            }
        }

        g.setAttribute("ui.stylesheet", "node { text-alignment: under; }");

        Viewer viewer = g.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
    }
}