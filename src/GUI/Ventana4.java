/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Objetos.*;
import javax.swing.JOptionPane;
import Datos.*;


public class Ventana4 extends javax.swing.JFrame {
    
    public static Ventana1 v1;
    
    public Ventana4(Ventana1 v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null); //muestra la interfáz en el centro
        this.setSize(780, 502);
        mostrarUsuarios();
        
    }
    
    @SuppressWarnings("unchecked")
    public void mostrarUsuarios(){
        if (v1.list.isEmpty() == false){
            for (int x = 0; x < v1.list.len(); x++){
                String temp = "";
                String temp2 = "";
                String temp3= "";
                Persona person = v1.list.get(x);
                String name = person.getName();
                String prioridad = person.getprioridad();
                Lista<Documentos> doc = person.getdocumentos();
                if (doc.isEmpty()){
                    temp = name + " --> " + prioridad+ " --> ";
                    temp2 = "No hay documentos creados";
                    temp3= "";
                }else{
                    temp = name + " --> " + prioridad+ " --> ";
                    temp2= " --> DOCUMENTOS:\n";
                    for (int j=0 ; j < doc.len(); j++){
                        Documentos docs = doc.get(j);
                        String doc_name = docs.getName();
                        int doc_size = docs.gettamaño();
                        String doc_type = docs.gettipo();
                        temp3 +=  doc_name + " --> "+ doc_size + " --> "+ doc_type+  "\n";
                    }
                }
                txtAUser.append("\n" +temp + temp2);
                txtAUser.append(temp3);
            }
        }
    /*  public void mostrarUsuarios(){
        if (v1.list.isEmpty() == false){
            for (int x = 0; x < v1.list.len(); x++){
                String temp = "";
                Persona person = v1.list.get(x);
                String name = person.getName();
                String priority = person.getprioridad();
                temp = name + " --> "+ priority + "\n";
                txtAUser.append("\n" +temp);
            }
        }*/
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAUser = new javax.swing.JTextArea();
        title1 = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        usuario3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        next = new javax.swing.JButton();

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
        title.setText("ELIMINAR USUARIO");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        usuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        usuario.setText("USUARIO");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        userName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(204, 204, 204));
        userName.setBorder(null);
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 330, 30));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 330, 20));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 50, 30));

        txtAUser.setEditable(false);
        txtAUser.setBackground(new java.awt.Color(255, 255, 255));
        txtAUser.setColumns(20);
        txtAUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAUser.setRows(5);
        jScrollPane1.setViewportView(txtAUser);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 340, 300));

        title1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("LISTA DE USUARIOS");
        jPanel2.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        usuario2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        usuario2.setForeground(new java.awt.Color(255, 255, 255));
        usuario2.setText("TAMAÑO DOC --> PRIORIDAD DOC.");
        jPanel2.add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 320, 20));

        usuario3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        usuario3.setForeground(new java.awt.Color(255, 255, 255));
        usuario3.setText("NOMBRE USUARIO --> PRIORIDAD U. --> NOMBRE DOC --> ");
        jPanel2.add(usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 320, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(Regresar)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 380, 500));

        next.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        next.setText("ELIMINAR");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try{
            String name = userName.getText();
            //Si está vacío...
            if (name.isEmpty()){
                JOptionPane.showMessageDialog(null, "ERROR! Debe ingresar el nombre del usuario");
            }else{
                //si el usuario existe en el programa...
                if (v1.list.EncontrarPersona(name) != null){
                    for (int x = 0; x < v1.list.len(); x++){
                        Persona person = v1.list.get(x);
                        if (person.getName().equals(name) == true){
                            v1.list.pop(x);
                        }
                    }
                    txtAUser.setText("");
                    mostrarUsuarios();
                    JOptionPane.showMessageDialog(null, "Se eliminó con éxito al usuario: " + name);
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR el usuario: " + name + " no está añadido en el programa, intente registrarlo!");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de usuarios.");
        }
        
    }//GEN-LAST:event_nextActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logo;
    private javax.swing.JButton next;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextArea txtAUser;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    // End of variables declaration//GEN-END:variables
}
