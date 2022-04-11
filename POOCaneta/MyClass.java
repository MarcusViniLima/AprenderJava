public class MyClass {
    public static void main(String args[]) {
      Caneta cs = new Caneta();
      cs.cor="Azul";
      cs.ponta=0.5f;
      cs.destampar();
      cs.rabiscar();
      cs.status();
      Caneta cs1 = new Caneta();
      cs1.modelo="bic";
      cs1.cor="preta";
      cs1.tampar();
      cs1.status();
      cs1.rabiscar();
      
    }
}