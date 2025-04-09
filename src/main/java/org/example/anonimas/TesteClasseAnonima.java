package org.example.anonimas;

public class TesteClasseAnonima {
    public static void main(String[] args) {
        CarteiraContas carteira = new CarteiraContas();
        carteira.contaCorrente.imprimeTipoConta();
        carteira.contaPoupanca.imprimeTipoConta();
    }
}
