package com.br.motopecas.repository;

import com.br.motopecas.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
