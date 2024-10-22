package map.Ordenacao;

import set.Pesquisa.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibrAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>();
    }

    public void obterProximoEvento() {
         LocalDate dataAtual = LocalDate.now();
         LocalDate proximaData = null;
         Evento proximoEvento = null;
         Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
         for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
             if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                 proximaData = entry.getKey();
                 proximoEvento = entry.getValue();
                 System.out.println("O proximo evento: " + proximoEvento + "acontecera na data " + proximaData);
                 break;
             }
         }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.OCTOBER, 22), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 10, 25), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(1998, Month.NOVEMBER, 20), "Evento 1", "Atracao 1");

        agendaEventos.exibrAgenda();
    }
}
