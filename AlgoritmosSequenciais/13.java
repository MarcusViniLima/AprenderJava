//13.	Faça um algoritmo que leia a quantidade de alunos em uma sala de aula e a quantidade de alunos por grupo,
//e calcule e escreva quantos grupos serão formados 
//e o resto de alunos que não foram suficientes para formar mais um grupo.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("Digite o número de alunos");
        x=entrada.nextInt();
        System.out.println("Digite o número de grupos");
        y=entrada.nextInt();
        z=x/y;
        System.out.println("O Numero de alunos por grupos é "+z);
        z=x%y;
        System.out.println("O Numero de alunos no grupo q faltou é "+z);
        
      
    }
}