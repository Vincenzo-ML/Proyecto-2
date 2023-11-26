/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import Datos.*;


public class Ventana2 extends javax.swing.JFrame {
    
    public static Ventana1 v1;
    public static String archivo;
    
    public Ventana2(Ventana1 v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null); //muestra la interfáz en el centro
        this.setSize(710,502);
    }

    @SuppressWarnings("unchecked")
    
    //mostrar contenido del file
    public void showContent(String file_name) throws IOException{
        String line;
        try {
            FileReader f = new FileReader(file_name);
            BufferedReader b = new BufferedReader(f);
            do{
                line = b.readLine();
                content.setText(content.getText()+ line + "\n");
            }while(line != null);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        openFile = new javax.swing.JButton();
        route = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        content = new javax.swing.JTextArea();
        saveTxt = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 60, 40));

        openFile.setBackground(new java.awt.Color(0, 153, 255));
        openFile.setText("Abrir Archivo");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jPanel1.add(openFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 30));

        route.setEditable(false);
        route.setBackground(new java.awt.Color(153, 204, 255));
        route.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeActionPerformed(evt);
            }
        });
        jPanel1.add(route, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 290, 30));

        content.setBackground(new java.awt.Color(153, 204, 255));
        content.setColumns(20);
        content.setRows(5);
        jScrollPane1.setViewportView(content);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 390, 230));

        saveTxt.setBackground(new java.awt.Color(102, 153, 255));
        saveTxt.setText("Guardar ");
        saveTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTxtActionPerformed(evt);
            }
        });
        jPanel1.add(saveTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, 30));

        title.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        title.setText("DESCARGAR ARCHIVO");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("(Regresar)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carpeta.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 510, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        //JFile Chooser, abrirmos un archivo.
        File file = v1.func.JFileChooser();
        //Leemos el archivo
        Lista text = v1.func.leer_CSV(file);
        //agregamos los usuarios leidos a la lista de usuarios
        v1.list = text;
        //mostramos en la interfaz
        File file_name = file.getAbsoluteFile();
        if(file_name.getName().equals("")){

            JOptionPane.showMessageDialog(this, "Error al abrir el archivo, revise que esté seleccionado el archivo");
        }else{
            route.setText(file_name.getAbsolutePath());
            try {
                showContent(file_name.getAbsolutePath());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        

    }//GEN-LAST:event_openFileActionPerformed

    private void routeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeActionPerformed

    }//GEN-LAST:event_routeActionPerformed

    private void saveTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTxtActionPerformed

        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_saveTxtActionPerformed
     
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2(v1).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea content;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openFile;
    private javax.swing.JTextField route;
    private javax.swing.JButton saveTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
