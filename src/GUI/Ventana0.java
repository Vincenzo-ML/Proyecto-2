/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author diego
 */
public class Ventana0 extends javax.swing.JFrame {
    
    public static Ventana1 v1 ;
    public static Ventana2 v2;
    
    public Ventana0() {
        initComponents();
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);//muestra la interfáz en el centro
        this.setSize(710,502);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit1 = new javax.swing.JButton();
        title1 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        fileCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        logo.setText("PRINT-IT");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 760, 200));

        exit1.setForeground(new java.awt.Color(255, 0, 0));
        exit1.setText("X");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        jPanel1.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 60, 30));

        title1.setBackground(new java.awt.Color(0, 51, 255));
        title1.setFont(new java.awt.Font("Roboto Black", 2, 60)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 51, 255));
        title1.setText("PRINT-IT");
        jPanel1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        start.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        start.setText("EMPEZAR DE CERO");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 180, 60));

        fileCSV.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        fileCSV.setText("CARGAR ARCHIVO");
        fileCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCSVActionPerformed(evt);
            }
        });
        jPanel1.add(fileCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_exit1ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        this.setVisible(false);
        Ventana1 v1 = new Ventana1();
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_startActionPerformed

    private void fileCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCSVActionPerformed
        
        
        this.setVisible(false);
        Ventana2 v2 = new Ventana2(this);
        v2.setVisible(true);
    }//GEN-LAST:event_fileCSVActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit1;
    private javax.swing.JButton fileCSV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JButton start;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
