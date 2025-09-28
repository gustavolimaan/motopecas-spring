package com.br.motopecas.service;

import com.br.motopecas.dto.CidadeDTO;
import com.br.motopecas.model.Cidade;
import com.br.motopecas.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade save(CidadeDTO dto) {
        Cidade cidade = new Cidade();
        cidade.setNome(dto.getNome());

        return cidadeRepository.save(cidade);
    }
    public List<Cidade> findAll() {
        return cidadeRepository.findAll();
    }

    public Cidade findById(Integer id) {
        Optional<Cidade> cidade = cidadeRepository.findById(id);

        return cidade.orElseThrow(() -> new RuntimeException("Cidade não encontrada"));
    }

    public void update(Integer id, CidadeDTO dto) {
        Cidade cidade = findById(id);
        cidade.setNome(dto.getNome());

        cidadeRepository.save(cidade);
    }

    public void delete(Integer id) {
        Cidade cidade = findById(id);
        cidadeRepository.delete(cidade);

    }

}
