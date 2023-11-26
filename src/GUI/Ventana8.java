/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import Datos.*;
import Objetos.*;


public class Ventana8 extends javax.swing.JFrame {

    public static Ventana1 v1;
    
    public Ventana8(Ventana1 v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(780, 502);
        mostrarDocumentos();
    }

    
    @SuppressWarnings("unchecked")
    public void mostrarDocumentos(){
        if (v1.list.isEmpty() == false){
            for (int x = 0; x < v1.list.len(); x++){
                String temp = "";
                String temp2 = "";
                String temp3= "";
                Persona person = v1.list.get(x);
                String name = person.getName();
                Lista<Documentos> doc = person.getdocumentos();
                if (doc.isEmpty()){
                    temp = name + " --> " ;
                    temp2 = "No hay documentos creados";
                    temp3= "";
                }else{
                    temp = name ;
                    temp2= " --> DOCUMENTOS:\n";
                    for (int j=0 ; j < doc.len(); j++){
                        Documentos docs = doc.get(j);
                        String doc_name = docs.getName();
                        int doc_size = docs.gettamaño();
                        String doc_type = docs.gettipo();
                        temp3 += doc_name + " --> "+ doc_size + " --> "+ doc_type+ "\n";
                    }
                }
                txtAUser.append("\n" +temp + temp2);
                txtAUser.append(temp3);
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        usuario1 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tipo = new javax.swing.JLabel();
        docName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        print = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAUser = new javax.swing.JTextArea();
        usuario3 = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        startPage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        logo.setText("PRINT-IT");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

        title.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        title.setText("ELIMINAR DOCUMENTO");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        usuario1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        usuario1.setText("USUARIO");
        jPanel1.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        userName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(204, 204, 204));
        userName.setBorder(null);
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 330, 30));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 330, 20));

        tipo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        tipo.setText("NOMBRE DEL DOCUMENTO");
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        docName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        docName.setForeground(new java.awt.Color(204, 204, 204));
        docName.setBorder(null);
        docName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docNameActionPerformed(evt);
            }
        });
        jPanel1.add(docName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 330, 30));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 330, 20));

        print.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        print.setText("ELIMINAR");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 50, 30));

        txtAUser.setEditable(false);
        txtAUser.setBackground(new java.awt.Color(255, 255, 255));
        txtAUser.setColumns(20);
        txtAUser.setRows(5);
        jScrollPane1.setViewportView(txtAUser);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 310, 280));

        usuario3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        usuario3.setForeground(new java.awt.Color(255, 255, 255));
        usuario3.setText("NOMBRE USUARIO --> NOMBRE DOC --> TAMAÑO DOC ");
        jPanel2.add(usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 320, 20));

        usuario2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        usuario2.setForeground(new java.awt.Color(255, 255, 255));
        usuario2.setText("--> PRIORIDAD DOC.");
        jPanel2.add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 320, 20));

        title1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("LISTA DE DOCUMENTOS");
        jPanel2.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        startPage.setForeground(new java.awt.Color(255, 0, 0));
        startPage.setText("VOLVER A LA PÁGINA DE INICIO");
        startPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPageActionPerformed(evt);
            }
        });
        jPanel2.add(startPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 250, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(Regresar)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 330, 500));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("EN LA IMPRESORA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void docNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docNameActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed

        try{
            String user_name = userName.getText();
            String doc_name = docName.getText();
            //Si está vacío...
            if (user_name.isEmpty()){
                JOptionPane.showMessageDialog(null, "ERROR! Debe ingresar el nombre del usuario");
            }else if (doc_name.isEmpty()){
                JOptionPane.showMessageDialog(null, "ERROR! Debe ingresar el nombre del documento");
            }else{
                //si el usuario existe en el programa...
                if (v1.list.EncontrarPersona(user_name) != null){

                    for (int x = 0; x < v1.list.len(); x++){
                        Persona person = v1.list.get(x);
                        //ubicamos al usuario...
                        if (person.getName().equals(user_name) == true){
                            Lista<Documentos> docList = person.getdocumentos();

                            if(docList.EncontrarDocumento(doc_name) != null){

                                for (int j = 0; j < docList.len(); j++){
                                    Documentos doc_person = docList.get(j);

                                    //Imprimimos el documento ??????????????
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "ERROR! El documento: " + doc_name + " no existe en el programa, intente crearlo.");
                            }
                        }

                    }
                    //MOSTRARLOSSSS
                    /*txtAUser.setText("");
                    mostrarUsuarios();*/
                    //JOptionPane.showMessageDialog(null, "Se eliminó con éxito al documento: " + doc_name);
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR el usuario: " + user_name + " no está añadido en el programa, intente registrarlo!");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de usuarios.");
        }
    }//GEN-LAST:event_printActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void startPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startPageActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_startPageActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana8(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField docName;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logo;
    private javax.swing.JButton print;
    private javax.swing.JButton startPage;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextArea txtAUser;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel usuario1;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    // End of variables declaration//GEN-END:variables
}
