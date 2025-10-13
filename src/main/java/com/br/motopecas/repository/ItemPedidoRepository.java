package com.br.motopecas.repository;

import com.br.motopecas.model.ItemPedido;
import com.br.motopecas.model.ItemPedidoPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {
}
