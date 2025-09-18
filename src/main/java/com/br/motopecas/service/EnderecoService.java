package com.br.motopecas.service;

import com.br.motopecas.dto.EnderecoDTO;
import com.br.motopecas.model.Cliente;
import com.br.motopecas.model.Endereco;
import com.br.motopecas.repository.ClienteRepository;
import com.br.motopecas.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ClienteService clienteService;

    public Endereco save(EnderecoDTO dto) {
        Cliente cliente = clienteService.findById(dto.getCliente_id());
        Endereco endereco = new Endereco();

        endereco.setLogradouro(dto.getLogradouro());
        endereco.setCep(dto.getCep());
        endereco.setComplemento(dto.getComplemento());
        endereco.setNumero(dto.getNumero());
        endereco.setBairro(dto.getBairro());
        endereco.setCliente(cliente);

        return enderecoRepository.save(endereco);
    }
}
