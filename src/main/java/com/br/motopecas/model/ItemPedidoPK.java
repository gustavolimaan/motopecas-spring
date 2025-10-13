package com.br.motopecas.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class ItemPedidoPK implements Serializable
{
    @ManyToOne
    @JoinColumn(name = "fk_pedido_id")
    private Pedido pedido;


    @ManyToOne
    @JoinColumn(name = "fk_produto_id")
    private Produto produto;

}
