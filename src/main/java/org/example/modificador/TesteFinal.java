package org.example.modificador;

public class TesteFinal {

    // A referência 'contaFinal' é final, ou seja, não pode apontar para outro objeto depois de criada
    final static Conta contaFinal = new Conta(500.00);

    public static void main(String[] args) {
        // Mesmo sendo final, é possível alterar os valores internos do objeto, como o saldo
        contaFinal.setSaldo(600.00);

        // Exibindo o saldo atualizado
        System.out.println(contaFinal.getSaldo());
    }

}