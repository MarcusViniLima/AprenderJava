import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
     int real = 0;
     int dolar = 0;
     System.out.println("Programa para converter reais em dolares");
     System.out.println("Informe valor disponivel em reaiS para comprar dolar");
     real = entrada.nextInt();
     System.out.println("Informe o valor do dolar em reais");
     dolar = entrada.nextInt();
     entrada.close();
     conversao(real, dolar);
    }
     public static void conversao(int real, int dolar){
         int resultado = 0;
         resultado = real / dolar;
         System.out.println("Com essa quantia sera possivel comprar:USS " + resultado);
     System.out.println("Boa viagem!");
     }
    }
