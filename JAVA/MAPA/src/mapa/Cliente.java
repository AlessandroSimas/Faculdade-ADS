
package mapa;

public class Cliente extends Pessoa {
    private String usuario;
    private String senha;
    
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public boolean verificarSenha (String s ){
        s = "segredo"  ;
        return true; 
    }                  
        
        
    
    @Override
     public void exibeDados (){
         System.out.println ("Nome:" + nome);
         System.out.println ("Documento:" + documento);
         System.out.println("CLIENTE\n"); 
         
     }
    }
    
    

