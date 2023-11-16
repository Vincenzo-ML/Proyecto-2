/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;
import Datos.*;
import Objetos.*;
import java.io.File;
import java.time.Clock;
import GUI.*;
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
        /*long st = Util.StartTime();
        Arreglo Arreglo = new Arreglo(5);
        NodoA n = new NodoA(Util.SentTime(st),"gv");
        NodoA a = new NodoA(Util.SentTime(st),"hv");
        NodoA d = new NodoA(Util.SentTime(st) + 1000000,"er");
        NodoA k = new NodoA(Util.SentTime(st)+10000,"ee");
        
        Arreglo.insert(n);
        Arreglo.insert(a);
        Arreglo.insert(d);
        Arreglo.insert(k);
        
        Arreglo.print();
        
        Arreglo.removeMin();
        
        Arreglo.print();
        
        Arreglo.removeMin();
        
        Arreglo.print();*/
        Util.leer_CSV();
        
        /*Ventana1 ventana = new Ventana1();
        ventana.setVisible(true);*/
    }
}


