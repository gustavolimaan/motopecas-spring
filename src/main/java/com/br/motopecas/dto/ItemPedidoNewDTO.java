package com.br.motopecas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedidoNewDTO {

    private Integer produto_id;
    private Integer quantidade;
}
