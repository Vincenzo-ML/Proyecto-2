/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Datos.*;
import Objetos.*;
import javax.swing.JOptionPane;

public class Ventana1 extends javax.swing.JFrame {

    public static Ventana2 v2;
    public static Ventana3 v3;
    public static Ventana4 v4;
    public static Ventana5 v5;
    public static Ventana6 v6;
    public static Ventana7 v7;
    public static Guardar g;

    Lista<Persona> list = new Lista<>();
    Util func = new Util();
    
    public Ventana1() {
        initComponents();
        
        JOptionPane.showMessageDialog(null, "BIENVENDIO A PRINT-IT! Una aplicación diseñada para imprimir documentos en orden de prioridad y manejar un registro de los usuarios con sus documentos creados. Para empezar, solo debes seleccionar el botón que desees!");
        this.setVisible(true);
        this.setLocationRelativeTo(null);//muestra la interfáz en el centro
        this.setSize(780, 502);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        impresora = new javax.swing.JLabel();
        usuarios = new javax.swing.JLabel();
        documentos = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        deleteDocument = new javax.swing.JButton();
        printDocument = new javax.swing.JButton();
        createDocument = new javax.swing.JButton();
        freePrinter = new javax.swing.JButton();
        showPrinter = new javax.swing.JButton();
        deleteDocCola = new javax.swing.JButton();
        fileCSV = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(0, 51, 255));
        title.setFont(new java.awt.Font("Roboto Black", 2, 60)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 255));
        title.setText("PRINT-IT");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imp.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, 270));

        impresora.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        impresora.setForeground(new java.awt.Color(102, 153, 255));
        impresora.setText("IMPRESORA:");
        background.add(impresora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        usuarios.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        usuarios.setForeground(new java.awt.Color(102, 153, 255));
        usuarios.setText("USUARIOS:");
        background.add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        documentos.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        documentos.setForeground(new java.awt.Color(102, 153, 255));
        documentos.setText("DOCUMENTOS:");
        background.add(documentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        background.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 60, 30));

        addUser.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        addUser.setText("AÑADIR USUARIO");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        background.add(addUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 160, 40));

        deleteUser.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        deleteUser.setText("ELIMINAR USUARIO");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        background.add(deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, 40));

        deleteDocument.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        deleteDocument.setText("ELIMINAR DOCUMENTO");
        deleteDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDocumentActionPerformed(evt);
            }
        });
        background.add(deleteDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, 40));

        printDocument.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        printDocument.setText("IMPRIMIR DOCUMENTO");
        printDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printDocumentActionPerformed(evt);
            }
        });
        background.add(printDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, 40));

        createDocument.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        createDocument.setText("CREAR DOCUMENTO");
        createDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDocumentActionPerformed(evt);
            }
        });
        background.add(createDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, 40));

        freePrinter.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        freePrinter.setText("LIBERAR IMPRESORA");
        background.add(freePrinter, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 160, 40));

        showPrinter.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        showPrinter.setText("MOSTRAR COLA DE IMPRESIÓN");
        showPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrinterActionPerformed(evt);
            }
        });
        background.add(showPrinter, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 210, 40));

        deleteDocCola.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        deleteDocCola.setText("ELIMINAR DOCUMENTO DE LA COLA DE IMPRESIÓN");
        background.add(deleteDocCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 340, 40));

        fileCSV.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        fileCSV.setText("CARGAR ARCHIVO");
        fileCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCSVActionPerformed(evt);
            }
        });
        background.add(fileCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 170, 40));

        jLabel2.setText("Permite subir un archivo con ");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setText("usuarios y sus prioridades");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabel4.setText("Salir / Guardar");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        jLabel5.setText("Elimina aquellos que no están ");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jLabel6.setText("en la cola de impresión");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel7.setText("Envía un doc. a la cola de impresión");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Guardar g = new Guardar(this);
    }//GEN-LAST:event_exitActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
       Ventana3 v3 = new Ventana3(this);
    }//GEN-LAST:event_addUserActionPerformed

    private void deleteDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDocumentActionPerformed
        Ventana6 v6 = new Ventana6(this);
    }//GEN-LAST:event_deleteDocumentActionPerformed

    private void showPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrinterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPrinterActionPerformed

    private void fileCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCSVActionPerformed
        JOptionPane.showMessageDialog(null, "DESCARGAR ARCHIVO! Debes pulsar el botón de 'abrir archivo' y revisar si se descargó el documento deseado, al finalizar presiona el botón de 'guardar'el cual te llevará a la ventana principal nuevamente.");
        Ventana2 v2 = new Ventana2(this);
    }//GEN-LAST:event_fileCSVActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        Ventana4 v4 = new Ventana4(this);
    }//GEN-LAST:event_deleteUserActionPerformed

    private void createDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDocumentActionPerformed
        Ventana5 v5 = new Ventana5(this);
    }//GEN-LAST:event_createDocumentActionPerformed

    private void printDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printDocumentActionPerformed
        Ventana7 v7 = new Ventana7(this);
    }//GEN-LAST:event_printDocumentActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUser;
    private javax.swing.JPanel background;
    private javax.swing.JButton createDocument;
    private javax.swing.JButton deleteDocCola;
    private javax.swing.JButton deleteDocument;
    private javax.swing.JButton deleteUser;
    private javax.swing.JLabel documentos;
    private javax.swing.JButton exit;
    private javax.swing.JButton fileCSV;
    private javax.swing.JButton freePrinter;
    private javax.swing.JLabel impresora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton printDocument;
    private javax.swing.JButton showPrinter;
    private javax.swing.JLabel title;
    private javax.swing.JLabel usuarios;
    // End of variables declaration//GEN-END:variables
}
