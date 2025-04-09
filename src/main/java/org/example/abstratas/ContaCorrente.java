package org.example.abstratas;

// Implementação concreta da Conta do tipo Corrente
public class ContaCorrente extends Conta {

    @Override
    public void imprimeExtrato(){
        // Implementação simples do extrato para conta corrente
        // Aqui poderia ser substituído depois por uma lógica mais detalhada com operações, datas, etc.
        System.out.println("Extrato da Conta Corrente");
    }

}