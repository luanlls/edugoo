package Interface;

import javax.swing.JOptionPane;
import Conexoes.MySQL;
import Objetos.ObjConsulta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tela7Consultar extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjConsulta objConsulta = new ObjConsulta();

    public Tela7Consultar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCampoNomeConsulta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtUf = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        txtCompl = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        dataN = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(121, 38, 180));
        jLabel2.setText("CONSULTA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        txtCampoNomeConsulta.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txtCampoNomeConsulta.setForeground(new java.awt.Color(204, 204, 204));
        txtCampoNomeConsulta.setText("Digite o nome para consulta");
        txtCampoNomeConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCampoNomeConsultaMouseClicked(evt);
            }
        });
        jPanel1.add(txtCampoNomeConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 500, 50));

        btnBuscar.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 140, 50));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Sexo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Data de Nasc.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("CPF");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setText("Telefone");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setText("Endereço");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setText("Complemento");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel12.setText("Cidade");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel13.setText("No.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel14.setText("Bairro");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel15.setText("CEP");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel16.setText("UF");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 640, -1, -1));

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 130, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 90));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 204));
        jLabel17.setText("______________________________________________________________________________________________________________________________");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 910, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/borda2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 520, 390));

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 190, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BORDA1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 340, 350));

        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 220, 50));

        txtSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 170, 50));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 450, 50));

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 570, 50));

        txtCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 180, 50));

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 290, 50));

        txtUf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 60, 50));

        txtNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 90, 50));

        txtCompl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtCompl, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 270, 50));

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 330, 50));

        cbTipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Funcionario", "Aluno" }));
        jPanel1.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 140, 50));

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel18.setText("Tipo:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        dataN.setToolTipText("");
        jPanel1.add(dataN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 200, 50));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("*");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("*");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Tela4Menu tela = new Tela4Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Consultar(objConsulta);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCampoNomeConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCampoNomeConsultaMouseClicked
        txtCampoNomeConsulta.setText("");
        txtCampoNomeConsulta.setFont(txtCpf.getFont());
        txtCampoNomeConsulta.setForeground(txtCpf.getForeground());
    }//GEN-LAST:event_txtCampoNomeConsultaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Editar(objConsulta);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Deletar(objConsulta);
    }//GEN-LAST:event_btnExcluirActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela7Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela7Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela7Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela7Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela7Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cbTipo;
    private com.toedter.calendar.JDateChooser dataN;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCampoNomeConsulta;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCompl;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables

    private void Consultar(ObjConsulta objConsulta) {
        SimpleDateFormat sdfBr = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String consultaNome = this.txtCampoNomeConsulta.getText();
        String consultaTipo = ((String) this.cbTipo.getSelectedItem());
        String nomeTabela;

        if (consultaNome.equals("") || consultaNome.equals("Digite o nome para consulta") || consultaTipo.equals("Selecionar")) {
            JOptionPane.showMessageDialog(null, "Por favor inserir Nome e Tipo!!");
        } else {

            if (consultaTipo.equals("Funcionario")) {
                nomeTabela = "funcionarios";
            } else {
                nomeTabela = "alunos";
            }

            try {
                this.conectar.conectaBanco();

                this.conectar.executarSQL(
                        "SELECT "
                        + "*"
                        + " FROM"
                        + " " + nomeTabela
                        + " WHERE "
                        + consultaTipo.toLowerCase() + "_nome = '" + consultaNome + "'"
                        + ";"
                );

                while (this.conectar.getResultSet().next()) {

                    objConsulta.setConsId(this.conectar.getResultSet().getInt(1));
                    objConsulta.setConsCategoria(this.conectar.getResultSet().getString(2));
                    objConsulta.setConsPeriodo(this.conectar.getResultSet().getString(3));
                    objConsulta.setConsFase(this.conectar.getResultSet().getString(4));
                    objConsulta.setConsNome(this.conectar.getResultSet().getString(5));
                    objConsulta.setConsSexo(this.conectar.getResultSet().getString(6));
                    objConsulta.setConsDataN((String) this.conectar.getResultSet().getString(7));
                    objConsulta.setConsCPF(this.conectar.getResultSet().getString(8));
                    objConsulta.setConsEmail(this.conectar.getResultSet().getString(9));
                    objConsulta.setConsTelefone(this.conectar.getResultSet().getString(10));
                    objConsulta.setConsEndereco(this.conectar.getResultSet().getString(11));
                    objConsulta.setConsCompl(this.conectar.getResultSet().getString(12));
                    objConsulta.setConsNo(this.conectar.getResultSet().getString(13));
                    objConsulta.setConsBairro(this.conectar.getResultSet().getString(14));
                    objConsulta.setConsCidade(this.conectar.getResultSet().getString(15));
                    objConsulta.setConsCep(this.conectar.getResultSet().getString(16));
                    objConsulta.setConsEstado(this.conectar.getResultSet().getString(17));

                }

                if (objConsulta.getConsNome().equals("")) {
                    JOptionPane.showMessageDialog(null, consultaTipo + " nao Encontrado!!");
                }

                Date date = sdf.parse(objConsulta.getConsDataN());
                String dateSbr = sdfBr.format(date);
                objConsulta.setConsDataN(dateSbr);

            } catch (Exception e) {
                System.out.println("Erro ao consultar" + e.getMessage());

            } finally {

                txtCpf.setText(objConsulta.getConsCPF());
                txtSexo.setText(objConsulta.getConsSexo());
                try {
                    dataN.setDate(sdfBr.parse(objConsulta.getConsDataN()));
                } catch (ParseException ex) {
                    Logger.getLogger(Tela7Consultar.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtTelefone.setText(objConsulta.getConsTelefone());
                txtEmail.setText(objConsulta.getConsEmail());
                txtCep.setText(objConsulta.getConsCep());
                txtBairro.setText(objConsulta.getConsBairro());
                txtEndereco.setText(objConsulta.getConsEndereco());
                txtNo.setText(objConsulta.getConsNo());
                txtCompl.setText(objConsulta.getConsCompl());
                txtCidade.setText(objConsulta.getConsCidade());
                txtUf.setText(objConsulta.getConsEstado());

                this.conectar.fechaBanco();
            }
        }
    }

    private void Editar(ObjConsulta objConsulta) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateNasc = sdf.format(dataN.getDate());

            String consultaNome = this.txtCampoNomeConsulta.getText();
            String consultaTipo = ((String) this.cbTipo.getSelectedItem());
            String nomeTabela;

            if (consultaNome.equals("") || consultaNome.equals("Digite o nome para consulta")
                    || consultaTipo.equals("Selecionar") || txtCpf.getText().equals("") || dateNasc.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor fornecer dados aos campos com (*)!!");
            } else {

                if (consultaTipo.equals("Funcionario")) {
                    nomeTabela = "funcionarios";
                } else {
                    nomeTabela = "alunos";
                }

                this.conectar.conectaBanco();
                try {

                    this.conectar.executarSQL(
                            "SELECT "
                            + consultaTipo.toLowerCase() + "_nome"
                            + " FROM"
                            + " " + nomeTabela
                            + " WHERE "
                            + consultaTipo.toLowerCase() + "_nome = '" + consultaNome + "'"
                            + ";"
                    );

                    while (this.conectar.getResultSet().next()) {
                        objConsulta.setConsNome(this.conectar.getResultSet().getString(1));
                    }

                    if (objConsulta.getConsNome().equals("")) {
                        JOptionPane.showMessageDialog(null, consultaTipo + " nao Encontrado!!");
                    } else {
                        try {

                            this.conectar.insertSQL("UPDATE " + nomeTabela + " SET "
                                    + consultaTipo.toLowerCase() + "_cpf = '" + txtCpf.getText() + "',"
                                    + consultaTipo.toLowerCase() + "_sexo = '" + txtSexo.getText() + "',"
                                    + consultaTipo.toLowerCase() + "_datan = '" + dateNasc + "',"
                                    + consultaTipo.toLowerCase() + "_email = '" + txtEmail.getText() + "',"
                                    + consultaTipo.toLowerCase() + "_cep = '" + txtCep.getText() + "',"
                                    + consultaTipo.toLowerCase() + "_bairro = '" + txtBairro.getText() + "',"
                                    + consultaTipo.toLowerCase() + "_endereco = '" + txtEndereco.getText() + "',"
                                    + consultaTipo.toLowerCase() + "_no = '" + txtNo.getText() + "',"
                                    + consultaTipo.toLowerCase() + "_compl = '" + txtCompl.getText() + "',"
                                    + consultaTipo.toLowerCase() + "_cidade = '" + txtCidade.getText() + "',"
                                    + consultaTipo.toLowerCase() + "_estado = '" + txtUf.getText() + "'"
                                    + " WHERE "
                                    + consultaTipo.toLowerCase() + "_nome = '" + consultaNome + "'"
                                    + ";");

                        } catch (Exception e) {

                            System.out.println("Erro ao Atualizar " + consultaTipo + ": " + e.getMessage());
                            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + consultaTipo);

                        } finally {
                            JOptionPane.showMessageDialog(null, "Atualização Realizada!");
                            LimpaCampos();
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Erro ao consultar" + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro na busca");

                } finally {
                    this.conectar.fechaBanco();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campos com (*) sao Obrigatorios!!");
        }
    }

    private void Deletar(ObjConsulta objConsulta) {

        String consultaNome = this.txtCampoNomeConsulta.getText();
        String consultaTipo = ((String) this.cbTipo.getSelectedItem());
        String nomeTabela;

        if (consultaNome.equals("") || consultaNome.equals("Digite o nome para consulta") || consultaTipo.equals("Selecionar")) {
            JOptionPane.showMessageDialog(null, "Por favor inserir Nome e Tipo!!");
        } else {

            if (consultaTipo.equals("Funcionario")) {
                nomeTabela = "funcionarios";
            } else {
                nomeTabela = "alunos";
            }

            this.conectar.conectaBanco();
            try {

                this.conectar.executarSQL(
                        "SELECT "
                        + consultaTipo.toLowerCase() + "_id,"
                        + consultaTipo.toLowerCase() + "_nome"
                        + " FROM"
                        + " " + nomeTabela
                        + " WHERE "
                        + consultaTipo.toLowerCase() + "_nome = '" + consultaNome + "'"
                        + ";"
                );

                while (this.conectar.getResultSet().next()) {
                    objConsulta.setConsId(Integer.parseInt(this.conectar.getResultSet().getString(1)));
                    objConsulta.setConsNome(this.conectar.getResultSet().getString(2));
                }

                if (objConsulta.getConsNome().equals("")) {
                    JOptionPane.showMessageDialog(null, consultaTipo + " nao Encontrado para excluir !!");
                } else {
                    try {
                        if (JOptionPane.showConfirmDialog(this, "Deseja Excluir?", "Atencao",
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                            this.conectar.updateSQL(
                                    "DELETE FROM "
                                    + nomeTabela
                                    + " WHERE "
                                    + consultaTipo.toLowerCase() + "_id = " + objConsulta.getConsId()
                                    + ";"
                            );

                            JOptionPane.showMessageDialog(null, "Executado com Sucesso");
                            
                            LimpaCampos();
                        }
                        this.conectar.updateSQL(
                                "DELETE FROM "
                                + nomeTabela
                                + " WHERE "
                                + consultaTipo.toLowerCase() + "_id = " + objConsulta.getConsId()
                                + ";"
                        );
                    } catch (Exception e) {
                        System.out.println("Erro ao Excluir" + e.getMessage());
                        JOptionPane.showMessageDialog(null, "Erro na Exclusão");
                    }
                }

            } catch (Exception e) {
                System.out.println("Erro ao consultar" + e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro na Busca");

            } finally {
                this.conectar.fechaBanco();
            }
        }
    }

    private void LimpaCampos() {
        SimpleDateFormat sdfBr = new SimpleDateFormat("dd/MM/yyyy");
        txtCpf.setText("");
        txtSexo.setText("");
        try {
            dataN.setDate(sdfBr.parse("01/01/1500"));
        } catch (ParseException ex) {
            Logger.getLogger(Tela7Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtTelefone.setText(objConsulta.getConsTelefone());
        txtEmail.setText(objConsulta.getConsEmail());
        txtCep.setText(objConsulta.getConsCep());
        txtBairro.setText(objConsulta.getConsBairro());
        txtEndereco.setText(objConsulta.getConsEndereco());
        txtNo.setText(objConsulta.getConsNo());
        txtCompl.setText(objConsulta.getConsCompl());
        txtCidade.setText(objConsulta.getConsCidade());
        txtUf.setText(objConsulta.getConsEstado());
    }
}
