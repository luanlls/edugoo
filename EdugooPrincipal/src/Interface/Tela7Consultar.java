package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import Conexoes.MySQL;
import Objetos.Clientes;

public class Tela7Consultar extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    Clientes novoCliente = new Clientes();

    public Tela7Consultar() {
        initComponents();
    }

    private void BuscarCliente(Clientes novoCliente){
        this.conectar.conectaBanco();
        
        String consultaNome = this.ConsultaNome.getText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "cliente_sexo,"
                    + "cliente_CPF,"
                    + "cliente_datanasci,"
                    + "cliente_email,"
                    + "cliente_telefone,"
                    + "cliente_endereço,"
                    + "cliente_número,"
                    + "cliente_complemento,"
                    + "cliente_bairro,"
                    + "cliente_cidade,"
                    + "cliente_estado"       
                    + "cliente_cep,"
                                                                 
                 + " FROM"
                     + " edugoo.cadastro_clientes"
                 + " WHERE"
                     + " cliente_nome = '" + consultaNome + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                
                novoCliente.setSexo(this.conectar.getResultSet().getString(1));
                novoCliente.setCpf(this.conectar.getResultSet().getString(2));
                novoCliente.setDatan(this.conectar.getResultSet().getString(3));
                novoCliente.setEmail(this.conectar.getResultSet().getString(4));
                novoCliente.setTelefone(this.conectar.getResultSet().getString(5));
                novoCliente.setEndereco(this.conectar.getResultSet().getString(6));
                novoCliente.setNo(this.conectar.getResultSet().getString(7));
                novoCliente.setCompl(this.conectar.getResultSet().getString(8));
                novoCliente.setBairro(this.conectar.getResultSet().getString(9));
                novoCliente.setCidade(this.conectar.getResultSet().getString(10));
                novoCliente.setEstado(this.conectar.getResultSet().getString(11));
                novoCliente.setCep(this.conectar.getResultSet().getString(12));
                
           }
            
           if(novoCliente.getNome() == ""){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
           }
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente");
            
        }finally{
            ConsultaSexo.setText(novoCliente.getSexo());
            ConsultaCpf.setText(novoCliente.getCpf());
            ConsultaDataN.setText(novoCliente.getDatan());
            ConsultaEmail.setText(novoCliente.getEmail());
            ConsultaTelefone.setText(novoCliente.getTelefone());
            ConsultaEndereco.setText(novoCliente.getEndereco());
            ConsultaNo.setText(novoCliente.getNo());
            ConsultaCompl.setText(novoCliente.getCompl());
            ConsultaBairro.setText(novoCliente.getBairro());
            ConsultaCidade.setText(novoCliente.getCidade());
            ConsultaEstado.setText(novoCliente.getEstado());
            ConsultaCep.setText(novoCliente.getCep());
            this.conectar.fechaBanco();   
        }               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("CONSULTA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 58, -1, -1));

        jLabel3.setText("Digite aqui o nome completo para consulta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 133, -1, -1));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 176, 375, -1));

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 153, -1, -1));

        jLabel5.setText("Sexo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel6.setText("Data de Nascimento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jLabel7.setText("CPF");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        jLabel9.setText("Telefone");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jLabel10.setText("Endereço");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        jLabel11.setText("Complemento");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        jLabel12.setText("Bairro");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, -1, -1));

        jLabel13.setText("No.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        jLabel14.setText("Cidade");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, -1));

        jLabel15.setText("CEP");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, -1, -1));

        jLabel16.setText("ESTADO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, -1, -1));

        jButton2.setText("EDITAR");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 80));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Tela4Menu tela = new Tela4Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       BuscarCliente (novoCliente);
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
