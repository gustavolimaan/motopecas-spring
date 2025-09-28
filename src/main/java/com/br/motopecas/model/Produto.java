package com.br.motopecas.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private String fabricante;


    @ManyToOne
    @JoinColumn(name = "fk_categoria_id", nullable = false)
    @JsonBackReference
    private Categoria categoria;

}
