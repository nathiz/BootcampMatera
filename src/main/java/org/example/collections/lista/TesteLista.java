package org.example.collections.lista;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {

    public static void main(String[] args) {

        // Criação de uma lista de Strings usando ArrayList
        // Tipo genérico <String> define que só strings serão armazenadas
        List<String> contas = new ArrayList<>();

        // Adicionando elementos à lista
        contas.add("Conta Poupanca");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupanca"); // Item duplicado, permitido em List

        // Acessando elementos por índice
        System.out.println("Conta 1: " + contas.get(0)); // Conta Poupanca
        System.out.println("Conta 2: " + contas.get(1)); // Conta Corrente
        System.out.println("Conta 3: " + contas.get(2)); // Conta Pagamento
        System.out.println("Conta 4: " + contas.get(3)); // Conta Poupanca (repetido)
    }

}