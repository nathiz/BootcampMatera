package org.example.anonimas;

public class CarteiraContas {

    // Criação de uma "Conta Corrente" usando classe anônima
    Conta contaCorrente = new Conta() {
        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta Corrente");
        }
    };

    // Criação de uma "Conta Poupança" também usando classe anônima
    Conta contaPoupanca = new Conta() {
        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta Poupança");
        }
    };

}