package set.OperaçõesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavraSet=" + palavraSet +
                '}';
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavraSet.isEmpty()) {
            if (palavraSet.contains(palavra)) {
                palavraSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavraSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavraSet.isEmpty()) {
            System.out.println(palavraSet);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Nicolas");
        conjuntoPalavrasUnicas.adicionarPalavra("Bom dia");
        conjuntoPalavrasUnicas.verificarPalavra("Nicolas");
        conjuntoPalavrasUnicas.removerPalavra("Nicolas");
        conjuntoPalavrasUnicas.removerPalavra("Bom dia");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
