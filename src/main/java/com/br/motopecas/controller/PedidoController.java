package com.br.motopecas.controller;

import com.br.motopecas.dto.ItemPedidoNewDTO;
import com.br.motopecas.dto.PedidoDTO;
import com.br.motopecas.dto.PedidoNewDTO;
import com.br.motopecas.model.ItemPedido;
import com.br.motopecas.model.Pedido;
import com.br.motopecas.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<PedidoDTO> create(@RequestBody PedidoNewDTO dto){
        Pedido pedido = pedidoService.criarPedido(dto);
        PedidoDTO pedidoDTO = new PedidoDTO(
                pedido.getId(), pedido.getData(), pedido.getCliente().getId(), pedido.getEndereco().getId(),
                pedido.getNumero_pedido()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoDTO);
    }




}
