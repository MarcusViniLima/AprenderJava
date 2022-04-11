package POOLuta;

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
   Lutador l[] = new Lutador[6];
   l[0]=new Lutador("Rodrigo","França", 31, 1.75f, 68.9f, 11, 2, 1);
   l[1]=new Lutador("Carlos", "Brasil", 29, 1.68f, 57.8f, 14,  2, 3);
   l[2]=new Lutador("Pedro", "USA", 37, 1.70f, 83.5f, 5, 10, 5 );
   Lutas UEC01 = new Lutas();
   UEC01.marcarLuta(l[0], l[1]);
   UEC01.lutar();
   l[0].status();
   l[1].status();
    }
}
