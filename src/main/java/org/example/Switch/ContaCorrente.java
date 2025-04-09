package org.example.Switch;

public class ContaCorrente implements Conta{
    private final String tipoConta;

    public ContaCorrente(){
        this.tipoConta = "Conta Pagamento";
    }
    @Override
    public String getTipoConta(){
        return this.tipoConta;
    }

}
