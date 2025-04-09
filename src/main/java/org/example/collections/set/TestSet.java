package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        // Cria um Set de Strings — não permite elementos repetidos
        Set<String> contas = new HashSet<>();

        // Adicionando algumas contas (com algumas variações sutis)
        contas.add("Conta Poupanca");   // ok
        contas.add("Conta Corrente");   // ok
        contas.add("Conta corrente");   // diferente por causa do 'c' minúsculo
        contas.add("Conta Pagamento");  // ok
        contas.add("Conta Poupança");   // diferente de "Conta Poupanca" (acentuação)

        // Itera sobre o Set, imprimindo o valor e seu hash
        contas.forEach(conta -> {
            System.out.println("Conta -> " + conta);
            System.out.println("Hash  -> " + conta.hashCode());
        });
    }

}