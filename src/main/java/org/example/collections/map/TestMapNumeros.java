package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestMapNumeros {

    public static void main(String[] args) {
        // Mapa onde a chave é o nome da conta e o valor é um número (pode ser um código ou ID, por exemplo)
        Map<String, Integer> contas = new HashMap<>();

        // Inserindo dados no mapa
        contas.put("Conta Corrente", 1);
        contas.put("Conta Pagamento", 2);
        contas.put("Conta Poupanca", 3);

        // Aqui substitui o valor da chave "Conta Corrente" — o valor 1 é sobrescrito por 4
        contas.put("Conta Corrente", 4);

        // Exibe o mapa completo — atenção que "Conta Corrente" aparece só uma vez, com o valor atualizado
        System.out.println(contas); // {Conta Corrente=4, Conta Pagamento=2, Conta Poupanca=3}

        // Busca o valor da chave "Conta Corrente"
        System.out.println(contas.get("Conta Corrente")); // 4

        // Exibe só as chaves (nomes das contas)
        System.out.println(contas.keySet()); // [Conta Corrente, Conta Pagamento, Conta Poupanca]
    }

}