// 2.	Faça um algoritmo que leia dois valores inteiros e escreva a sua soma
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner soma = new Scanner(System.in);
      int x;
      int y;
      System.out.println("Informe o primeiro valor");
      x= soma.nextInt();
      System.out.println("Informe o segundo valor");
      y= soma.nextInt();
      int z=x+y;
      System.out.println("Soma dos valores é " + z);
    }
}