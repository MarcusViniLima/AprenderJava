package POOLuta;

public class Lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    public void apresentar(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Diretamene do: "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade()+" anos e de altura "+this.getAltura());
        System.out.println("Pesando "+this.getPeso()+"kg");
        System.out.println(this.getVitoria()+" vitorias");
        System.out.println(this.getDerrota()+" derrotas e");
        System.out.println(this.getEmpate()+" empates");
    }
    public void status(){
        System.out.println(this.getNome()+" é "+this.getCategoria());
        System.out.println("Com "+this.getVitoria()+" vitorias");
        System.out.println("Com "+this.getDerrota()+" derrotas e");
        System.out.println("Com "+this.getEmpate()+" empates");
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria()+1);
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota()+1);
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate()+1);
    }
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
    this.nome=no;
    this.nacionalidade=na;
    this.idade=id;
    this.altura=al;
    this.setPeso(pe);
    this.vitoria=vi;
    this.derrota=de;
    this.empate=em;
    }
    public void setNome(String no){
        no=this.nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNacionalidade(String na){
        na=this.nacionalidade;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setIdade(int id){
        id=this.idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setAltura(float al){
        al=this.altura;
    }
    public float getAltura(){
        return altura;
    }
    public void setPeso(float peso){
        this.peso=peso;
        this.setCategoria();
    }
    public float getPeso(){
        return peso;
    }
    public void setVitoria(int vi){
        vi=this.vitoria;
    }
    public int getVitoria(){
        return vitoria;
    }
    public void setDerrota(int de){
        de=this.derrota;
    }
    public int getDerrota(){
        return derrota;
    }
    public void setEmpate(int em){
        em=this.empate;
    }
    public int getEmpate(){
        return empate;
    }
    public void setCategoria(){
      if (this.peso<52.2){
          this.categoria="Invalido";
      }else if(this.peso<=70.3){
          this.categoria="Leve";
      }else if(this.peso<=83.9){
          this.categoria="Médio";
      }else if(this.peso<=120.2){
          this.categoria="Pesado";
      }else{
          this.categoria="Invalido";
      }
    }
    public String getCategoria(){
        return categoria;
    }
}