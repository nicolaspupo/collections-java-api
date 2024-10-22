package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produtos(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produtos p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }


    public Produtos obterProdutoMaisCaro() {
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produtos p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produtos obterProdutoMaisBarato() {
        Produtos produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produtos p : estoqueProdutosMap.values()) {
                if(p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produtos oberProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produtos produtoMaiorQuantidadeValor = null;
        double maiorValor = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produtos p : estoqueProdutosMap.values()) {
                if(p.getPreco() * p.getQuantidade() > maiorValor) {
                    maiorValor = p.getPreco() * p.getQuantidade();
                    produtoMaiorQuantidadeValor = p;
                }
            }
        }
        return produtoMaiorQuantidadeValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1, "Produto 1", 1, 1.0);
        estoque.adicionarProduto(2, "Produto 2", 1, 2.0);
        estoque.adicionarProduto(3, "Produto 3", 1, 3.0);
        estoque.adicionarProduto(4, "Produto 4", 1, 1000.0);
        System.out.println("O valor total do estoque é: " + estoque.calcularValorTotalEstoque());
        System.out.println("O produto mais barato é o: " + estoque.obterProdutoMaisBarato());
        System.out.println("O produto mais caro é o: " + estoque.obterProdutoMaisCaro());
        estoque.exibirProdutos();
        System.out.println("O produto com maior quantidade em valor no estoque é: " + estoque.oberProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
