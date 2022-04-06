import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner banco = new Scanner(System.in);
      int z;
      do{
          System.out.println("Bem-vindo ao Banco Marcus!!");
      System.out.println("Digite 1 para saque");
      System.out.println("Digite 2 para sair");
      z = banco.nextInt();
      switch(z){
          case 1: saque();
          break;
          }
      }while (z!=2);
    }
    public static void saque(){
        Scanner banco = new Scanner(System.in);
        float x;
        float y;
        System.out.println("Digite a senha");
          x = banco.nextInt();
          if (x==1234){
              System.out.println("Senha correta!");
              System.out.println(" Digite o valor de saque");
              y = banco.nextInt();
              float saldo=2000;
              if (y<=saldo) {
                  saldo = saldo - y;
                  System.out.println("Seu Saldo Final é R$" +saldo);
              }
                  else {
                  System.out.println("Valor de saque indisponível!");
                  }
          }
              else {
              System.out.println("Senha incorreta!");
              }
    }
}
