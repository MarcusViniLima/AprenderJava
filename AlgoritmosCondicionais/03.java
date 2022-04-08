//3.	Faça um algoritmo que leia dois valores e, através de uma comparação, escreva o maior deles.
// Considere que os dois valores são diferentes.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
         int x;
         int y;
        System.out.println("informe o primeiro valor");
        x=entrada.nextInt();
        System.out.println("informe o Segundo valor");
        y=entrada.nextInt();
        if (x<y){
            System.out.println("O maior valor é "+y);
        }
        else{
            System.out.println("O maior valor é "+x);
        }
    }
}