package com.br.motopecas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private Integer id;
    private String logradouro;
    private String cep;
    private String complemento;
    private String numero;
    private String bairro;
    private Integer cliente_id;

}
