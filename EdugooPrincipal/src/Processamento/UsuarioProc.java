package Processamento;

import Conexoes.MySQL;
import Objetos.ObjUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioProc {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(ObjUsuario objUsuario){
        
        conn = new MySQL().conectaBD();
        
        try {
            String sql = "select * from usuarios where usuario_username = ? and usuario_senha = ? and usuario_tipo = ?";
            
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, objUsuario.getUsuarioUserName());
            psmt.setString(2, objUsuario.getUsuarioSenha());
            
            ResultSet rs = psmt.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioProc: "+ erro);
            return null;
        }
    }
    
}
