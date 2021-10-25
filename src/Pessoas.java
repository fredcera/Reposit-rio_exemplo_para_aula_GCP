public class Pessoas {

    double idade;
    String nome;

    public Pessoas(String nome, double idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome=" + nome +
                ", idade='" + idade + '\'' +
                '}';
    }
}
