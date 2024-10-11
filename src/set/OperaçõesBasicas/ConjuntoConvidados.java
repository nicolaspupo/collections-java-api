package set.OperaçõesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    private void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    private void removerConvidadoPorConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                convidadoSet.remove(convidadoParaRemover);
                break;
            } else {
                throw new RuntimeException("Convidado inexistente");
            }
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados ");

        conjuntoConvidados.adicionarConvidado("Nicolas", 1253);
        conjuntoConvidados.adicionarConvidado("Nicolas", 1253);

        conjuntoConvidados.adicionarConvidado("Nicolas", 1253);

        conjuntoConvidados.adicionarConvidado("Nicolas", 1253);

        conjuntoConvidados.adicionarConvidado("Nicolas", 1253);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados ");
        conjuntoConvidados.removerConvidadoPorConvite(1253);
        conjuntoConvidados.exibirConvidados();
    }
}
