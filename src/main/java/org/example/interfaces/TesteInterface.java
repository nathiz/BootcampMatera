package org.example.interfaces;

public class TesteInterface {
    public static void main(String[] args) {

        // Testando a Conta Corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5000.00); // Depósito com desconto da taxa

        System.out.println("Saldo Conta Corrente após depósito: " + contaCorrente.getSaldo());

        contaCorrente.sacar(1000.00); // Saque com desconto da taxa

        System.out.println("Saldo Conta Corrente após o saque: " + contaCorrente.getSaldo());


        // Testando a Conta Poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.00); // Depósito integral, sem taxas

        System.out.println("Saldo Conta Poupança após depósito: " + contaPoupanca.getSaldo());

        contaPoupanca.sacar(800.00); // Saque direto

        System.out.println("Saldo Conta Poupança após o saque: " + contaPoupanca.getSaldo());
    }
}