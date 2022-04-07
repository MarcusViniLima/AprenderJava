//6.	Faça um algoritmo que lê um valor inteiro em Reais e calcula
//e escreve qual o menor número possível de notas de 100,50,20,10,5,2 e 1 real em que o valor pode ser decomposto. 
//Dica: Isso pode ser calculado a partir de operações de divisão inteira.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
      int x;
      System.out.println("Infome o valor");
      x=entrada.nextInt();
      int i;
      int resto;
      if ((i=x/100)!=0)
      System.out.println("O valor de notas de 100 será " + i);
      resto=x%100;
      if((i=resto/50)!=0)
      System.out.println("O valor de notas de 50 será " + i);
      resto=resto%50;
      if((i=resto/20)!=0)
      System.out.println("O valor de notas de 20 será " + i);
      resto=resto%20;
      if((i=resto/10)!=0)
      System.out.println("O valor de notas de 10 será " + i);
      resto=resto%10;
      if((i=resto/5)!=0)
      System.out.println("O valor de notas de 5 será " + i);
      resto=resto%5;
      if((i=resto/2)!=0)
      System.out.println("O valor de notas de 2 será " + i);
      resto=resto%2;
      if((i=resto/1)!=0)
      System.out.println("O valor de notas de 1 será " + i);
    }
}