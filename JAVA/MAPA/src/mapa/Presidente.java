
package mapa;


public class Presidente extends Funcionario{
 
     @Override
     public void exibeDados (){
         System.out.println ("Nome:" + nome);
         System.out.println ("Documento:" + documento);
         System.out.println("PRESIDENTE\n");           
     }
     
     
}
