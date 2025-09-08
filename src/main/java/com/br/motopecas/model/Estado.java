package com.br.motopecas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//@Entity anotação que indica uma classe de entidade JPA e é mapeada para uma tabela de banco de dados.
// @Id anotação que especifica o campo como chave primária da entidade.
// @GeneratedValue anotação que define a estratégia de geração de valores para a chave primária
@Data
@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
}
