package org.example.interfaces;

// Define um contrato para qualquer classe que represente uma Conta
public interface Conta {
    
    // Método para realizar depósito
    void depositar(Double valor);

    // Método para realizar saque
    void sacar(Double valor);

    // Retorna o saldo atual da conta
    Double getSaldo();
}