package org.example.modificador;

public class ContaCorrente {

    public static void main(String[] args) {

        // Criando uma nova conta com saldo inicial de 20.00
        Conta conta = new Conta(20.00);

        // Atualizando o saldo da conta para 10.00
        conta.setSaldo(10.00);

        // Aqui está pegando o saldo, mas não faz nada com ele — seria interessante imprimir ou usar de alguma forma
        conta.getSaldo();
    }
}