import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner arr = new Scanner(System.in);
        int[] y = new int [10];
        int i;
        for (i=0; i<10; i++){
            System.out.println("Informe o número");
            y[i]=arr.nextInt();
        }
        int menor=1000;
        int maior=-1;
        int media=0;
        int soma=0;
        for (i=0; i<y.length; i++){
            if(y[i]>=maior){
                maior=y[i];
            }
            if(y[i]<=menor){
                menor=y[i];
            }
           soma+=y[i];
        }
         media = soma/10;
        System.out.println("A media de notas é "+media);
        System.out.println("A maior nota é "+maior);
        System.out.println("A menor nota é "+menor);
    }
}