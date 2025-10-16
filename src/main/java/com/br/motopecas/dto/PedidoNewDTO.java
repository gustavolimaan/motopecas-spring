package com.br.motopecas.dto;

import com.br.motopecas.model.ItemPedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoNewDTO {

    private Integer endereco_id;
    private Integer cliente_id;
    private List<ItemPedidoNewDTO> itens;
}
