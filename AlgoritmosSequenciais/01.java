// 1.	Faça um algoritmo que leia um valor N,
//representando o lado de um quadrado,
//e calcule e escreva a área do quadrado.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner quad = new Scanner(System.in);
      int x;
      System.out.println("Informe o valor do lado quadrado");
      x = quad.nextInt();
      int z=x*x;
      System.out.println("A area do quadrado é "+z);
    }
}