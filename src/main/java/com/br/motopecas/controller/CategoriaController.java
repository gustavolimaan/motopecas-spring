package com.br.motopecas.controller;

import com.br.motopecas.dto.CategoriaDTO;
import com.br.motopecas.model.Categoria;
import com.br.motopecas.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<CategoriaDTO> create(@RequestBody @Valid CategoriaDTO dto){

        Categoria categoria = categoriaService.save(dto);
        CategoriaDTO categoriaDTO = new CategoriaDTO(categoria.getId(), categoria.getNome());

        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaDTO);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> getAll(){
        List<Categoria> categorias = categoriaService.findAll();

        List<CategoriaDTO> categoriasDTOS = categorias.stream()
                .map(categoria -> new CategoriaDTO(categoria.getId(), categoria.getNome()))
                .toList();

        return ResponseEntity.status(HttpStatus.OK).body(categoriasDTOS);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CategoriaDTO> getById(@PathVariable Integer id){
        Categoria categoria = categoriaService.findById(id);
        CategoriaDTO dto = new CategoriaDTO(id, categoria.getNome());

        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody @Valid CategoriaDTO dto){
        categoriaService.update(id,dto);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        categoriaService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
