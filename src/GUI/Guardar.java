/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Guardar extends javax.swing.JFrame {

    public static Ventana1 v1;
    
    public Guardar(Ventana1 v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null); //muestra la interfáz en el centro
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        notSave = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(0, 51, 255));
        title.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        title.setText("GUARDAR COMO...");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 60));

        logo.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        logo.setText("PRINT-IT");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        save.setText("GUARDAR");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 120, 40));

        notSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        notSave.setText("NO GUARDAR");
        notSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notSaveActionPerformed(evt);
            }
        });
        jPanel1.add(notSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 130, 40));

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("¿Deseas guardar los cambios?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel3.setText("(Regresar)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo CSV");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos CSV (*.csv)", "csv"));

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath() + ".csv";
            v1.func.writeCsvFile(v1.list, filePath);
            JOptionPane.showMessageDialog(null, "Archivo CSV guardado con éxito en: " + filePath);
            JOptionPane.showMessageDialog(null, "GRACIAS POR VISITAR PRINT-IT!");
            this.dispose();
        }
    }//GEN-LAST:event_saveActionPerformed

    private void notSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notSaveActionPerformed
        JOptionPane.showMessageDialog(null, "GRACIAS POR VISITAR PRINT-IT!");
        this.dispose();
    }//GEN-LAST:event_notSaveActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Guardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guardar(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton notSave;
    private javax.swing.JButton save;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
