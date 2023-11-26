/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.Clock;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Datos.*;
import java.io.PrintWriter;

public class Util {
    
    public long StartTime() {
        Clock clock = Clock.systemDefaultZone();
        long ST = clock.millis();
        return ST;
    }
    
    public long SentTime(Long STime) {
        Clock clock = Clock.systemDefaultZone();
        long Actual = clock.millis();
        long TM = Actual - STime;
        return TM;
    }
    
    public File JFileChooser(){
        //JFile Chooser, abrirmos un archivo.
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto .csv", "csv"); //el archivo debe ser ajuro de tipo csv.
        file.setFileFilter(filter); //devuelve un valor entero dependiendo si se elige el boton de abrir o cancelar
        int ans = file.showOpenDialog(null);
        if (ans == JFileChooser.CANCEL_OPTION){
            return null;
        }else{
           File file_name = file.getSelectedFile();
           return file_name;
        }
            
    }
    
    public Lista<Persona> leer_CSV(File file){
        //Cargamos un archivo
        //File file = JFileChooser();
        Lista<Persona> lista = new Lista<>();
        try{        
            //abrimos el archivo.csv en br
            BufferedReader br = new BufferedReader(new FileReader(file));
            //leemos una linea del archivo
            String line = br.readLine();
            while (line!= null){
                Persona persona = new Persona();
                String [] array= line.split(",");
                String p = "";
                if (array[1].equalsIgnoreCase(" prioridad_baja")){
                    p = " Prioridad Baja";
                }else if(array[1].equalsIgnoreCase(" prioridad_media")){
                    p = " Prioridad Media";
                }else if(array[1].equalsIgnoreCase(" prioridad_alta")){
                    p = " Prioridad Alta";
                }
                persona.setName(array[0]);
                persona.setprioridad(p);
                lista.append(persona);
                line = br.readLine();
            }
            //cerramos el buffer
            br.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public void writeCsvFile(Lista usuarios, String filePath) {
        if ("".equals(filePath)){
            JOptionPane.showMessageDialog(null, "Error! No hay ruta de acceso.");
        } 
        else{
            String str = "usuario, tipo\n";
            if (usuarios.isEmpty()== false){
                for (int x = 0; x < usuarios.len(); x++){
                    Persona person = (Persona) usuarios.get(x);
                    str =  str + person.getName() + ", " + person.getprioridad() +"\n";
                }
            }
            try{
               PrintWriter pw = new PrintWriter(filePath); 
               pw.print(str);
               pw.close();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error! No se ha escrito sobre el archivo.");
            }
        }
    }


}


