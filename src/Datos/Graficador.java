/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.view.Viewer;
import Objetos.*;
import Nodos.*;
import Datos.*;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Graficador {
       
    private Monticulo arbol;

    public Graficador(Monticulo arbol) {
        this.arbol = arbol;
    }

    public Monticulo getArbol() {
        return arbol;
    }

    public void setArbol(Monticulo arbol) {
        this.arbol = arbol;
    }

   
    public Graph recurArbol(){
       Graph g = new SingleGraph("hp");
       NMonticulo nombre = getArbol().getArray()[getArbol().getHead()];
       Documentos name = (Documentos) nombre.getElementmont();
       g.addNode(name.getName());
       Random r = new Random();
       Monticulo nom = getArbol();
       //returnArbol(nom, g, r.nextInt(100000));
       return g;
    }


    /*
    public Graph returnArbol(Monticulo nodo, Graph g, int cont){

       if(getLeftChildIndex(nodos) != null){
           Random r = new Random();
           g.addNode(nodo.getLeftSon().getNombre());
           g.addEdge(Integer.toString(r.nextInt(100000)), nodo.getNombre(), nodo.getLeftSon().getNombre(), true);
           returnArbol(nodo.getLeftSon(), g, r.nextInt(100000));
       }

       if(nodo.getRightSon() != null){
           Random r = new Random();
           g.addNode(nodo.getRightSon().getNombre());
           g.addEdge(Integer.toString(r.nextInt(100000)), nodo.getNombre(), nodo.getRightSon().getNombre(), true);
           returnArbol(nodo.getRightSon(), g, r.nextInt(100000));
       }

       return g;

    }
     */
     
    public void mostrar(){
        Graph g = recurArbol();
        g.setAttribute("ui.stylesheet", "node { text-alignment: under; }");
       
        for (Node node : g) {
            node.setAttribute("ui.label", node.getId());
        }
         
        for (Node node : g) {
            node.setAttribute("ui.style", "text-size: 20;");
        }
       
        Viewer viewer = g.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
    }
     
}