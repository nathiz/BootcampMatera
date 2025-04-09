package org.example.interfaces;

// Implementa a interface Conta, representando uma conta poupança simples
public class ContaPoupanca implements Conta {

    private Double saldo = 100.00; // Saldo inicial da conta

    @Override
    public void depositar(Double valor) {
        // Deposita o valor integral (sem taxa)
        this.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        // Retira o valor solicitado diretamente
        this.saldo -= valor;
    }

    @Override
    public Double getSaldo() {
        return this.saldo;
    }
}