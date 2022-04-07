//9.	Faça um algoritmo que leia 3 valores v1, v2 e v3, e troque os valores entre si de modo que ao final a variável v2 contenha o valor que foi lido para v1,
//a variável v3 contenha o valor que foi lido para v2, e a variável v1 contenha o valor que foi lido para a variável v3. 
//Dica: Para trocar os valores de duas variáveis (digamos v1 e v2) entre si,
//salva-se o valor de uma delas (p.ex., v1) em uma variável auxiliar qualquer (p.ex., aux) , 
//copia-se o valor da segunda (v2) para a variável que foi salva (v1), 
//e copia-se o valor da variável auxiliar (que contem o valor original da primeira), para a segunda variável.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner (System.in);
      int x;
      int y;
      int z;
      int aux;
      int aux2;
      System.out.println("Informe v1");
      x=entrada.nextInt();
      System.out.println("Informe v2");
      y=entrada.nextInt();
      System.out.println("Informe v3");
      z=entrada.nextInt();
     aux=x;
     aux2=y;
     x=z;
     y=aux;
     z=aux2;
      System.out.println("x= "+x);
      System.out.println("y= "+y);
      System.out.println("z= "+z);
    }
}