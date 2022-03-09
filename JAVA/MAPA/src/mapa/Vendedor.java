
package mapa;

public class Vendedor extends Funcionario{
    private double comissao;
    public double salarioMesComComissao (){
        return salario + comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
     @Override
     public void exibeDados (){
         System.out.println ("Nome:" + nome);
         System.out.println ("Documento:" + documento);
         System.out.println ("Comissão:" + comissao);
         System.out.println("VENDEDOR\n");           
     } 
}
