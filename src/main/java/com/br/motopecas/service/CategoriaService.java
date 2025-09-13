package com.br.motopecas.service;

import com.br.motopecas.dto.CategoriaDTO;
import com.br.motopecas.model.Categoria;
import com.br.motopecas.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria save(CategoriaDTO dto) {

        Categoria categoria = new Categoria();
        categoria.setNome(dto.getNome());

        return categoriaRepository.save(categoria);
    }

    public List<Categoria> findAll() {return categoriaRepository.findAll();}

    public Categoria findById(Integer id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);

        return categoria.orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    }

    public void update(Integer id, CategoriaDTO dto) {
        Categoria categoria = findById(id);
        categoria.setNome(dto.getNome());
        categoriaRepository.save(categoria);
    }

    public void delete(Integer id) {
        Categoria categoria = findById(id);
        categoriaRepository.delete(categoria);

    }


}
