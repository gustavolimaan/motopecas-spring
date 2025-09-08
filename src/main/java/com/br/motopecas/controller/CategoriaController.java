package com.br.motopecas.controller;

import com.br.motopecas.dto.CategoriaDTO;
import com.br.motopecas.model.Categoria;
import com.br.motopecas.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<CategoriaDTO> create(@RequestBody CategoriaDTO dto){
        Categoria categoria = categoriaService.save(dto);
        CategoriaDTO categoriaDTO = new CategoriaDTO(categoria.getId(), categoria.getNome());

        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaDTO);
    }

}
