package org.example.interfaces;

// Implementação concreta da interface Conta
public class ContaCorrente implements Conta {
    
    private Double saldo = 100.00;               // Saldo inicial fixo
    private final Double taxaOperacao = 0.60;    // Taxa cobrada em cada operação

    @Override
    public void depositar(Double valor) {
        // Ao depositar, desconta a taxa da operação
        this.saldo += valor - taxaOperacao;
    }

    @Override
    public void sacar(Double valor) {
        // Ao sacar, também desconta a taxa da operação
        this.saldo -= valor - taxaOperacao;
    }

    @Override
    public Double getSaldo() {
        return this.saldo;
    }
}