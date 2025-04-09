package org.example.abstratas;

// Implementação da Conta do tipo Poupança
public class ContaPoupanca extends Conta {

    @Override
    public void imprimeExtrato(){
        // Extrato básico da conta poupança
        // Assim como na ContaCorrente, dá pra expandir isso no futuro com mais detalhes 
        //(ex: histórico de rendimento)
        System.out.println("Extrato da Conta Poupança");
    }

}