package com.br.motopecas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Data-Transfer-Object
//objeto simples, que não possui lógica, apenas atributos
//usado para transferir dados entre camadas
//geralmente usado para evitar expor a entidade diretamente
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoDTO {
    private Integer id;
    private String nome;
}
