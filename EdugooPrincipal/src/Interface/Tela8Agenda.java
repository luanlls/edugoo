package Interface;

import Conexoes.MySQL;
import Objetos.ObjAgenda;
import javax.swing.JOptionPane;

public class Tela8Agenda extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjAgenda novaAgenda = new ObjAgenda();

    public Tela8Agenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboComportamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboAlimentacao = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboEvacuacao = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboSoneca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecados = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1260, 794));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setText("Digite o nome do aluno");
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 670, 40));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setText("ALUNO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, 80));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("Comportamento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        comboComportamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Ótimo", "Pode Melhorar", "Mais atenção!" }));
        jPanel1.add(comboComportamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Alimentação:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        comboAlimentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Recusou", "Regular", "Ótimo" }));
        jPanel1.add(comboAlimentacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 160, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Evacuação:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, -1, -1));

        comboEvacuacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Não evacuou", "Evacuou Pastoso", "Evacuou Líquido", " " }));
        jPanel1.add(comboEvacuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Soneca:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, -1, -1));

        comboSoneca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Dormiu ", "Não dormiu" }));
        jPanel1.add(comboSoneca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("Recados:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        txtRecados.setColumns(20);
        txtRecados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRecados.setRows(5);
        jScrollPane1.setViewportView(txtRecados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 670, 180));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton2.setText("ENVIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 650, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/agendaaluno.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1220, 630));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 80));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(121, 38, 180));
        jLabel8.setText("AGENDA DO ALUNO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 500, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EDUGOO2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tela4Menu tela = new Tela4Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EnviarAgenda(novaAgenda);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
        txtNome.setText("");
        txtNome.setFont(txtRecados.getFont());
        txtNome.setForeground(txtRecados.getForeground());
    }//GEN-LAST:event_txtNomeMouseClicked

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
            java.util.logging.Logger.getLogger(Tela8Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela8Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela8Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela8Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela8Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAlimentacao;
    private javax.swing.JComboBox<String> comboComportamento;
    private javax.swing.JComboBox<String> comboEvacuacao;
    private javax.swing.JComboBox<String> comboSoneca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtRecados;
    // End of variables declaration//GEN-END:variables

    private void EnviarAgenda(ObjAgenda novaAgenda) {

        if (txtNome.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "O Nome do aluno é obrigatorio!");
        } else {
            this.conectar.conectaBanco();

            novaAgenda.setAgendaNomeAluno(txtNome.getText());
            //CPF
            novaAgenda.setAgendaComportamento((String) comboComportamento.getSelectedItem());
            novaAgenda.setAgendaAlimentacao((String) comboAlimentacao.getSelectedItem());
            novaAgenda.setAgendaEvacuacao((String) comboEvacuacao.getSelectedItem());
            novaAgenda.setAgendaSoneca((String) comboSoneca.getSelectedItem());
            novaAgenda.setAgendaRecados(txtRecados.getText());
            //Aluno ID

            try {
                this.conectar.executarSQL(
                        "SELECT"
                        + " aluno_id,"
                        + " aluno_cpf"
                        + " FROM"
                        + " alunos"
                        + " WHERE"
                        + " aluno_nome = '" + txtNome.getText() + "'"
                        + ";"
                );

                while (this.conectar.getResultSet().next()) {
                    novaAgenda.setAgendaAlunosId(Integer.parseInt(this.conectar.getResultSet().getString(1)));
                    novaAgenda.setAgendaCPFAluno(this.conectar.getResultSet().getString(2));
                }

                if (novaAgenda.getAgendaCPFAluno().equals("")) {
                    /*JOptionPane.showMessageDialog(null, "Nome do Aluno Incorreto!");*/
                    novaAgenda = null;
                }
            } catch (Exception e) {
                System.out.println("Erro ao consultar Aluno " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar Aluno");

                novaAgenda = null;
            } finally {
                this.conectar.fechaBanco();
            }

            if (novaAgenda == null) {
                JOptionPane.showMessageDialog(null, "Nome do Aluno Incorreto!");
            } else {
                try {
                    this.conectar.conectaBanco();
                    this.conectar.insertSQL("INSERT INTO agenda ("
                            + "agenda_nome_aluno,"
                            + "agenda_cpf_aluno,"
                            + "agenda_comportamento,"
                            + "agenda_alimentacao,"
                            + "agenda_evacuacao,"
                            + "agenda_soneca,"
                            + "agenda_recados,"
                            + "agenda_alunos_id"
                            + ") VALUES ("
                            + "'" + novaAgenda.getAgendaNomeAluno() + "',"
                            + "'" + novaAgenda.getAgendaCPFAluno() + "',"
                            + "'" + novaAgenda.getAgendaComportamento() + "',"
                            + "'" + novaAgenda.getAgendaAlimentacao() + "',"
                            + "'" + novaAgenda.getAgendaEvacuacao() + "',"
                            + "'" + novaAgenda.getAgendaSoneca() + "',"
                            + "'" + novaAgenda.getAgendaRecados() + "',"
                            + "'" + novaAgenda.getAgendaAlunosId() + "'"
                            + ");");

                } catch (Exception e) {

                    System.out.println("Erro ao enviar agenda " + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro ao enviar agenda");

                } finally {
                    this.conectar.fechaBanco();
                    JOptionPane.showMessageDialog(null, "Agenda enviada com sucesso!");
                }
            }
        }
    }
}
