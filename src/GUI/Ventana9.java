/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Datos.Lista;
import Objetos.Documentos;
import Objetos.Persona;
import Nodos.*;


public class Ventana9 extends javax.swing.JFrame {

    public static Ventana1 v1;
    
    public Ventana9(Ventana1 v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(780, 502);
        mostrarcola();
    }

   
    @SuppressWarnings("unchecked")
    public void mostrarcola(){

        for (int x = 0; x < v1.monticulo.getSize(); x++){
            String temp = v1.monticulo.getNode(x).getName();
            int temp2 = v1.monticulo.getNode(x).gettamaño();

            txtAUser.append("\n" + (x+1) + " -->" + temp + " --> "+ temp2 + "paginas");
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAUser = new javax.swing.JTextArea();
        usuario3 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        showPrinter2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        title.setText("IMPRESORA");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        logo.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        logo.setText("PRINT-IT");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 50, 30));

        txtAUser.setEditable(false);
        txtAUser.setBackground(new java.awt.Color(255, 255, 255));
        txtAUser.setColumns(20);
        txtAUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAUser.setRows(5);
        jScrollPane1.setViewportView(txtAUser);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 330, 280));

        usuario3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        usuario3.setForeground(new java.awt.Color(255, 255, 255));
        usuario3.setText("N° --> NOMBRE DOCUMENTO --> TAMAÑO DOC.");
        jPanel2.add(usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, 20));

        title1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("COLA DE IMPRESIÓN");
        jPanel2.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(Regresar)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 360, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imp.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 270));

        showPrinter2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        showPrinter2.setText("VER IMPRESORA");
        showPrinter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrinter2ActionPerformed(evt);
            }
        });
        jPanel1.add(showPrinter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void showPrinter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrinter2ActionPerformed
        v1.monticulo.VerArbol();
    }//GEN-LAST:event_showPrinter2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana9(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton showPrinter2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextArea txtAUser;
    private javax.swing.JLabel usuario3;
    // End of variables declaration//GEN-END:variables
}
