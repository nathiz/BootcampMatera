package org.example.modificador;

public class Conta {

    // Atributos privados para encapsulamento — só acessíveis via getters/setters
    private Double saldo;
    private String titular;

    // Construtor que exige o saldo inicial (titular pode ser setado depois)
    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    // Getter para acessar o saldo da conta
    public Double getSaldo() {
        return saldo;
    }

    // Setter para alterar o saldo da conta
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Getter para o nome do titular da conta
    public String getTitular() {
        return titular;
    }

    // OBS: Aqui faltou um setter para `titular`. Se a intenção for permitir que o nome
    // seja atribuído depois da criação da conta, vale incluir um `setTitular(String titular)`
}