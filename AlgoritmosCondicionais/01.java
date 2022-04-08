//1.	Faça um algoritmo que leia um valor e escreva: 0, se o valor é zero; 1,
// e o valor é maior que zero; -1 - se o valor é negativo.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Informe o valor");
        x=entrada.nextInt();
        if(x==0){
            x=0;
            System.out.println(x);
        }
        if(x>0){
            x=1;
            System.out.println(x);
        }
        if(x<0){
            x=-1;
            System.out.println(x);
        }
    }
}