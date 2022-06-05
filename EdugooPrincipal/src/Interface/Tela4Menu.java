
package Interface;


public class Tela4Menu extends javax.swing.JFrame {

    
    public Tela4Menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCadAlun = new javax.swing.JButton();
        btnCadFunc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnConsul = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRel = new javax.swing.JButton();
        btnAge = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnAjuda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 794));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadfun.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 120, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadalun.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        btnCadAlun.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnCadAlun.setText("Cadastro Aluno");
        btnCadAlun.setToolTipText("");
        btnCadAlun.setActionCommand("");
        btnCadAlun.setFocusable(false);
        btnCadAlun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAlunActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadAlun, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 300, 90));

        btnCadFunc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnCadFunc.setText("Cadastro Funcionário");
        btnCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadFuncActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 310, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/consult.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        btnConsul.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnConsul.setText("Consulta Cadastro");
        btnConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 300, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relat.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/agenda.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        btnRel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnRel.setText("Emitir Relatórios");
        btnRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelActionPerformed(evt);
            }
        });
        jPanel1.add(btnRel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 320, 90));

        btnAge.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnAge.setText("Agenda do Aluno");
        btnAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 300, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ajud.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 280, -1, -1));

        btnAjuda.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnAjuda.setText("Ajuda");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 300, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EDUGOO2.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ENFEITE.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        TelaContato tela = new TelaContato();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnCadAlunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAlunActionPerformed
        Tela6CadastroAluno tela = new Tela6CadastroAluno();
        tela.setVisible(true);
        dispose();        
    }//GEN-LAST:event_btnCadAlunActionPerformed

    private void btnCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFuncActionPerformed
        Tela6Cadastro tela = new Tela6Cadastro();
        tela.setVisible(true);
        dispose();     
    }//GEN-LAST:event_btnCadFuncActionPerformed

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
        Tela7Consultar tela = new Tela7Consultar();
        tela.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_btnConsulActionPerformed

    private void btnAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgeActionPerformed
        Tela8Agenda tela = new Tela8Agenda();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgeActionPerformed

    private void btnRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelActionPerformed
        TelaRelatorios tela = new TelaRelatorios();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRelActionPerformed

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
            java.util.logging.Logger.getLogger(Tela4Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela4Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela4Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela4Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela4Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAge;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnCadAlun;
    private javax.swing.JButton btnCadFunc;
    private javax.swing.JButton btnConsul;
    private javax.swing.JButton btnRel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
