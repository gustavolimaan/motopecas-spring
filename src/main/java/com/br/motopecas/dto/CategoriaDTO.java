package com.br.motopecas.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO {

    private Integer id;

    @NotBlank(message = "O nome da categoria não pode ser vazio")
    @Size(min = 3, max = 50, message = "O nome da categoria deve ter entre 3 e 50 caracteres")
    private String nome;

}
