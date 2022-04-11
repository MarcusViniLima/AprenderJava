package POOLuta;

import java.util.Random;
public class Lutas{
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria().equals(l2.getCategoria())) && (l1!=l2)){
            this.aprovada=true;
            this.desafiado=l1;
            this.desafiante=l2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    public void lutar(){
        if(this.aprovada=true){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: 
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: 
                    System.out.println(this.desafiante.getNome()+" ganhou!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                case 2: 
                    System.out.println(this.desafiado.getNome()+" ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }
    public void setDesafiado(Lutador desafiado){
        this.desafiado=desafiado;
    }
    public Lutador getDesafiado(){
        return desafiado;
    } 
     public void setDesafiante(Lutador desafiante){
        this.desafiante=desafiante;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
    public void setRound(int round){
        this.round=round;
    }
    public int getRound(){
        return round;
    }
    public void setAprovada(boolean aprovada){
        this.aprovada=aprovada;
    }
    public boolean getAprovada(){
        return aprovada;
    }    
}