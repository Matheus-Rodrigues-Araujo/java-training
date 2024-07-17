public class Pessoa extends Ser{
    String sobrenome;

    public static void main(String[] args){
    }
    public Pessoa(String nome, int idade, String sobrenome){
        super(nome, idade);
        this.sobrenome = sobrenome;
    }
    @Override
    String movimentar(){
        return String.format("%s %s é um ser do tipo `Pessoa` e se movimenta andando", this.nome, this.sobrenome);
    }

}


