/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela;

import Classes.Usuario;
import javax.swing.JOptionPane;

public class TelaCadUsu extends javax.swing.JFrame {

    public TelaCadUsu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        ckAdm = new javax.swing.JCheckBox();
        txtConfSenha = new javax.swing.JPasswordField();
        ckSenha = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtNome.setBorder(null);
        getContentPane().add(txtNome);
        txtNome.setBounds(115, 160, 136, 16);

        txtEmail.setBorder(null);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(115, 270, 136, 16);

        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(115, 214, 136, 16);

        txtSenha.setBorder(null);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(115, 323, 136, 16);

        ckAdm.setForeground(new java.awt.Color(255, 255, 255));
        ckAdm.setText("Administrador");
        getContentPane().add(ckAdm);
        ckAdm.setBounds(140, 440, 100, 20);

        txtConfSenha.setBorder(null);
        txtConfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtConfSenha);
        txtConfSenha.setBounds(115, 377, 136, 16);

        ckSenha.setForeground(new java.awt.Color(255, 255, 255));
        ckSenha.setText("Exibir Senha");
        ckSenha.setActionCommand("Exibir Senha");
        ckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(ckSenha);
        ckSenha.setBounds(140, 410, 90, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 60, 0, 3);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Desktop\\Nome_3.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 400, 580);

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 473, 120, 20);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(150, 514, 80, 20);

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Incluir");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Excluir");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Alterar");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Consultar");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Fechar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(416, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfSenhaActionPerformed

    private void ckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckSenhaActionPerformed

                if (ckSenha.isSelected()) {
                    // Exibe a senha
                    txtSenha.setEchoChar((char) 0);
                    txtConfSenha.setEchoChar((char) 0);
                } else {
                    // Oculta a senha
                    txtSenha.setEchoChar('*');
                    txtConfSenha.setEchoChar('*');

                }
        
        
    }//GEN-LAST:event_ckSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Usuario usu = new Usuario();
        
        String senha, confsenha;
        
        if(txtNome.getText() .isEmpty())
            JOptionPane.showMessageDialog(null, "campo nome invalido");
            else{
            usu.setNome(txtNome.getText());
        }
        senha = txtSenha.getText();
        confsenha = txtConfSenha.getText();
        
        if(senha.equals(confsenha) && !senha.isEmpty())
            usu.setSenha(senha);
            else{
                    JOptionPane.showMessageDialog(null, "Campo de senha Invalido");
            return;
                    }
            usu.setUsuario(txtUsuario.getText());
            usu.setEmail(txtEmail.getText());
                        
            if(ckAdm.isSelected())
                usu.setAdm(1);
            else{
                usu.setAdm(0);
            }
            
            
            usu.IncluiUsu();
            
            if (!txtNome.getText().isEmpty() && !txtUsuario.getText().isEmpty() && !txtEmail.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        
        dispose();
    }

// TODO add your handling code here:
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox ckAdm;
    private javax.swing.JCheckBox ckSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
