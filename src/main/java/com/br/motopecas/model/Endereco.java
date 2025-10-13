package com.br.motopecas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String logradouro;
    private String cep;
    private String complemento;
    private String numero;
    private String bairro;

    @ManyToOne
    @JoinColumn(name = "fk_cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "fk_cidade_id", nullable = false)
    private Cidade cidade;

    @OneToMany(mappedBy = "endereco", cascade = CascadeType.ALL)
    private List<Pedido> pedidos = new ArrayList<>();
}
