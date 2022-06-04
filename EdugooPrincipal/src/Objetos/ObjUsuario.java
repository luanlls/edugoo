package Objetos;

public class ObjUsuario {
    
    private int usuarioId = 0;
    private String usuarioNome = "";
    private String usuarioUserName = "";
    private String usuarioSenha = "";
    private String usuarioCpf = "";
    private String usuarioTipo = "";

    //GET AND SETTER
    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getUsuarioUserName() {
        return usuarioUserName;
    }

    public void setUsuarioUserName(String usuarioUserName) {
        this.usuarioUserName = usuarioUserName;
    }

    public String getUsuarioSenha() {
        return usuarioSenha;
    }

    public void setUsuarioSenha(String usuarioSenha) {
        this.usuarioSenha = usuarioSenha;
    }
    
    public String getUsuarioCpf() {
        return usuarioCpf;
    }

    public void setUsuarioCpf(String cpf) {
        this.usuarioCpf = cpf;
    }

    public String getUsuarioTipo() {
        return usuarioTipo;
    }

    public void setUsuarioTipo(String usuarioTipo) {
        this.usuarioTipo = usuarioTipo;
    }

}
