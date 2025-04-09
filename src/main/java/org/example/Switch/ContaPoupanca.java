package org.example.Switch;

public class ContaPoupanca implements Conta{
    private final String tipoConta;

    public ContaPoupanca(){
        this.tipoConta = "Conta Poupanca";
    }

    @Override
    public String getTipoConta(){
        return this.tipoConta;
    }
}
