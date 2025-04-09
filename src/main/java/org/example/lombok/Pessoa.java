package org.example.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter // Gera automaticamente os métodos getters para todos os campos
@Setter // Gera os setters também
@ToString // Cria um toString() completo com todos os atributos
public class Pessoa {

    private Long id;
    private String nome;
    private Integer idade;

    // Os métodos abaixo foram comentados porque o Lombok já gera tudo isso automaticamente.
    // Menos código repetido = mais foco na lógica do sistema.
    
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public Integer getIdade() {
//        return idade;
//    }
//
//    public void setIdade(Integer idade) {
//        this.idade = idade;
//    }
}