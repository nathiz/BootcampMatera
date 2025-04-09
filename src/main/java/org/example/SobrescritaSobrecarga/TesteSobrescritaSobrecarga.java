package org.example.SobrescritaSobrecarga;

/**
 * Classe de teste que demonstra o uso de sobrescrita e sobrecarga
 * nos métodos das classes ContaCorrente e ContaPoupanca.
 */
public class TesteSobrescritaSobrecarga {

    public static void main(String[] args) {

        // Cria uma conta poupança com saldo inicial e realiza um depósito
        ContaPoupanca contapoupanca = new ContaPoupanca(6000.00);
        contapoupanca.depositar(500.00); // Depósito sem taxa

        // Cria uma conta corrente e realiza um saque sem informar taxa (usa método sacar com 1 parâmetro)
        ContaCorrente contaCorrenteSemTaxa = new ContaCorrente(9000.00);
        contaCorrenteSemTaxa.sacar(1000.00); // Saque simples

        // Cria uma nova conta corrente e realiza um saque com taxa informada (usa método sobrecarregado)
        ContaCorrente contaCorrenteComTaxa = new ContaCorrente(9000.00);
        contaCorrenteComTaxa.sacar(1000.00, 0.50); // Saque com taxa adicional

        // Exibe os saldos das contas após as operações realizadas
        System.out.println("Saldo da Conta Poupança: " + contapoupanca.getSaldo());
        System.out.println("Saldo da Conta Corrente sem taxa: " + contaCorrenteSemTaxa.getSaldo());
        System.out.println("Saldo da Conta Corrente com taxa: " + contaCorrenteComTaxa.getSaldo());
    }
}