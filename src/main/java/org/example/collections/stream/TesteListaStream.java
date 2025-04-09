package org.example.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class TesteListaStream {

    public static void main(String[] args) {

        // Cria uma lista de contas
        List<String> contas = new ArrayList();

        contas.add("Conta Poupanca");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupanca"); // duplicada propositalmente pra testar a contagem

        // Filtra as contas que contêm "Poupanca" usando Stream
        contas.stream()
                .filter(conta -> filterLista(conta)) // poderia até usar .filter(TesteListaStream::filterLista)
                .forEach(conta -> System.out.println("Conta: " + conta));

        // Conta quantas "Poupanca" tem, usando parallelStream (executa em paralelo)
        long total = contas.parallelStream()
                .filter(conta -> filterLista(conta))
                .count();
        System.out.println("Total Poupanca (paralelo): " + total);

        // Faz o mesmo que acima, mas na forma tradicional (loop for)
        long totalContas = 0;
        for (int index = 0; index < contas.size(); index++) {
            String conta = contas.get(index);
            if (filterLista(conta)) {
                totalContas++;
            }
        }
        System.out.println("Total Poupanca (for): " + totalContas);
    }

    // Método auxiliar que retorna true se a string contiver "Poupanca"
    public static Boolean filterLista(String conta) {
        return conta.contains("Poupanca");
    }

}