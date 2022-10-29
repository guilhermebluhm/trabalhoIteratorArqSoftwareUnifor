public class Jogos {

    private String nome;
    private String preco;

    public Jogos(){

    }

    public Jogos(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}
