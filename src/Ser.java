public class Ser{
    String nome;
    int idade;

    public Ser(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    void setNome(String nome){
        this.nome = nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    String movimentar(){
        return "Pode andar, se rastejar, voar, nadar, etc";
    }
}
