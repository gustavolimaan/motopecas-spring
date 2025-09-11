package com.br.motopecas.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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

    @NotBlank(message = "O nome do estado não pode ser vazio")
    @Size(min = 3, max = 50, message = "O tamanho do estado precisa ser entre 3 e 50 caracteres")
    private String nome;
}
