package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    public Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionario.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPorPesquisa = null;
        if(!dicionario.isEmpty()) {
            palavraPorPesquisa = dicionario.get(palavra);
        }
        return palavraPorPesquisa;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Altruísmo", "Altruísmo é um tipo de comportamento encontrado em seres humanos e outros seres vivos, em que as ações voluntárias de um indivíduo beneficiam outros");
        dicionario.adicionarPalavra("Autodidata", "O autodidata é a pessoa que desenvolve a capacidade de aprender um tema sem a necessidade do acompanhamento");
        dicionario.adicionarPalavra("Preguiça", "Segundo os dicionários, a preguiça pode significar desde a falta de disposição para realizar determinada tarefa, até uma espécie de aversão pelo trabalho");
        dicionario.removerPalavra("Preguiça");
        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("Autodidata");
    }
}
