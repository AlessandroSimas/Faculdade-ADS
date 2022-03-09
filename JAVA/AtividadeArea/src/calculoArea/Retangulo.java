
package calculoArea;

import java.util.Scanner;


public class Retangulo extends Poligono {
    float base;
    float altura;
    float resultado;
    Scanner medida = new Scanner (System.in);
    
    @Override
    public void Calculo_area() {
        System.out.println ("Informe a base do retângulo:");
        base = medida.nextFloat();
        System.out.println ("Informe a altura do retângulo:");
        altura = medida.nextFloat ();
        resultado = base * altura ;
    }
    @Override
    public void Imprimir (){
    lados = 4;
        System.out.println ("Qtdade de lados é:   " + lados + " = RETÂNGULO");
        System.out.println ("Tamanho:   " + base + "   X   " + altura);
        System.out.println ( "O cálculo da área é:   " + resultado );
        System.out.println ( "------------------------------------------------");       
    }   
}
