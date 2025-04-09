package org.example.lombok;

public class TestePesssoa {

    public static void main(String[] args) {
        // Criando uma instância de Pessoa usando o construtor padrão (gerado automaticamente)
        Pessoa pessoaJulia = new Pessoa();

        // Setando os atributos através dos setters (gerados pelo Lombok)
        pessoaJulia.setId(1L);
        pessoaJulia.setNome("Julia");
        pessoaJulia.setIdade(26);

        // Imprimindo os dados individualmente usando os getters
        System.out.println("Id: " + pessoaJulia.getId());
        System.out.println("Nome: " + pessoaJulia.getNome());
        System.out.println("Idade: " + pessoaJulia.getIdade());

        // Imprimindo o objeto completo — o toString() já foi gerado pelo @ToString do Lombok
        System.out.println(pessoaJulia);
    }

}