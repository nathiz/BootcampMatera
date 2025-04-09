package org.example.EqualsEIgualIgual;

public class TesteEqualsEIgualIgual {

    public static void main(String[] args) {
        String nome1 = "Fulano";                   // Literal, vai pro pool de strings
        String nome2 = "Fulano";                   // Mesmo conteúdo, reaproveita do pool
        String nome3 = new String("Fulano");       // Cria um novo objeto em memória
        String nome4 = "fulano";                   // Mesmo texto, mas com 'f' minúsculo

        // Compara referências (endereços de memória)
        System.out.println("(nome1 == nome2): " + (nome1 == nome2)); // true - ambos no pool
        System.out.println("(nome1 == nome3): " + (nome1 == nome3)); // false - nome3 é um novo objeto

        // Compara o conteúdo das strings
        System.out.println("nome1.equals(nome2): " + nome1.equals(nome2)); // true - mesmo conteúdo
        System.out.println("nome1.equals(nome3):" + nome1.equals(nome3));  // true - conteúdo igual, mesmo sendo objetos diferentes

        // Compara ignorando diferenças entre maiúsculas e minúsculas
        System.out.println("nome1.equalsIgnoreCase(nome4): " + nome1.equalsIgnoreCase(nome4)); // true - ignora o 'f' minúsculo
    }

}