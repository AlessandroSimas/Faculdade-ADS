
package mapa;


public class Secretaria extends Funcionario {
    @Override
     public void exibeDados (){
         System.out.println ("Nome:" + nome);
         System.out.println ("Documento:" + documento);
         System.out.println("SECRETARIA\n");           
     } 

}
