package org.example.Switch;

/**
 * Classe de teste que demonstra o uso da estrutura switch tradicional e moderna (Java 17)
 * para identificar o tipo de conta utilizando polimorfismo.
 */
public class TesteSwitch {

    public static void main(String[] args) {

        // Cria uma instância de ContaCorrente e ContaPoupanca
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        // Exibe o tipo da conta utilizando switch tradicional
        exibeTipoConta(contaCorrente);
//        exibeTipoConta(contaPoupanca); // Descomente para testar com conta poupança

        // Exibe o tipo da conta utilizando switch moderno (Java 17+)
        exibeTipoContaJava17(contaCorrente);
    }

    /**
     * Exibe o tipo da conta utilizando switch tradicional.
     *
     * @param conta Conta a ser analisada
     */
    private static void exibeTipoConta(Conta conta) {
        switch (conta.getTipoConta()) {
            case "Conta Corrente":
                System.out.println("É uma conta corrente.");
                break;
            case "Conta Comum":
                System.out.println("É uma conta comum.");
                break;
            case "Conta Poupanca":
                System.out.println("É uma conta poupança.");
                break;
            default:
                System.out.println("Tipo de conta não identificado.");
        }
    }

    /**
     * Exibe o tipo da conta utilizando switch expression do Java 17.
     *
     * @param conta Conta a ser analisada
     */
    private static void exibeTipoContaJava17(Conta conta) {
        String mensagem = switch (conta.getTipoConta()) {
            case "Conta Corrente" -> "É uma conta corrente.";
            case "Conta Comum" -> "É uma conta comum.";
            case "Conta Poupanca" -> "É uma conta poupança.";
            default -> "Tipo de conta não identificado.";
        };

        System.out.println(mensagem);
    }
}