//7.	Faça um algoritmo que lê uma quantia inteira em segundos 
//e escreva o número de horas, minutos e segundos correspondente.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
      int x;
       System.out.println("Indique o numero de segundos");
     x=entrada.nextInt();
     float resto;
      float y=x/60;
      resto=y%60;
      float z=resto/60;
      resto=z%60;
      float c =resto/60;

      System.out.println( y+" :"+z+" :"+c);
    }
}