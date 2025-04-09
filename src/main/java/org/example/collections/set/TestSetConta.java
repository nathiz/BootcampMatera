package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TestSetConta {

    public static void main(String[] args) {
        // Usando um HashSet pra garantir que não haverá contas com o mesmo número duplicadas
        Set<Conta> contas = new HashSet<>();

        // Adiciona duas contas com o mesmo número (100), mas com saldos diferentes
        // Só a primeira vai entrar, porque o equals considera só o número da conta
        contas.add(new Conta(100L, 300.00));
        contas.add(new Conta(100L, 150.00)); // Essa aqui é ignorada pelo Set (duplicata)

        // Adiciona uma nova conta com número diferente (101), então entra normalmente
        contas.add(
                Conta.builder()
                        .saldo(258.90)
                        .numeroConta(101L)
                        .build()
        );

        // Exibe as contas do Set
        contas.forEach(conta -> System.out.println(conta));
    }
}