
package senha;


public class Senha {
    private String tipo;
    private int numero;

    public Senha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public Senha() {
        this.tipo = " ";
        this.numero = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
    @Override
    public String toString() {
        return "Senha{" + "tipo=" + tipo + ", numero=" + numero + '}';
    } 

    
     
}
