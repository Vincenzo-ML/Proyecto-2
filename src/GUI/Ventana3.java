/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Objetos.*;
import javax.swing.JOptionPane;

public class Ventana3 extends javax.swing.JFrame {
    
    public static Ventana1 v1;

    public Ventana3(Ventana1 v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(780, 502);
        mostrarUsuarios();
        
    }
    public void mostrarUsuarios(){
        if (v1.list.isEmpty() == false){
            for (int x = 0; x < v1.list.len(); x++){
                String temp = "";
                Persona person = v1.list.get(x);
                String name = person.getName();
                String priority = person.getprioridad();
                temp = name + " --> "+ priority + "\n";
                txtAUser.append("\n" +temp);
            }
        }
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        background = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        usuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAUser = new javax.swing.JTextArea();
        usuario1 = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        cmbPrioridad = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        logo.setText("PRINT-IT");
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

        title.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        title.setText("AGREGAR USUARIO");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        tipo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        tipo.setText("TIPO");
        background.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        userName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(204, 204, 204));
        userName.setBorder(null);
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        background.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 330, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 240, 20));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 330, 20));

        usuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        usuario.setText("USUARIO");
        background.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 19, 50, 30));

        txtAUser.setEditable(false);
        txtAUser.setBackground(new java.awt.Color(255, 255, 255));
        txtAUser.setColumns(20);
        txtAUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAUser.setRows(5);
        jScrollPane3.setViewportView(txtAUser);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 280, 300));

        usuario1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        usuario1.setForeground(new java.awt.Color(255, 255, 255));
        usuario1.setText("PRIORIDAD");
        jPanel1.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        usuario2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        usuario2.setForeground(new java.awt.Color(255, 255, 255));
        usuario2.setText("NOMBRE --> ");
        jPanel1.add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        title1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("LISTA DE USUARIOS");
        jPanel1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(Regresar)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 340, 500));

        save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        save.setText("AGREGAR");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        background.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        cmbPrioridad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prioridad Alta", "Prioridad Media", "Prioridad Baja" }));
        background.add(cmbPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, 30));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
            String name = userName.getText();
            String priority = cmbPrioridad.getSelectedItem().toString();
            if (name.isEmpty()){
                JOptionPane.showMessageDialog(null, "ERROR! Debe ingresar el nombre del usuario");
            }else{
                if (v1.list.EncontrarPersona(name) != null){
                    JOptionPane.showMessageDialog(null, "ERROR el usuario ya esta registrado!");
                }else{
                    Persona user = new Persona();
                    user.setName(name);
                    user.setprioridad(priority);
                    v1.list.append(user);
                    String temp = name +" --> " + priority + "\n";
                    txtAUser.append("\n"+temp);
                    JOptionPane.showMessageDialog(null, "Se agregó con éxito al usuario: " + name);
                }
            }
       
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton save;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextArea txtAUser;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    private javax.swing.JLabel usuario2;
    // End of variables declaration//GEN-END:variables
}
