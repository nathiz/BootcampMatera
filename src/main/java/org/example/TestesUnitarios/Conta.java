package org.example.TestesUnitarios;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Conta {
    private Double saldo;
    private Double taxaOperacao;

    public void depositar(Double valor){
        this.saldo += valor - taxaOperacao;
    }

    public void sacar(Double valor){
        this.saldo -= valor + taxaOperacao;
    }

}
