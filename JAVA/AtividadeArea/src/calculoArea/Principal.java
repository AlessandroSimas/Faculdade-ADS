
package calculoArea;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner qtdade = new Scanner (System.in);
    int opcao=1;
    
    while ( opcao != 0) {
        System.out.println("------------------------------------------------");
        System.out.println("Informe a quatidade de lados da forma geométrica:");
        opcao = qtdade.nextInt();
        if (opcao == 3){
            Triangulo t = new Triangulo ();
            t.Calculo_area();
            t.Imprimir();  
        continue;
        } 
        if (opcao == 4) {
            Retangulo r = new Retangulo ();
            r.Calculo_area();
            r.Imprimir();
        } else {
            System.out.println("Ops, informação errada!");
            System.out.println ("ENCERRANDO");
            System.exit (0);
        }
    }
 }
}
