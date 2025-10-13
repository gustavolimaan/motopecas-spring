package com.br.motopecas.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class ItemPedido {

    @EmbeddedId
    private ItemPedidoPK id;
    private Integer quantidade;

    public void setPedido(Pedido pedido) {
        this.id.setPedido(pedido);
    }
    public void setProduto(Produto produto) {
        this.id.setProduto(produto);
    }
}
