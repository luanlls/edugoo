package Interface;

import Conexoes.MySQL;
import javax.swing.JOptionPane;
import Objetos.ObjFuncionario;
import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;

public class Tela6Cadastro extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjFuncionario novoFuncionario = new ObjFuncionario();

    public Tela6Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        cbSexo = new javax.swing.JComboBox<>();
        txtCPF = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnVoltar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        txtNumCasa = new javax.swing.JTextField();
        txtCompl = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        btnCancelar_Cliente = new javax.swing.JButton();
        btnSalvar_Cliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dataN = new com.toedter.calendar.JDateChooser();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbFase = new javax.swing.JComboBox<>();
        cbPeriodo = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jLabel10.setBackground(new java.awt.Color(0, 51, 153));
        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CADASTRO DE CLIENTE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 794));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("E-mail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Data de Nascimento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("Sexo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("CPF");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 1000, 45));
        jPanel1.add(txtEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 1030, 45));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Feminino", "Masculino" }));
        jPanel1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 250, 160, 45));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 200, 45));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 360, 180, 45));

        btnVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 80));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setText("Endereço");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 480, 45));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel12.setText("No.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Complemento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel13.setText("Bairro");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel14.setText("Cidade");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel15.setText("Estado");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 540, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel16.setText("CEP");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, -1, -1));

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, 170, 45));

        txtNumCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCasaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 460, 110, 45));
        jPanel1.add(txtCompl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 230, 45));
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 290, 45));
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 310, 45));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel1.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 570, 80, 45));

        btnCancelar_Cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnCancelar_Cliente.setText("CANCELAR");
        btnCancelar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 170, 60));

        btnSalvar_Cliente.setBackground(new java.awt.Color(255, 102, 0));
        btnSalvar_Cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnSalvar_Cliente.setText("SALVAR");
        btnSalvar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar_ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 700, 170, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EDUGOO2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ENFEITE2.jpg"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(121, 38, 180));
        jLabel3.setText("CADASTRO DE FUNCIONARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 720, 80));

        dataN.setToolTipText("");
        jPanel1.add(dataN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 200, 40));
        dataN.getAccessibleContext().setAccessibleName("");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Professor", "Administrador" }));
        jPanel1.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 160, 50));

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel17.setText("Categoria");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel19.setText("Fase:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 121, -1, 30));

        cbFase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Berçário", "Maternal 1", "Maternal 2", "Infantil 1", "Infantil 2", "Nenhum" }));
        jPanel1.add(cbFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 160, 160, 40));

        cbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Parcial Manhã", "Parcial Tarde", "Semi-integral", "Integral" }));
        jPanel1.add(cbPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 200, 40));

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel20.setText("Período:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 80, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("*");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("*");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 220, 10, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("*");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 120, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("*");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("*");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        Tela4Menu tela = new Tela4Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnSalvar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar_ClienteActionPerformed
        CadastraFuncionario(novoFuncionario);
    }//GEN-LAST:event_btnSalvar_ClienteActionPerformed

    private void txtNumCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCasaKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumCasaKeyTyped

    private void btnCancelar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_ClienteActionPerformed
        Tela4Menu tela = new Tela4Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelar_ClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Tela6Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela6Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela6Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela6Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela6Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_Cliente;
    private javax.swing.JButton btnSalvar_Cliente;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbFase;
    private javax.swing.JComboBox<String> cbPeriodo;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dataN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCompl;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumCasa;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void CadastraFuncionario(ObjFuncionario novoFuncionario) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateNasc = sdf.format(dataN.getDate());

            if (cbCategoria.getSelectedItem().equals("Selecionar") || cbPeriodo.getSelectedItem().equals("Selecionar")
                    || cbFase.getSelectedItem().equals("Selecionar") || txtNome.getText().equals("")
                    || txtCPF.getText().equals("   .   .   -  ") || dateNasc.equals("")) {

                JOptionPane.showMessageDialog(null, "Campos com (*) sao Obrigatorios!!");
            } else {
                this.conectar.conectaBanco();

                novoFuncionario.setFuncCategoria((String) cbCategoria.getSelectedItem());
                novoFuncionario.setFuncPeriodo((String) cbPeriodo.getSelectedItem());
                novoFuncionario.setFuncFase((String) cbFase.getSelectedItem());
                novoFuncionario.setFuncNome(txtNome.getText());
                novoFuncionario.setFuncSexo((String) cbSexo.getSelectedItem());
                novoFuncionario.setFuncDataN(dateNasc);
                novoFuncionario.setFuncCPF(txtCPF.getText());
                novoFuncionario.setFuncEmail(txtEmail.getText());
                novoFuncionario.setFuncTelefone(txtTelefone.getText());
                novoFuncionario.setFuncEndereco(txtEnd.getText());
                novoFuncionario.setFuncNo(txtNumCasa.getText());
                novoFuncionario.setFuncCompl(txtCompl.getText());
                novoFuncionario.setFuncBairro(txtBairro.getText());
                novoFuncionario.setFuncCidade(txtCidade.getText());
                novoFuncionario.setFuncCep(txtCEP.getText());
                novoFuncionario.setFuncEstado((String) cbEstado.getSelectedItem());

                try {

                    this.conectar.insertSQL("INSERT INTO funcionarios ("
                            + "funcionario_categoria,"
                            + "funcionario_periodo,"
                            + "funcionario_fase,"
                            + "funcionario_nome,"
                            + "funcionario_sexo,"
                            + "funcionario_datan,"
                            + "funcionario_cpf,"
                            + "funcionario_email,"
                            + "funcionario_telefone,"
                            + "funcionario_endereco,"
                            + "funcionario_compl,"
                            + "funcionario_no,"
                            + "funcionario_bairro,"
                            + "funcionario_cidade,"
                            + "funcionario_cep,"
                            + "funcionario_estado"
                            + ") VALUES ("
                            + "'" + novoFuncionario.getFuncCategoria() + "',"
                            + "'" + novoFuncionario.getFuncPeriodo() + "',"
                            + "'" + novoFuncionario.getFuncFase() + "',"
                            + "'" + novoFuncionario.getFuncNome() + "',"
                            + "'" + novoFuncionario.getFuncSexo() + "',"
                            + "'" + novoFuncionario.getFuncDataN() + "',"
                            + "'" + novoFuncionario.getFuncCPF() + "',"
                            + "'" + novoFuncionario.getFuncEmail() + "',"
                            + "'" + novoFuncionario.getFuncTelefone() + "',"
                            + "'" + novoFuncionario.getFuncEndereco() + "',"
                            + "'" + novoFuncionario.getFuncCompl() + "',"
                            + "'" + novoFuncionario.getFuncNo() + "',"
                            + "'" + novoFuncionario.getFuncBairro() + "',"
                            + "'" + novoFuncionario.getFuncCidade() + "',"
                            + "'" + novoFuncionario.getFuncCep() + "',"
                            + "'" + novoFuncionario.getFuncEstado() + "'"
                            + ");");

                } catch (Exception e) {

                    System.out.println("Erro ao cadastrar cliente " + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente");

                } finally {
                    this.conectar.fechaBanco();
                    JOptionPane.showMessageDialog(null, "Cadastro Realizado!");
                    Tela4Menu tela = new Tela4Menu();
                    tela.setVisible(true);
                    dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campos com (*) sao Obrigatorios!!");
        }
    }
}
