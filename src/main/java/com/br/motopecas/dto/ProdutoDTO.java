package com.br.motopecas.dto;

import com.br.motopecas.model.Categoria;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private String fabricante;
    private CategoriaDTO categoria;
}
