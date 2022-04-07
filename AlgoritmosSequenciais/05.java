//5.	Faça um algoritmo que leia 3 valores a, b e c, coeficientes de uma equação de segundo grau,
//e calcule e escreva as raizes da equação. 
//Dica: As raízes de uma equação podem ser calculadas  pela fórmula de Baskhara.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
      int a;
      int b;
      int c;
      double delta=0;
      double x1=0;
      double x2=0;
      System.out.println("Informe o valor de a");
      a=entrada.nextInt();
      System.out.println("Informe o valor de b");
      b=entrada.nextInt();
      System.out.println("Informe o valor de c");
      c=entrada.nextInt();
      delta = Math.pow(b,2)-4*a*c;
      x1= (-b - Math.sqrt(delta))/2*a;
      x2= (-b + Math.sqrt(delta))/2*a;
      System.out.println("x1 é "+x1);
      System.out.println("x2 é "+x2);
       System.out.println("delta é "+delta);
    }
}