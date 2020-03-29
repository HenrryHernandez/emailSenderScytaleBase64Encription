
import base64.Desencriptar;
import base64.Encriptar;
import javax.swing.JOptionPane;
import scytale.scytale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author henrryhernandez
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnEncriptar = new javax.swing.JButton();
        btnDesencriptar = new javax.swing.JButton();
        rbMandarEncriptado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMensaje.setColumns(20);
        txtMensaje.setRows(5);
        jScrollPane1.setViewportView(txtMensaje);

        txtChat.setColumns(20);
        txtChat.setRows(5);
        jScrollPane3.setViewportView(txtChat);

        btnEnviar.setText("Enviar como mail");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnEncriptar.setText("Encriptar con Base64");
        btnEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncriptarActionPerformed(evt);
            }
        });

        btnDesencriptar.setText("Desencriptar con Base64");
        btnDesencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencriptarActionPerformed(evt);
            }
        });

        rbMandarEncriptado.setText("Mandar Encriptado con Base64 + Scytale");
        rbMandarEncriptado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMandarEncriptadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEncriptar)
                            .addGap(34, 34, 34)
                            .addComponent(btnDesencriptar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(rbMandarEncriptado))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncriptar)
                    .addComponent(btnDesencriptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEnviar)
                        .addComponent(rbMandarEncriptado)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMandarEncriptadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMandarEncriptadoActionPerformed

    }//GEN-LAST:event_rbMandarEncriptadoActionPerformed

    private void btnEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncriptarActionPerformed
        //Este boton hace las llamadas correspondientes a las clases y metodos para encriptar
        if (txtMensaje.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese texto a Desencriptar");
        } else {
            Encriptar encriptar = new Encriptar(txtMensaje.getText());
            String palabraEncriptada = encriptar.getPalabraEncriptada();
            txtChat.setText("");
            txtChat.setText(palabraEncriptada);
        }
    }//GEN-LAST:event_btnEncriptarActionPerformed

    private void btnDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencriptarActionPerformed
        //Este boton hace las llamadas correspondientes a las clases y metodos para desencriptar
        if (txtMensaje.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese texto a Desencriptar");
        } else {
            Desencriptar desencriptar = new Desencriptar(txtMensaje.getText());
            String palabraEncriptada = desencriptar.getPalabraDesencriptada();
            txtChat.setText("");
            txtChat.setText(palabraEncriptada);
        }
    }//GEN-LAST:event_btnDesencriptarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (!rbMandarEncriptado.isSelected()) { //Si el checkbox NO esta selccionado se envia todo sin encriptar
            new enviar(txtMensaje.getText()).setVisible(true);
        } else { //Si el checkbox ESTA selccionado se envia todo encriptado
            String palabra;
            int columnas = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de columnas para encriptar con Scytale"));
            palabra = new scytale(txtMensaje.getText(), columnas).getPalabraEncriptada();
            palabra = new Encriptar(palabra).getPalabraEncriptada();
            new enviar(palabra).setVisible(true);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesencriptar;
    private javax.swing.JButton btnEncriptar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JRadioButton rbMandarEncriptado;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}
