package com.br.motopecas.service;

import com.br.motopecas.dto.ClienteDTO;
import com.br.motopecas.model.Cliente;
import com.br.motopecas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<Cliente> findAll(){return clienteRepository.findAll();}

    public Cliente findById(Integer id){

        Optional<Cliente> cliente = clienteRepository.findById(id);

        return cliente.orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public Cliente update(Integer id, ClienteDTO dto){
        Cliente cliente = findById(id);
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        cliente.setCpf(dto.getCpf());
        cliente.setSenha(dto.getSenha());

        return clienteRepository.save(cliente);
    }

    public void delete(Integer id){
        Cliente cliente = findById(id);
        clienteRepository.delete(cliente);
    }


}
