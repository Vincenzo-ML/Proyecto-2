/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;
import Nodos.NodoA;
import Datos.*;
import Objetos.*;
import java.time.Clock;
/**
 *
 * @author Enzo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Util Util = new Util();
        HashTable HashTable = new HashTable(10);
        long st = Util.StartTime();
        Arreglo Arreglo = new Arreglo(5);
        
        NodoA n = new NodoA(Util.SentTime(st),"gv");
        NodoA a = new NodoA(Util.SentTime(st),"hv");
        NodoA d = new NodoA(Util.SentTime(st) + 1000000,"er");
        NodoA k = new NodoA(Util.SentTime(st)+10000,"ee");
        
        HashTable.printData();
        
        Arreglo.insert(n);
        Arreglo.insert(a);
        Arreglo.insert(d);
        Arreglo.insert(k);
        
        Arreglo.print();
        
        Arreglo.removeMin();
        
        Arreglo.print();
        
        Arreglo.removeMin();
        
        Arreglo.print();
    }
    }


