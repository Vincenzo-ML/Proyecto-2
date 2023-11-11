/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Objetos.*;
/**
 *
 * @author Enzo
 */
public class montículo {
    
    private NodoBB root;

    public montículo(){
        this.root = null;
    }

    public NodoBB getRoot() {
        return root;
    }

    public void setRoot(NodoBB root) {
        this.root = root;
    }
    
    private boolean isEmpty() {
        return getRoot() == null;
    }
    

    public void insertNodo(long Time, Documentos data){
        NodoBB NodoBB = new NodoBB(Time, data);
        if (isEmpty()) {
            setRoot(NodoBB);
        } else {
            NodoBB pointer = getRoot();
            while (true) {
                if (Time < pointer.getTime()) {
                    if (pointer.getIzq() == null) {
                        pointer.setIzq(NodoBB);
                        break;
                    } else  {
                        pointer = pointer.getIzq();
                    }
                } else {
                    if (pointer.getDer() == null) {
                        pointer.setDer(NodoBB);
                        break;
                    } else {
                        pointer = pointer.getDer();
                    }
                }
            }
        }
    } 

    public void eliminarRaiz() {
        if (isEmpty()) {
            System.out.println("El montículo está vacío.");
            return;
        }

        if (getRoot().getIzq() == null && getRoot().getDer() == null) {
            setRoot(null);
            return;
        }

        NodoBB pointer = getRoot();
        NodoBB parent = null;

        while (pointer.getIzq() != null || pointer.getDer() != null) {
            parent = pointer;

            if (pointer.getIzq() != null && pointer.getDer() != null) {
                if (pointer.getIzq().getTime() < pointer.getDer().getTime()) {
                    pointer = pointer.getIzq();
                } else {
                    pointer = pointer.getDer();
                }
            } else if (pointer.getIzq() != null) {
                pointer = pointer.getIzq();
            } else {
                pointer = pointer.getDer();
            }
        }

        if (parent != null) {
            if (parent.getIzq() == pointer) {
                parent.setIzq(null);
            } else {
                parent.setDer(null);
            }
        }

        pointer = null;
    }
    

    
 /*   public NodoBB encontrarPadreRecursivo(NodoBB nodo) {
        if (nodo == null || nodo == getRoot()) {
            return null;
        }

        NodoBB padre = null;
        NodoBB actual = getRoot();

        while (actual != null && actual != nodo) {
            padre = actual;

            if (nodo.getTime() < actual.getTime()) {
                actual = actual.getIzq();
            } else {
                actual = actual.getDer();
            }
        }

        return padre;
    }*/
    
    public NodoBB encontrarPadre(NodoBB nodo) {
        return encontrarPadreRecursivo(getRoot(), nodo);
    }

    private NodoBB encontrarPadreRecursivo(NodoBB actual, NodoBB nodo) {
        if (actual == null || actual == nodo) {
            return null;
        }

        if (nodo.getTime() < actual.getTime()) {
            if (actual.getIzq() == nodo) {
                return actual;
            } else {
                return encontrarPadreRecursivo(actual.getIzq(), nodo);
            }
        } else {
            if (actual.getDer() == nodo) {
                return actual;
            } else {
                return encontrarPadreRecursivo(actual.getDer(), nodo);
            }
        }
    }
    
    public void makeNodeRoot(NodoBB nodo) {
        if (nodo == null || nodo == getRoot()) {
            return;
        }

        NodoBB padre = encontrarPadre(nodo);

        if (padre != null) {
            // Swap the node with its parent
            if (padre.getIzq() == nodo) {
                padre.setIzq(nodo.getIzq());
                nodo.setIzq(padre);
            } else {
                padre.setDer(nodo.getDer());
                nodo.setDer(padre);
            }

            if (getRoot() == padre) {
                setRoot(nodo);
            } else {
                NodoBB abuelo = encontrarPadre(padre);
                if (abuelo.getIzq() == padre) {
                    abuelo.setIzq(nodo);
                } else {
                    abuelo.setDer(nodo);
                }
            }
        }
    }
}
