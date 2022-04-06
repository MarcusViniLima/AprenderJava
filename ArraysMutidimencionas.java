import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner y = new Scanner(System.in);
      int [][] mat = new int [4][3];
      for(int lin=0; lin<4; lin++)
        for(int col=0; lin<3; col++){
          System.out.println("Informe o valor da célula "+lin+" "+col);
          mat[lin][col] =y.nextInt();
      }
      for(int lin=0; lin<4; lin++)
        for(int col=0; lin<3; col++){
          if (mat[lin][col] %2==0)
          mat[lin][col] = 0;
          else
          mat [lin][col] = 1;
      }
      for(int lin=0; lin<4; lin++)
        for(int col=0; lin<3; col++){
            System.out.println(mat[lin][col]);
            System.out.println(" ");
        }
    }
}