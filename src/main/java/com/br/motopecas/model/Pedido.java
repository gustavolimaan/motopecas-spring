package com.br.motopecas.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Timestamp data;

    @ManyToOne
    @JoinColumn(name = "fk_cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "fk_endereco_id", nullable = false)
    private Endereco endereco;

    private String numero_pedido;

    @OneToMany(mappedBy = "id.pedido", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<ItemPedido> itens = new ArrayList<>();
}