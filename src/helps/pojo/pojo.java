/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.pojo;

/**
 *
 * @author Usuario
 */
public class pojo {
    
    String Nome,Telefone,Email,Senha,ConfirmacaoSenha,estado,erro;
    
    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getConfirmacaoSenha() {
        return ConfirmacaoSenha;
    }

    public void setConfirmacaoSenha(String ConfirmacaoSenha) {
        this.ConfirmacaoSenha = ConfirmacaoSenha;
    }
    boolean Termo;

    public boolean isTermo() {
        return Termo;
    }

    public void setTermo(boolean Termo) {
        this.Termo = Termo;
    }
    
    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    

    
}
