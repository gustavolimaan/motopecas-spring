package com.br.motopecas.service;

import com.br.motopecas.dto.EstadoDTO;
import com.br.motopecas.model.Estado;
import com.br.motopecas.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;


    public Estado save(EstadoDTO dto){
        Estado estado = new Estado();
        estado.setNome(dto.getNome());

        return estadoRepository.save(estado);
    }

    public List<Estado> findAll(){
        return estadoRepository.findAll();
    }

    public Estado findById(Integer id){
        Optional<Estado> estado = estadoRepository.findById(id);

        return estado.orElseThrow(() -> new RuntimeException("Estado não encontrado"));
    }

    public void update(Integer id, EstadoDTO dto){
        Estado estado = findById(id);

        estado.setNome(dto.getNome());

        //Caso já tiver um estado com esse id, o save faz um update
        estadoRepository.save(estado);
    }

    public void delete(Integer id){
        Estado estado = findById(id);

        estadoRepository.delete(estado);
    }
}
