package com.br.motopecas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {
    private Integer id;
    private Timestamp data;
    private Integer cliente_id;
    private Integer endereco_id;
    private String numero_pedido;
}
