package org.example.abstratas;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        // Instancia uma conta corrente e imprime o extrato
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.imprimeExtrato();

        // Instancia uma conta poupança e imprime o extrato
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.imprimeExtrato();
    }
}