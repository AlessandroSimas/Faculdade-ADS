
package mapa;


public abstract class Funcionario extends Pessoa {
    protected double salario;
    protected int ramal;

    public double calculaSalarioAnual (){
        System.out.println ("Seu salário Anual é:");
        System.out.println (salario*13);
        System.out.println ("    ");
        return salario*13 ;
        
    }   
       
    @Override
     public void exibeDados (){
         System.out.println ("Nome:" + nome);
         System.out.println ("Documento:" + documento);
         System.out.println("FUNCIONÁRIO\n");           
     }
     
    
}
