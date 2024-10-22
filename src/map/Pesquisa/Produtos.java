package map.Pesquisa;

public class Produtos {
    private String nome;
    private int quantidade;
    private double preco;

    public Produtos(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " / " +
                " Quantidade: " + quantidade +
                " Preço: " + preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
