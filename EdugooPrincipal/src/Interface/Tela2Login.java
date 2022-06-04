package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import Conexoes.MySQL;
import Objetos.ObjUsuario;
import java.sql.Connection;

public class Tela2Login extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjUsuario objUsuario = new ObjUsuario();

    private Connection conn;

    public Tela2Login() {
        initComponents();
        jPanel1.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1260, 794));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(380, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(237, 237, 237));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuario1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadeado1.png"))); // NOI18N

        campoUsuario.setBackground(new java.awt.Color(237, 237, 237));
        campoUsuario.setFont(new java.awt.Font("Gadugi", 2, 24)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        campoUsuario.setText("Usuário");
        campoUsuario.setToolTipText("");
        campoUsuario.setBorder(null);
        campoUsuario.setCaretColor(new java.awt.Color(102, 153, 255));
        campoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        campoUsuario.setName(""); // NOI18N
        campoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoUsuarioFocusLost(evt);
            }
        });

        campoSenha.setBackground(new java.awt.Color(237, 237, 237));
        campoSenha.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(204, 204, 204));
        campoSenha.setText("**********");
        campoSenha.setBorder(null);
        campoSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoSenhaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 640, -1));

        btnLogin.setBackground(new java.awt.Color(255, 153, 0));
        btnLogin.setFont(new java.awt.Font("Fredoka One", 0, 20)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ENTRAR");
        btnLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 220, 52));

        btnNovo.setBackground(new java.awt.Color(0, 0, 102));
        btnNovo.setFont(new java.awt.Font("Fredoka One", 0, 20)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 220, 50));

        jPanel2.setBackground(new java.awt.Color(121, 38, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ICONE1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 790));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EDUGOO.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 340, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BORDA1.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, -20, 430, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Logar(BuscarUsuario(objUsuario));
    }//GEN-LAST:event_btnLoginActionPerformed

    private void campoUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoUsuarioFocusLost
        if (campoUsuario.getText().equals("")) {
            campoUsuario.setText("Usuário");
            campoUsuario.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_campoUsuarioFocusLost

    private void campoUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoUsuarioFocusGained
        if (campoUsuario.getText().equals("Usuário")) {
            campoUsuario.setText("");
            campoUsuario.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_campoUsuarioFocusGained

    private void campoSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusLost
        if (campoSenha.getText().equals("")) {
            campoSenha.setText("**********");
            campoSenha.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_campoSenhaFocusLost

    private void campoSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusGained
        if (campoSenha.getText().equals("**********")) {
            campoSenha.setText("");
            campoSenha.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_campoSenhaFocusGained

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Tela3CadastroUsuario tela = new Tela3CadastroUsuario();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tela2Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNovo;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

    private ObjUsuario BuscarUsuario(ObjUsuario objUsuario) {

        this.conectar.conectaBanco();
        
        String username = campoUsuario.getText();
        String senha = campoSenha.getText();

        try {
            this.conectar.executarSQL(
                    "SELECT "
                    + "usuario_id,"
                    + "usuario_nome,"
                    + "usuario_username,"
                    + "usuario_senha,"
                    + "usuario_cpf,"
                    + "usuario_tipo"
                    + " FROM"
                    + " usuarios"
                    + " WHERE"
                    + " usuario_username = '" + username + "' and usuario_senha = '" +senha+ "'"
                    + ";"
            );

            while (this.conectar.getResultSet().next()) {

                objUsuario.setUsuarioId(Integer.parseInt(this.conectar.getResultSet().getString(1)));
                objUsuario.setUsuarioNome(this.conectar.getResultSet().getString(2));
                objUsuario.setUsuarioUserName(this.conectar.getResultSet().getString(3));
                objUsuario.setUsuarioSenha(this.conectar.getResultSet().getString(4));
                objUsuario.setUsuarioCpf(this.conectar.getResultSet().getString(5));
                objUsuario.setUsuarioTipo(this.conectar.getResultSet().getString(6));

            }
            
            if (objUsuario.getUsuarioUserName().equals("")) {
//                JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos!");
                objUsuario = null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar usuario " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar Usuario");
            
            objUsuario = null;
        } finally {
            this.conectar.fechaBanco();
        }
        return objUsuario;
    }
    
    private void Logar(ObjUsuario objUsuario){
        
        String tipo;
        
        if (objUsuario == null) {
            JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos!");    
        } else {
            tipo = objUsuario.getUsuarioTipo();
            
            switch(tipo){
                case "Administrador":
                    Tela4Menu telamenu = new Tela4Menu();
                    telamenu.setVisible(true);
                    System.out.println("Entrou no menu de Administrador");
                    dispose();
                    break;
                case "Professor":
                    Tela4MenuProfessor telamenuProf = new Tela4MenuProfessor();
                    telamenuProf.setVisible(true);
                    System.out.println("Entrou no menu de professor");
                    dispose();
                    break;
                case "Responsavel":
                    Tela4MenuResponsavel telamenuResp = new Tela4MenuResponsavel();
                    telamenuResp.setVisible(true);
                    System.out.println("Entrou no menu de Responsavel");
                    dispose();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Algo deu errado: Switch, tela Login, Função Logar(ObjUsuario)");
                    break;
            }
        }
    }
}
