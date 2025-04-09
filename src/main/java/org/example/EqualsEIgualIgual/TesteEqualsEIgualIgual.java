package org.example.EqualsEIgualIgual;

public class TesteEqualsEIgualIgual {

    public static void main(String[] args) {
        String nome1 = "Fulano";
        String nome2 = "Fulano";
        String nome3 = new String("Fulano");
        String nome4 = "fulano";

        System.out.println("(nome1 == nome2): " + (nome1 == nome2));
        System.out.println("(nome1 == nome3): " + (nome1 == nome3));
        System.out.println("nome1.equals(nome2): " + nome1.equals(nome2));
        System.out.println("nome1.equals(nome3):" + nome1.equals(nome3));
        System.out.println("nome1.equalsIgnoreCase(nome2): " + nome1.equalsIgnoreCase(nome4));

    }

}
