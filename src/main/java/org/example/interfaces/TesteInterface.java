package org.example.interfaces;

public class TesteInterface {
    public static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5000.00);

        System.out.println("Saldo Conta Corrente após deposito: " + contaCorrente.getSaldo());

        contaCorrente.sacar(1000.00);

        System.out.println("Saldo Conta Corrente após o saque: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.00);

        System.out.println("Saldo Conta Poupança após deposito: " + contaPoupanca.getSaldo());

        contaPoupanca.sacar(800.00);
        System.out.println("Saldo Conta Poupança após o saque: " + contaPoupanca.getSaldo());
    }

}
