package Interface;

import Conexoes.MySQL;
import javax.swing.JOptionPane;
import Objetos.ObjUsuario;


public class Tela3CadastroUsuarioAdmin extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjUsuario novoUsuario = new ObjUsuario();

    public Tela3CadastroUsuarioAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnSalvar_Cliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        cbTipoUser = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel10.setBackground(new java.awt.Color(0, 51, 153));
        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CADASTRO DE CLIENTE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 794));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        btnVoltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 90));

        btnSalvar_Cliente.setBackground(new java.awt.Color(255, 102, 0));
        btnSalvar_Cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnSalvar_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar_Cliente.setText("SALVAR");
        btnSalvar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar_ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 640, 170, 60));

        jPanel3.setBackground(new java.awt.Color(231, 228, 228));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 74, 592, 45));
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 179, 592, 45));
        jPanel3.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 275, 592, 45));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel14.setText("NOME");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 47, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("USUÁRIO");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 152, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("SENHA");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 248, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setText("CPF");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 349, -1, -1));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 376, 360, 45));

        cbTipoUser.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cbTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Professor", "Administrador", "Responsavel" }));
        jPanel3.add(cbTipoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 220, 40));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Tipo Usuario");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 690, 470));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(121, 38, 180));
        jLabel17.setText("CADASTRO DE USUÁRIO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 450, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BORDA1.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, -20, 430, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Tela4Menu tela = new Tela4Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar_ClienteActionPerformed
        CadastraUsuario(novoUsuario);
    }//GEN-LAST:event_btnSalvar_ClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Tela3CadastroUsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3CadastroUsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3CadastroUsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3CadastroUsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tela3CadastroUsuarioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar_Cliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbTipoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    /*private void novoUsuario(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    private void CadastraUsuario(ObjUsuario novoUsuario) {

        if (txtNome.getText().equals("") || txtUsuario.getText().equals("") ||
                txtSenha.getText().equals("") || txtCPF.getText().equals("   .   .   -  ") ||
                cbTipoUser.getSelectedItem().equals("Selecionar")) {

            JOptionPane.showMessageDialog(null, "Todos os Campos sao Obrigatorios!!");
        } else {
            this.conectar.conectaBanco();

            novoUsuario.setUsuarioNome(txtNome.getText());
            novoUsuario.setUsuarioUserName(txtUsuario.getText());
            novoUsuario.setUsuarioSenha(txtSenha.getText());
            novoUsuario.setUsuarioCpf(txtCPF.getText());
            novoUsuario.setUsuarioTipo((String)cbTipoUser.getSelectedItem());

            try {

                this.conectar.insertSQL("INSERT INTO usuarios ("
                        + "usuario_nome,"
                        + "usuario_username,"
                        + "usuario_senha,"
                        + "usuario_cpf,"
                        + "usuario_tipo"
                        + ") VALUES ("
                        + "'" + novoUsuario.getUsuarioNome() + "',"
                        + "'" + novoUsuario.getUsuarioUserName() + "',"
                        + "'" + novoUsuario.getUsuarioSenha() + "',"
                        + "'" + novoUsuario.getUsuarioCpf() + "',"
                        + "'" + novoUsuario.getUsuarioTipo() + "'"
                        + ");");

            } catch (Exception e) {

                System.out.println("Erro ao cadastrar usuário " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário");

            } finally {
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Cadastro Realizado!");
                Tela4Menu tela = new Tela4Menu();
                tela.setVisible(true);
                dispose();
            }
        }
    }
}
