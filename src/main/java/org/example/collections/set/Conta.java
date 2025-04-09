package org.example.collections.set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Conta {

    private Long numeroConta;
    private Double saldo;

    // Gera o hash baseado apenas no número da conta
    // Isso é importante quando se usa a conta dentro de um Set ou como chave em Map
    @Override
    public int hashCode() {
        return numeroConta.hashCode();
    }

    // Dois objetos Conta são considerados iguais se tiverem o mesmo número de conta
    @Override
    public boolean equals(Object obj) {
        // Aqui seria legal validar o tipo e evitar possível ClassCastException
        // Mas como é um exemplo simples, tá funcionando
        Conta conta = (Conta) obj;
        return this.numeroConta.equals(conta.getNumeroConta());
    }
}