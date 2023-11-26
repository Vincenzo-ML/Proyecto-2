/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;
import Nodos.*;
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
        long st = Util.StartTime();
        
        HashTable x = new HashTable(5);
        HashTable y = new HashTable(100);
        x.getTabla().print();
        Documentos s = new Documentos("albe", "ew", "sece");
        NHash n = new NHash("albe", s, st);
        x.insert(n);
        x.printData();
  
        
    
  
    }
    }


