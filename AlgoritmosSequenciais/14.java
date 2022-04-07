//14.	Faça um algoritmo que leia um valor em binário até 6 dígitos e escreva o número correspondente em decimal.
//Dica: Multiplique cada dígito binário pelo seu peso (1,2,4,8...) e some os produtos. 
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
      int x0, x1, x2, x3, x4, x5, x6, resto, decimal;
      System.out.println("Forneça um número binário com no máximo 6 dígitos");
      x0=entrada.nextInt();
      x1=x0/100000;
      resto=x0%100000;
      x2=resto/10000;
      resto=resto%10000;
      x3=resto/1000;
      resto=resto%1000;
      x4=resto/100;
      resto=resto%100;
      x5=resto/10;
      resto=resto%10;
      x6=resto/1;
      decimal=x6+2*x5+4*x4+8*x3+16*x2+32*x1;
       System.out.println("O número binário corresponde ao número decimal "+decimal);
    }
}