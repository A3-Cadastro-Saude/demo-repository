/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela;

import javax.swing.JOptionPane;

/**
 *
 * @author erica
 */
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
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

        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        ckSenha = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        btLogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula de Java");
        setName("telaLogin"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(322, 265, 200, 40);

        txtSenha.setBorder(null);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(322, 369, 200, 40);

        ckSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ckSenha.setForeground(new java.awt.Color(255, 255, 255));
        ckSenha.setText("Mostrar senha");
        ckSenha.setInheritsPopupMenu(true);
        ckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(ckSenha);
        ckSenha.setBounds(370, 420, 170, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\e009412\\Downloads\\Tela_de_Login_2.png")); // NOI18N
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 890, 600);

        btLogar.setText("Logar");
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });
        getContentPane().add(btLogar);
        btLogar.setBounds(360, 470, 170, 40);

        setSize(new java.awt.Dimension(905, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        // TODO add your handling code here:
        String login, senha;
        login = txtUsuario.getText();
        senha = txtSenha.getText();
        
        if(login.equals("adm") && senha.equals("adm"))
        {
            JOptionPane.showMessageDialog(null, "Seja bem vindo!!!"); 
            abrirTelaMenu();

        }
        
        else
           JOptionPane.showMessageDialog(null,
               "ERRO. Usuário e/ou Senha inválido!");      
    }//GEN-LAST:event_btLogarActionPerformed

    
     public void abrirTelaMenu() {
        // Feche a tela de login
        dispose();

        // Crie e exiba a tela de menu
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);
    }
     
    private void ckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckSenhaActionPerformed

        
        if (ckSenha.isSelected()) {
                    txtSenha.setEchoChar((char) 0); // Exibe a senha
                } else {
                    txtSenha.setEchoChar('*'); // Oculta a senha
                }
    }//GEN-LAST:event_ckSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogar;
    private javax.swing.JCheckBox ckSenha;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}