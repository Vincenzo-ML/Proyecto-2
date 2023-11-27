/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import Objetos.*;
import Datos.*;
import Nodos.*;
import static GUI.Ventana5.v1;



public class Ventana7 extends javax.swing.JFrame {

    public static Ventana1 v1;
    public static Ventana9 v9;
    
    public Ventana7(Ventana1 v1) {
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
        docName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAUser = new javax.swing.JTextArea();
        usuario3 = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        showPrinter2 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        tipo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        usuario1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        userName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        docName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        docName.setForeground(new java.awt.Color(204, 204, 204));
        docName.setBorder(null);
        docName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docNameActionPerformed(evt);
            }
        });
        jPanel1.add(docName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 330, 30));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 50, 30));

        txtAUser.setEditable(false);
        txtAUser.setBackground(new java.awt.Color(255, 255, 255));
        txtAUser.setColumns(20);
        txtAUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAUser.setRows(5);
        jScrollPane1.setViewportView(txtAUser);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, 280));

        usuario3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        usuario3.setForeground(new java.awt.Color(255, 255, 255));
        usuario3.setText("NOMBRE USUARIO --> NOMBRE DOC --> TAMAÑO DOC ");
        jPanel2.add(usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 320, 20));

        usuario2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        usuario2.setForeground(new java.awt.Color(255, 255, 255));
        usuario2.setText("--> PRIORIDAD DOC.");
        jPanel2.add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, 20));

        title1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("LISTA DE DOCUMENTOS");
        jPanel2.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(Regresar)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        showPrinter2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        showPrinter2.setText("VER IMPRESORA");
        showPrinter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrinter2ActionPerformed(evt);
            }
        });
        jPanel2.add(showPrinter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 330, 500));

        print.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        print.setText("IMPRIMIR");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        tipo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        tipo.setText("NOMBRE DEL DOCUMENTO");
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 330, 20));

        usuario1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        usuario1.setText("USUARIO");
        jPanel1.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        title.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        title.setText("IMPRIMIR DOCUMENTO");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        logo.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        logo.setText("PRINT-IT");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 330, 20));

        userName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(204, 204, 204));
        userName.setBorder(null);
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 330, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

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
                                    long time = v1.func.SentTime(v1.st);
                                    if (doc_person.gettipo().equalsIgnoreCase("Prioritario") == true){
                                        String newTipo = person.getprioridad();
                                        if (newTipo.equalsIgnoreCase("Prioridad Alta")== true){
                                            long finaltime = time / 4;
                                            NMonticulo nodo = new NMonticulo(finaltime, doc_person);
                                            docList.pop(j);
                                            v1.monticulo.insert(nodo);
                                            NHash nodohash = new NHash(user_name, doc_person, finaltime);
                                            v1.hasht.insert(nodohash);
                                        }else if (newTipo.equalsIgnoreCase("Prioridad Media") == true){
                                            long finaltime = time /3;
                                            NMonticulo nodo = new NMonticulo(finaltime, doc_person);
                                            docList.pop(j);
                                            v1.monticulo.insert(nodo);
                                            NHash nodohash = new NHash(user_name, doc_person, finaltime);
                                            v1.hasht.insert(nodohash);
                                        }else{
                                            long finaltime = time/2;
                                            NMonticulo nodo = new NMonticulo(finaltime, doc_person);
                                            docList.pop(j);
                                            v1.monticulo.insert(nodo);
                                            NHash nodohash = new NHash(user_name, doc_person, finaltime);
                                            v1.hasht.insert(nodohash);
                                        }
                                    }else{
                                        NMonticulo nodo = new NMonticulo(time, doc_person);
                                        docList.pop(j);
                                        v1.monticulo.insert(nodo);
                                        NHash nodohash = new NHash(user_name, doc_person, time);
                                        v1.hasht.insert(nodohash);
                                    }
                                }
                                txtAUser.setText("");
                                mostrarDocumentos();
                                JOptionPane.showMessageDialog(null, "Se envió a la improsora con éxito el documento: " + doc_name);
                                break;
                            }else{
                                JOptionPane.showMessageDialog(null, "ERROR! El documento: " + doc_name + " no existe en el programa, intente crearlo.");
                            }
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR el usuario: " + user_name + " no está añadido en el programa, intente registrarlo!");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de usuarios.");
        }
    }//GEN-LAST:event_printActionPerformed

    private void docNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docNameActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void showPrinter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrinter2ActionPerformed
        v1.monticulo.VerArbol();
    }//GEN-LAST:event_showPrinter2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana7(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField docName;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logo;
    private javax.swing.JButton print;
    private javax.swing.JButton showPrinter2;
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
