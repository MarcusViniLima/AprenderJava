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
        int somar = 0;
        for (i=0; i<y.length; i++){
            somar+= y[i];
        }
        for ( i = 0; i < y.length; i++) {
			for ( j = 0; j < y.length; j++) {
				if (y[i] < y[j]) {
					int temp = y[i];
					y[i] = y[j];
					y[j] = temp;
				}
			}
		}
		for (i = y) {
			System.out.print(i+" ");
		}
		
      System.out.println("O valor dos elementos da soma é "+somar);
    }
}