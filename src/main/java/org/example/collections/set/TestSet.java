package org.example.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        Set<String> contas = new HashSet<>();

        contas.add("Conta Poupanca");
        contas.add("Conta Corrente");
        contas.add("Conta corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupança");

        contas.forEach(conta -> {
            System.out.println("Conta -> " + conta);
            System.out.println("Hash -> " + conta.hashCode());
        });

    }

}
