package com.br.motopecas.service;

import com.br.motopecas.dto.ClienteDTO;
import com.br.motopecas.model.Cliente;
import com.br.motopecas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save (ClienteDTO dto){
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        cliente.setCpf(dto.getCpf());
        cliente.setSenha(dto.getSenha());

        return clienteRepository.save(cliente);
    }


}
