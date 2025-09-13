package com.br.motopecas.controller;

import com.br.motopecas.dto.ClienteDTO;
import com.br.motopecas.model.Cliente;
import com.br.motopecas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente save(@RequestBody ClienteDTO dto){ //finalizarrrr
        Cliente cliente = clienteService.save(dto);
        return cliente;
    }
}
