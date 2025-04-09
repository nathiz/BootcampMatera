package org.example.anonimas;

public class CarteiraContas {
    Conta contaCorrente = new Conta() {
        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta Corrente");
        }
    };

    Conta contaPoupanca = new Conta() {
        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta Poupança");
        }
    };



}
