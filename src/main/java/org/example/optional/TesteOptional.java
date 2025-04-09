package org.example.optional;

import org.example.collections.set.Conta;

import java.util.Optional;

public class TesteOptional {

    public static void main(String[] args) {

        // Tentando obter uma conta de forma "segura" com Optional
        Optional<Conta> optionalConta = obtemContaSemErro();

        // Verifica se há uma conta presente antes de acessar
        if (optionalConta.isPresent()) {
            System.out.println("Saldo: " + optionalConta.get().getSaldo());
        } else {
            System.out.println("Não foi localizado a Conta");
        }
    }

    // Simula um método que pode retornar null
    public static Conta obtemConta() {
        return null;
    }

    // Aqui está o problema: está tentando criar um Optional com valor null diretamente
    public static Optional<Conta> obtemContaSemErro() {
        return Optional.of(null); // Vai lançar NullPointerException em tempo de execução
    }

}