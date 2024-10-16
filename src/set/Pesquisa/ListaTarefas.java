package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefasSet;

    public ListaTarefas() {
        this.listaTarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!listaTarefasSet.isEmpty()) {
            for (Tarefa t : listaTarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            listaTarefasSet.remove(tarefaParaRemover);

        }
    }

    public void exibirTarefas() {
        System.out.println(listaTarefasSet);
    }

    public void contarTarefas() {
        System.out.println(listaTarefasSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefasSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        listaTarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Correr");
        listaTarefa.adicionarTarefa("Estudar");
        listaTarefa.adicionarTarefa("Compras");
        listaTarefa.exibirTarefas();
        listaTarefa.contarTarefas();
        listaTarefa.removerTarefa("Compras");
        listaTarefa.exibirTarefas();
        listaTarefa.marcarTarefaConcluida("Correr");
        listaTarefa.marcarTarefaPendente("Estudar");
        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println(listaTarefa.obterTarefasPendentes());
        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();

    }
}
