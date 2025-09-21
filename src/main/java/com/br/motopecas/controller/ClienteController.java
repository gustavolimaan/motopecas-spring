package com.br.motopecas.controller;

import com.br.motopecas.dto.ClienteDTO;
import com.br.motopecas.dto.EnderecoDTO;
import com.br.motopecas.model.Cidade;
import com.br.motopecas.model.Cliente;
import com.br.motopecas.model.Endereco;
import com.br.motopecas.model.Estado;
import com.br.motopecas.repository.ClienteRepository;
import com.br.motopecas.service.ClienteService;
import com.br.motopecas.service.EnderecoService;
import com.br.motopecas.service.EstadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<ClienteDTO> create(@RequestBody @Valid ClienteDTO dto){

        Cliente cliente = clienteService.save(dto);
        ClienteDTO clienteDTO = new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getSenha(),
                cliente.getTelefone(), cliente.getCpf());

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteDTO);
    }

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> findAll(){
        List<Cliente> clientes = clienteService.findAll();
        List<ClienteDTO> clientesDTOS = clientes.stream()
                .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getEmail(),
                                                      cliente.getTelefone(), cliente.getCpf())).toList();

        return ResponseEntity.status(HttpStatus.OK).body(clientesDTOS);

    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> findById(@PathVariable Integer id){
        Cliente cliente = clienteService.findById(id);
        ClienteDTO dto = new ClienteDTO(id, cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getCpf());

        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> update(@PathVariable Integer id, @RequestBody @Valid ClienteDTO dto){
        clienteService.update(id, dto);

        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteDTO> delete(@PathVariable Integer id){
        //Cliente cliente = clienteService.findById(id);
        clienteService.delete(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping("/{cliente_id}/enderecos")
    public ResponseEntity<EnderecoDTO> create(@RequestBody EnderecoDTO dto){

        Endereco endereco = enderecoService.save(dto);
        EnderecoDTO enderecoDTO = new EnderecoDTO(endereco.getId(), endereco.getLogradouro(), endereco.getCep(),
                endereco.getComplemento(), endereco.getNumero(), endereco.getBairro(), endereco.getCliente().getId(), endereco.getCidade().getId());

        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoDTO);
    }

    @GetMapping("/{cliente_id}/enderecos")
    public ResponseEntity<List<EnderecoDTO>> findByCliente(@PathVariable Integer cliente_id){
        Cliente cliente = clienteService.findById(cliente_id);
        List<EnderecoDTO> enderecosDTO = cliente.getEnderecos().stream()
                .map(endereco -> new EnderecoDTO(endereco.getId(), endereco.getLogradouro(), endereco.getCep(),
                        endereco.getComplemento(), endereco.getNumero(), endereco.getBairro(), endereco.getCliente().getId(), endereco.getCidade().getId()))
                .collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(enderecosDTO);
    }

    @GetMapping("/{cliente_id}/enderecos/{enderecos_id}")
    public ResponseEntity<EnderecoDTO> delete(@PathVariable Integer cliente_id , @PathVariable Integer enderecos_id){
        enderecoService.delete(enderecos_id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }

}
