package com.br.motopecas.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private int id;

    @NotBlank(message = "O nome não pode ser vazio")
    @Size(min = 3, max = 50, message = "O nome precisa contar entre 3 e 50 categorias")
    private String nome;
    private String email;
    private String senha;
    private String telefone;

    @NotBlank(message = "O CPF não pode ser vazio")
    private String cpf;
}
