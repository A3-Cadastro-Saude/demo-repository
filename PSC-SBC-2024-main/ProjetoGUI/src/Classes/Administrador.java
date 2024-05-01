
package Classes;

public class Administrador extends Usuario {
    
    
    //atributos
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private boolean adm;

    public Administrador() {
    }
    
    
    public Administrador(String nome, String email, String usuario, String senha, boolean adm) {
       super(nome, email, usuario, senha, adm);
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.adm = adm;
    }

        Administrador admin = new Administrador(){
        }       
}               
