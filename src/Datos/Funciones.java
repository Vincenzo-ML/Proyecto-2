/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Funciones {
    
    public void leerCSV(String path){
        try{        
            //abrimos el .csv en br
            BufferedReader br = new BufferedReader(new FileReader(path));
            //leemos una linea del archivo
            String line = br.readLine();
            while (line!= null){
                // separa la linea con el separador que definimos 
                String[] array= line.split(",");
                System.out.println(array[0]);
                //volvemos a leerlo
                line = br.readLine();
            }
            //cerramos el buffer
            if(br != null){
                br.close();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    //PRUEBAS DE CODIGO-->
  
    /*public void read(){
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        String line = null;
        try{
            file = new File("C:\\Users\\diego\\OneDrive\\Escritorio\\prueba.csv");//cargamos el archivo de la ruta
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String[] datos = null;
            while((line = br.readLine())!= null){
                datos = line.split(";");
                System.out.println(datos[0]);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    */
    
    /*private BufferedReader reader; //lee el archivo
    private String line; // recibe cada linea del archivo csv
    private String parts_line[] = null; //guarda cada linea leida
    
    public void leerCSV(String nameFile){
        try{
            reader = new BufferedReader(new FileReader(nameFile));
            while((line = reader.readLine())!= null){
                parts_line = line.split(",");
                imprimirLinea();
                System.out.println();
            }
            reader.close();
            line= null;
            parts_line = null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void imprimirLinea(){
        for (int i =0; i< parts_line.length; i++){
            System.out.print(parts_line[i]+ " | ");
        }
    }
    */
}
