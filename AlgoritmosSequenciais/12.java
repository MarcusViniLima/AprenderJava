//10.	Faça um algoritmo que leia 4 valores, Hi, Mi, Hf, Mf, representando respectivamente a hora e minuto inicial e final de um evento,
//e calcule a duração do mesmo em horas e minutos.
//Considere que o evento inicia e termina no mesmo dia.
//Dica: Para simplificar o problema, converta cada par de valores em um único valor em minutos.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner (System.in);
      int Hi;
      int Mi;
      int Hf;
      int Mf;
       System.out.println("Informe hora inicial");
       Hi=entrada.nextInt();
       System.out.println("Informe minuto inicial");
       Mi=entrada.nextInt();
       System.out.println("Informe hora final");
       Hf=entrada.nextInt();
       System.out.println("Informe minuto final");
       Mf=entrada.nextInt();
       int Ht=Hi-Hf;
       int Mt=Mi-Mf;
      System.out.println("O tempo total do evento foi "+Ht+" :"+Mt);
    }
}