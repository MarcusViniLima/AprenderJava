public class TrianguloRetangulo{ 
    private int px1, py1;  
    private int px2, py2;   
    private int px3, py3;   
   // apredendo constructor (encapsulamento) 
    TrianguloRetangulo(int px_1, int px_2, int px_3, int py_1, int py_2, int py_3){
        px_1=px1;
        px_1=px2;
        px_1=px3;
        py_1=px1;
        py_2=px2;
        py_3=px3;
    }
    
     public double calculeArea(){     
         int c1=Math.abs(py1-py2);      
         int c2=Math.abs(px1-px2);
         double area=(c1*c2)/2; 
         return area;    
         }   
     public double calculePerimetro(){       
         int c1=Math.abs(py1-py2);         
         int c2=Math.abs(px1-px2);        
         double h=Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2)); 
         double perimetro=c1+c2+h;  
         return perimetro;   
         }
     }