public class Aula{
    String professor;
    String materia;
    int duração;
    boolean legendado;
    void status(){
        System.out.println("O professor que ministrará aula é "+this.professor);
        System.out.println("A materia da aula é "+this.materia);
        System.out.println("A duração da aula é "+this.duração);
        System.out.println("A aula está legendada "+this.legendado);
    }
     void exercício(){
        if(duração>=90){
            System.out.println("Haverá tempo para passar exercicio!");
        }else{
            System.out.println("Não haverá tempo para passar exercicio!");
        }
    }
    void legendar(){
        this.legendado=true;
    }
    void Nãolegendar(){
        this.legendado=false;
    }
}