/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Datos.*;
import Objetos.*;
import javax.swing.JOptionPane;


public class Ventana4 extends javax.swing.JFrame {
    
    public static Ventana1 v1;
    
    public Ventana4(Ventana1 v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null); //muestra la interfáz en el centro
        this.setSize(710,502);
        mostrarUsuarios();
        
    }
    
    @SuppressWarnings("unchecked")
    public void mostrarUsuarios(){
        this.txtAUser.setText("NOMBRE DE USUARIO, TIPO DE USUARIO");
        
        if (v1.list.isEmpty() == false){
            for (int x = 0; x < v1.list.len(); x++){
                String temp = "";
                Persona person = v1.list.get(x);
                String person_name = person.getName();
                String person_prioridad = person.getprioridad();
                temp = person_name + person_prioridad + "\n";
                txtAUser.append("\n" +temp);
            }
        }
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
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        userName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(204, 204, 204));
        userName.setText("Ingrese el nombre de usuario");
        userName.setBorder(null);
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 330, 30));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 330, 20));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 16, 40, 30));

        txtAUser.setEditable(false);
        txtAUser.setBackground(new java.awt.Color(255, 255, 255));
        txtAUser.setColumns(20);
        txtAUser.setRows(5);
        jScrollPane1.setViewportView(txtAUser);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 150, 280, 300));

        title1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        title1.setText("USUARIOS");
        jPanel2.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 360, 500));

        next.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        next.setText("GUARDAR");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

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
        /*this.name_user = "@" + nameUser.getText().toLowerCase();
        try{
            //Si está vacío...
            if (name_user.isEmpty()){
                JOptionPane.showMessageDialog(null, "ERROR! Debe ingresar el nombre del usuario");

            }else{
                //si el usuario existe en el programa..
                if (v1.grafo.EncontrarPersona(name_user) != null){
                    this.add_conocido = "@" + conocidosUser.getText().toLowerCase();

                    //si la relación ya existe...
                    if (v1.grafo.edgeExist(name_user, add_conocido, v1.grafo.EncontrarPersona(name_user)) == true){
                        JOptionPane.showMessageDialog(null, "La relación entre: " + name_user +" y "+ add_conocido+" ya existe!");

                        //si la relacion es entre un mismo usuario...
                    }else if (name_user.equals(add_conocido)){
                        JOptionPane.showMessageDialog(null, "ERROR! No se puede hacer una relación entre un mismo usuarios.");

                    }else{
                        //Si existe el usuario de la relacion en el programa...
                        if(v1.grafo.EncontrarPersona(add_conocido)!= null){
                            v1.grafo.AgregarArco(name_user, add_conocido);
                            JOptionPane.showMessageDialog(null, "Se agregó con éxito la relación entre: " + name_user +" y "+ add_conocido);
                            this.setVisible(false);
                            v1.setVisible(true);

                        }else{
                            JOptionPane.showMessageDialog(null, "ERROR: el usuario "+ add_conocido+ " no está añadido en el programa, intente registrarlo!");
                        }
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "ERROR: el usuario "+ name_user+ " no está añadido en el programa, intente registrarlo!");
                }

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de usuarios.");
        }*/
    }//GEN-LAST:event_nextActionPerformed

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
    // End of variables declaration//GEN-END:variables
}
