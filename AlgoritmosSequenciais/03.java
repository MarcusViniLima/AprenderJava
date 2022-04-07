// 3.	Faça um algoritmo que leia 3 valores reais, notas de um aluno, e escreva sua média aritmética. 
// A média aritmética de um conjunto de valores é dada pela soma dos valores dividido pela quantidade de valores considerados. 
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner escola = new Scanner(System.in);
      int x;
      int y;
      int z;
      System.out.println("Informe a primeira nota");
      x= escola.nextInt();
      System.out.println("Informe a segunda nota");
      y= escola.nextInt();
      System.out.println("Informe a terceira nota");
      z= escola.nextInt();
      int soma;
      soma=x+z+y;
      int media=soma/3;
      System.out.println("A media das notas é "+media);
    }
}