package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        // Criação de um HashMap onde a chave e o valor são Strings
        Map<String, String> contas = new HashMap<>();

        // Adicionando pares chave-valor
        contas.put("Conta Corrente", "Samuel");
        contas.put("Conta Pagamento", "Karyn");
        contas.put("Conta Poupanca", "Paula");

        // Aqui sobrescreve o valor da chave "Conta Corrente" — substitui "Samuel" por "Samuel Cunha"
        contas.put("Conta Corrente", "Samuel Cunha");

        // Imprime o mapa completo — a ordem pode não ser garantida (HashMap não é ordenado)
        System.out.println(contas);

        // Recupera o valor associado à chave "Conta Corrente"
        System.out.println(contas.get("Conta Corrente")); // Vai imprimir "Samuel Cunha"

        // Exibe todas as chaves presentes no mapa
        System.out.println(contas.keySet()); // ["Conta Corrente", "Conta Pagamento", "Conta Poupanca"]
    }

}