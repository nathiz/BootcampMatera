package org.example.SobrescritaSobrecarga;

/**
 * Classe ContaPoupanca representa uma conta do tipo poupança.
 * Estende a classe Conta e sobrescreve o método de depósito.
 */
public class ContaPoupanca extends Conta {

    /**
     * Construtor que recebe o saldo inicial da conta poupança.
     * @param saldo Saldo inicial da conta.
     */
    public ContaPoupanca(Double saldo) {
        super(saldo);
    }

    /**
     * Sobrescreve o método de depósito da classe Conta.
     * Diferente da conta comum, aqui o valor é depositado integralmente,
     * sem desconto de taxa de operação.
     * @param valor Valor a ser depositado.
     */
    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }
}