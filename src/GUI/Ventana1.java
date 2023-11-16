/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author diego
 */
public class Ventana1 extends javax.swing.JFrame {

    public static Ventana2 v2;
    public static Ventana3 v3;
    public static Ventana4 v4;
    public static Ventana5 v5;
    public static Ventana6 v6;
    
    public Ventana1() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);//muestra la interfáz en el centro
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        fileCSV = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        createDocument = new javax.swing.JButton();
        printDocument = new javax.swing.JButton();
        showPrinter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        freePrinter = new javax.swing.JButton();
        deleteDoc = new javax.swing.JButton();
        impresora = new javax.swing.JLabel();
        usuarios = new javax.swing.JLabel();
        documentos = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        printDocument1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(0, 51, 255));
        title.setFont(new java.awt.Font("Roboto Black", 2, 60)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 255));
        title.setText("PRINT-IT");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        fileCSV.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        fileCSV.setText("DESCARGAR ARCHIVO");
        background.add(fileCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, 40));

        addUser.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        addUser.setText("AÑADIR USUARIO");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        background.add(addUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, 40));

        deleteUser.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        deleteUser.setText("ELIMINAR USUARIO");
        background.add(deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, 40));

        createDocument.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        createDocument.setText("CREAR DOCUMENTO");
        background.add(createDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, 40));

        printDocument.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        printDocument.setText("ELIMINAR DOCUMENTO");
        printDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printDocumentActionPerformed(evt);
            }
        });
        background.add(printDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, 40));

        showPrinter.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        showPrinter.setText("MOSTRAR COLA DE IMPRESIÓN");
        showPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrinterActionPerformed(evt);
            }
        });
        background.add(showPrinter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imp.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, 270));

        freePrinter.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        freePrinter.setText("LIBERAR IMPRESORA");
        background.add(freePrinter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 40));

        deleteDoc.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        deleteDoc.setText("ELIMINAR DOCUMENTO DE LA COLA");
        background.add(deleteDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 240, 40));

        impresora.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        impresora.setForeground(new java.awt.Color(102, 153, 255));
        impresora.setText("IMPRESORA:");
        background.add(impresora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        usuarios.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        usuarios.setForeground(new java.awt.Color(102, 153, 255));
        usuarios.setText("USUARIOS:");
        background.add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        documentos.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        documentos.setForeground(new java.awt.Color(102, 153, 255));
        documentos.setText("DOCUMENTOS:");
        background.add(documentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        background.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 40, 20));

        printDocument1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        printDocument1.setText("IMPRIMIR DOCUMENTO");
        background.add(printDocument1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 170, 40));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addUserActionPerformed

    private void showPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrinterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPrinterActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void printDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printDocumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printDocumentActionPerformed

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
    private javax.swing.JButton deleteDoc;
    private javax.swing.JButton deleteUser;
    private javax.swing.JLabel documentos;
    private javax.swing.JButton exit;
    private javax.swing.JButton fileCSV;
    private javax.swing.JButton freePrinter;
    private javax.swing.JLabel impresora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton printDocument;
    private javax.swing.JButton printDocument1;
    private javax.swing.JButton showPrinter;
    private javax.swing.JLabel title;
    private javax.swing.JLabel usuarios;
    // End of variables declaration//GEN-END:variables
}