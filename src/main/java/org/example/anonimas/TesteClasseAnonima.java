package org.example.anonimas;

public class TesteClasseAnonima {
    public static void main(String[] args) {
        // Cria uma instância da carteira com contas personalizadas via classe anônima
        CarteiraContas carteira = new CarteiraContas();

        // Chamada do método sobrescrito da conta corrente (classe anônima)
        carteira.contaCorrente.imprimeTipoConta(); // Saída: Conta Corrente

        // Chamada do método sobrescrito da conta poupança (classe anônima)
        carteira.contaPoupanca.imprimeTipoConta(); // Saída: Conta Poupança
    }
}