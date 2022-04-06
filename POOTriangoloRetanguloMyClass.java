import java.util.Scanner;
public class MyClass {    
    public static void main(String args[]) {    
    Scanner leitor = new Scanner(System.in); 
    int px1;    
    int px2;   
    int py1;    
    int py2;     
    int px3;    
    int py3;   
    System.out.println("Digite a coordenada de px1");   
    px1 = leitor.nextInt();     
    System.out.println("Digite a coordenada de px2");  
    px2 = leitor.nextInt();     
    System.out.println("Digite a coordenada de py1");  
    py1 = leitor.nextInt();    
    System.out.println("Digite a coordenada de py2");   
    py2 = leitor.nextInt();      
    System.out.println("Digite a coordenada de zx1");  
    px3 = leitor.nextInt();     
    System.out.println("Digite a coordenada de zx2");    
    py3 = leitor.nextInt();      
    
     TrianguloRetangulo tr = new TrianguloRetangulo(px1,px2,px3,py1,py2,py3);  
        
    double area=tr.calculeArea();     
    double perimetro=tr.calculePerimetro();     
    System.out.println("Area do triangulo é "+area);       
    System.out.println("O perimetro do triangulo é "+perimetro); 
    
} 

}