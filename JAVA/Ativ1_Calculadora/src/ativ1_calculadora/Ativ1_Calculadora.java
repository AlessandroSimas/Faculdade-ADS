
package ativ1_calculadora;

import java.util.Scanner;
public class Ativ1_Calculadora {

 
    public static void main(String[] args) {
        float num1 , num2, num3;
        float soma, subtracao, multiplicacao, divisao;
        int opcao = 2;
        Scanner entrada = new Scanner (System.in);
        
    while (opcao != 0 ){
        System.out.println(" Digite a operação que deseja relizar: ");
        System.out.println(" 1-Soma ; 2-Subtração ; 3-Multiplicação ; "
                + "4-Divisão ; 5-Elevar ao quadrado ; 0-Sair");
        System.out.println(" Operação:   ");
        opcao = entrada.nextInt();       
        if (opcao == 5){
            System.out.println("Digite um número para elevar ao quadrado:");
            num3 = entrada.nextFloat();
            System.out.println("O resultado é:\n" +num3 *num3);
            System.out.println (" ");
        }
        else if (opcao == 0 ) {
            System.out.println ("SAINDO DO PROGRAMA ");
            break;
                    }                
        switch (opcao){
        case 1:
            System.out.println ("Informe o primeiro número:");
            num1 = entrada.nextFloat();
            System.out.println ("Informe o segundo número:");
            num2 = entrada.nextFloat();
            soma = num1+num2;
            System.out.println("O resultado da soma é:\n"+ soma); 
            System.out.println (" ");
        break;
        case 2: 
            System.out.println ("Informe o primeiro número:");
            num1 = entrada.nextFloat();
            System.out.println ("Informe o segundo número:");
            num2 = entrada.nextFloat();
            subtracao = num1-num2;
            System.out.println ("O resultado da subtração é:\n"+ subtracao );
            System.out.println (" ");
        break;
        case 3: 
            System.out.println ("Informe o primeiro número:");
            num1 = entrada.nextFloat();
            System.out.println ("Informe o segundo número:");
            num2 = entrada.nextFloat();
            multiplicacao = num1*num2;
            System.out.println ("O resultado da subtração é:\n"+ multiplicacao);
            System.out.println (" ");
        break;
        case 4: 
            System.out.println ("Informe o primeiro número:");
            num1 = entrada.nextFloat();
            System.out.println ("Informe o segundo número:");
            num2 = entrada.nextFloat();
        if (num1<num2){
            System.out.println ( "Impossível realizar o calculo\n");  
        } 
        else {
            divisao = num1/num2;
            System.out.println ("O resultado da divisão é:\n" + divisao);  
            System.out.println (" ");
        }            
        break;                         
        }
    }
}   
}
    

