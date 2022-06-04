package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import Conexoes.MySQL;
import Objetos.ObjFuncionario;

public class Tela7Consultar extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    ObjFuncionario novoCliente = new ObjFuncionario();

    public Tela7Consultar() {
        initComponents();
    }

    private void BuscarCliente(ObjFuncionario novoCliente){
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
        camponomeconsulta = new javax.swing.JTextField();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();

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

        camponomeconsulta.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        camponomeconsulta.setForeground(new java.awt.Color(204, 204, 204));
        camponomeconsulta.setText("Digite o nome para consulta");
        camponomeconsulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                camponomeconsultaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                camponomeconsultaFocusLost(evt);
            }
        });
        camponomeconsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                camponomeconsultaMouseClicked(evt);
            }
        });
        camponomeconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponomeconsultaActionPerformed(evt);
            }
        });
        jPanel1.add(camponomeconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 650, 50));

        btnBuscar.setBackground(new java.awt.Color(102, 0, 204));
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

        btnEditar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 102, 0));
        btnEditar.setText("EDITAR");
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 130, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/borda2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 530, 390));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 204));
        jLabel17.setText("______________________________________________________________________________________________________________________________");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 910, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 190, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BORDA1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 340, 350));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 220, 50));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 170, 50));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 190, 50));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 450, 50));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 570, 50));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 180, 50));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 290, 50));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 60, 50));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 90, 50));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 270, 50));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 330, 50));

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
       BuscarCliente (novoCliente);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void camponomeconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponomeconsultaActionPerformed
       
    }//GEN-LAST:event_camponomeconsultaActionPerformed
/*
    private void camponomeconsultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_camponomeconsultaFocusGained
       
    }//GEN-LAST:event_camponomeconsultaFocusGained

    private void camponomeconsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_camponomeconsultaFocusLost
       
    }//GEN-LAST:event_camponomeconsultaFocusLost
*/
    private void camponomeconsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camponomeconsultaMouseClicked
       camponomeconsulta.setText("");
    }//GEN-LAST:event_camponomeconsultaMouseClicked
      
      
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
    private javax.swing.JTextField camponomeconsulta;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
