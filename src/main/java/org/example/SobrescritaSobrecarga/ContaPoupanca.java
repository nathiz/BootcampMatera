package org.example.SobrescritaSobrecarga;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

}
