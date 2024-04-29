/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author erica
 */
public class Usuario {


    private String Nome;
    private String Email;
    private String Usuario;
    private String Senha;
    private int adm;
    
    public Usuario() {
    }
    
    public Usuario(String Nome, String Email, String Usuario, String Senha, int adm) {
        this.Nome = Nome;
        this.Email = Email;
        this.Usuario = Usuario;
        this.Senha = Senha;
        this.adm = adm;
    }
    
    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getAdm() {
        return adm;
    }

    public void setAdm(int adm) {
        this.adm = adm;
    }
    
    
    
    
    
}
