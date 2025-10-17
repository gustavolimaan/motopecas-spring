package com.br.motopecas.service;

import com.br.motopecas.dto.ItemPedidoNewDTO;
import com.br.motopecas.dto.PedidoNewDTO;
import com.br.motopecas.model.*;
import com.br.motopecas.repository.ClienteRepository;
import com.br.motopecas.repository.EnderecoRepository;
import com.br.motopecas.repository.ItemPedidoRepository;
import com.br.motopecas.repository.PedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private EnderecoService enderecoService;
    @Autowired
    private ProdutoService produtoService;

    @Transactional
    public Pedido criarPedido(PedidoNewDTO pedidoDTO) {
        Pedido pedido = new Pedido();

        pedido.setData(Timestamp.from(Instant.now()));
        pedido.setCliente(clienteService.findById(pedidoDTO.getCliente_id()));
        pedido.setEndereco(enderecoService.findById(pedidoDTO.getEndereco_id()));
        pedido.setNumero_pedido(gerarNumero());

        for (ItemPedidoNewDTO itemDTO : pedidoDTO.getItens()){
            Produto produto = produtoService.findById(itemDTO.getProduto_id());
            ItemPedido item = new ItemPedido();
            item.setPedido(pedido);
            item.setProduto(produto);
            item.setQuantidade(itemDTO.getQuantidade());
            pedido.getItens().add(item);
        }
        return pedidoRepository.save(pedido);

    }
    private String gerarNumero(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    public List<Pedido> findAll(){
        return pedidoRepository.findAll();
    }

    public Pedido findById(Integer id){
        Optional<Pedido> pedido = pedidoRepository.findById(id);

        return pedido.orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    public void delete(Integer id){
        Pedido pedido = findById(id);
        pedidoRepository.delete(pedido);

    }

}
