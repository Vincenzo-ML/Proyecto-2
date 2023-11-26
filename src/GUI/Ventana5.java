/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import Objetos.*;
import Datos.*;


public class Ventana5 extends javax.swing.JFrame {
    
    public static Ventana1 v1;
    
    public Ventana5(Ventana1 v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null); //muestra la interfáz en el centro
        mostrarDocumentos();
    }
    
    
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        tipo = new javax.swing.JLabel();
        docSize = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        usuario = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAUser = new javax.swing.JTextArea();
        startPage = new javax.swing.JButton();
        title1 = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        usuario3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        usuario1 = new javax.swing.JLabel();
        docName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        tipo1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        next = new javax.swing.JButton();
        cmbType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 330, 20));

        tipo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        tipo.setText("NOMBRE DEL DOCUMENTO");
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        docSize.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        docSize.setForeground(new java.awt.Color(204, 204, 204));
        docSize.setBorder(null);
        docSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docSizeActionPerformed(evt);
            }
        });
        jPanel1.add(docSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 330, 30));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 330, 20));

        usuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        usuario.setText("TAMAÑO");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        title.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        title.setText("CREAR DOCUMENTO");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        logo.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        logo.setText("PRINT-IT");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

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
        txtAUser.setRows(5);
        jScrollPane1.setViewportView(txtAUser);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 280));

        startPage.setForeground(new java.awt.Color(255, 0, 0));
        startPage.setText("VOLVER A LA PÁGINA DE INICIO");
        startPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPageActionPerformed(evt);
            }
        });
        jPanel2.add(startPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 250, 30));

        title1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("LISTA DE DOCUMENTOS");
        jPanel2.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        usuario2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        usuario2.setForeground(new java.awt.Color(255, 255, 255));
        usuario2.setText("--> PRIORIDAD DOC.");
        jPanel2.add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 320, 20));

        usuario3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        usuario3.setForeground(new java.awt.Color(255, 255, 255));
        usuario3.setText("NOMBRE USUARIO --> NOMBRE DOC --> TAMAÑO DOC ");
        jPanel2.add(usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(Regresar)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 350, 500));

        userName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(204, 204, 204));
        userName.setBorder(null);
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 330, 30));

        usuario1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        usuario1.setText("USUARIO");
        jPanel1.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        docName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        docName.setForeground(new java.awt.Color(204, 204, 204));
        docName.setBorder(null);
        docName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docNameActionPerformed(evt);
            }
        });
        jPanel1.add(docName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 330, 30));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 330, 20));

        tipo1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        tipo1.setText("TIPO");
        jPanel1.add(tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 240, 20));

        next.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        next.setText("GUARDAR");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        cmbType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prioritario", "No Prioritario" }));
        jPanel1.add(cmbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docSizeActionPerformed
      
    }//GEN-LAST:event_docSizeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void docNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docNameActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
       
        String user = userName.getText();
        String doc = docName.getText();
        String type = cmbType.getSelectedItem().toString();
        String sizetxt = docSize.getText();
        try{
            //Si está vacío...
            if (user.isEmpty()){
                JOptionPane.showMessageDialog(null, "ERROR! Debe ingresar el nombre del usuario");
            }else if (doc.isEmpty()){
                JOptionPane.showMessageDialog(null, "ERROR! Debe ingresar el nombre del documento");
            }else if (sizetxt.isEmpty()){
                JOptionPane.showMessageDialog(null, "ERROR! Debe ingresar el tamaño del documento");
            }else{
                //Si el tamaño no es un número..
                if (sizetxt.matches("[0-9]+")){
                    int size = Integer.parseInt(sizetxt); 
                    //si el usuario existe en el programa...
                    if (v1.list.EncontrarPersona(user) != null){
                        for (int x = 0; x < v1.list.len(); x++){
                            Persona person = v1.list.get(x);
                            if (person.getName().equals(user) == true) {
                                Lista<Documentos> docList = person.getdocumentos();
                                // Obtenemos la lista de documentos del usuario
                                if (docList.isEmpty()) {
                                    Documentos newdoc = new Documentos(doc, size, type);                
                                    person.addDocumento(newdoc);
                                    txtAUser.setText("");
                                    mostrarDocumentos();
                                    JOptionPane.showMessageDialog(null, "Se creó con éxito el documento: " + doc);
                                } else {
                                    // Si la lista de documentos no está vacía, la recorremos...
                                    boolean documentExists = false;
                                    for (int j = 0; j < docList.len(); j++) {
                                        Documentos doc_person = docList.get(j);
                                        // Revisamos que el nombre del documento no esté repetido...
                                        if (doc_person.getName().equals(doc)) {
                                            documentExists = true;
                                            break;
                                        }
                                    }
                                    if (documentExists) {
                                        JOptionPane.showMessageDialog(null, "ERROR! Ya existe un documento con ese nombre");
                                    } else {
                                        Documentos newdoc = new Documentos(doc, size, type);                                
                                        person.addDocumento(newdoc);
                                        txtAUser.setText("");
                                        mostrarDocumentos();
                                        JOptionPane.showMessageDialog(null, "Se creó con éxito el documento: " + doc);
                                    }
                                }
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR el usuario: " + user + " no está añadido en el programa, intente registrarlo!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "DATO INVÁLIDO! El tamaño del documento debe ser un número");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
    }
       
                
    }//GEN-LAST:event_nextActionPerformed

    private void startPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startPageActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_startPageActionPerformed

   
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
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana5(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JTextField docName;
    private javax.swing.JTextField docSize;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logo;
    private javax.swing.JButton next;
    private javax.swing.JButton startPage;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel tipo1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextArea txtAUser;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    // End of variables declaration//GEN-END:variables
}
