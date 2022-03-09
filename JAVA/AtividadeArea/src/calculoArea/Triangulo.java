
package calculoArea;

import java.util.Scanner;


public class Triangulo extends Poligono {
    float base;
    float altura;
    float resultado;
    Scanner medida = new Scanner (System.in);
    
    
    @Override
    public void Calculo_area() {
        System.out.println ("Informe a base do triângulo:");
        base = medida.nextFloat();
        System.out.println ("Informe a altura do triângulo:");
        altura = medida.nextFloat ();
        resultado = base * altura / 2; 
    }
    
    @Override
    public void Imprimir (){
    lados = 3;
        System.out.println ("Qtdade de lados é:   " + lados + " = TRIÂNGULO");
        System.out.println ("Tamanho:   " + base + "    X    " + altura);
        System.out.println ( "O cálculo da área é:    " + resultado );
        System.out.println ( "------------------------------------------------" );
    }
       
}
