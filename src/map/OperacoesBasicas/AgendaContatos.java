package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatos.isEmpty())
            agendaContatos.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer contatoPorNome = null;
        if(!agendaContatos.isEmpty()) {
            contatoPorNome = agendaContatos.get(nome);
        }
        return contatoPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Nicolas", 111111);
        agendaContatos.adicionarContato("João", 222222);
        agendaContatos.adicionarContato("Nicolas", 3333333);
        agendaContatos.adicionarContato("Dudu", 4444444);
        agendaContatos.removerContato("Dudu");
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Nicolas"));
        agendaContatos.exibirContatos();
    }
}
