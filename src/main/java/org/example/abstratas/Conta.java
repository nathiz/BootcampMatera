package org.example.abstratas;

// Classe abstrata base para diferentes tipos de conta (corrente, poupança, etc.)
public abstract class Conta {
    // Saldo da conta, encapsulado com acesso via getter/setter
    private Double saldo;

    // Retorna o saldo atual da conta
    public Double getSaldo(){
        return saldo;
    }

    // Atualiza o saldo da conta
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    // Método abstrato que obriga as subclasses a implementar a lógica de extrato
    public abstract void imprimeExtrato();
}