//4.	Faça um algoritmo que leia dois valores e escreva os dois em ordem crescente.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
      int x;
      int y;
       System.out.println("Informe o primeiro valor");
       x=entrada.nextInt();
       System.out.println("Informe o segundo valor");
       y=entrada.nextInt();
       if (x<y){
            System.out.println(x+", "+y);
       }
       else{
           System.out.println(y+" ,"+x);
       }
    }
}