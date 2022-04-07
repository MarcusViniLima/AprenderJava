//4.	Faça um algoritmo que leia 3 valores reais v1 e v2 e calcule 
//e escreva a área do triângulo que tem base igual a v1 e altura igual a v2. 
//Dica: A área de um triângulo é dada pela expressão: (base x altura)/2
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner triangulo = new Scanner(System.in);
      double v1;
      double v2;
      System.out.println("Informe o valor da altura do triangulo");
      v1=triangulo.nextInt();
      System.out.println("Informe o valor da base do triangulo");
      v2=triangulo.nextInt();
      double area;
      area =(v1*v2)/2;
      System.out.println("Area do triangulo é "+area);
    }
}