package com.br.motopecas.controller;

import com.br.motopecas.dto.CidadeDTO;
import com.br.motopecas.dto.ClienteDTO;
import com.br.motopecas.model.Cidade;
import com.br.motopecas.service.CidadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;


    @PostMapping
    public ResponseEntity<CidadeDTO> create(@RequestBody @Valid CidadeDTO dto){

        Cidade cidade = cidadeService.save(dto);
        CidadeDTO cidadeDTO = new CidadeDTO(cidade.getId(), cidade.getNome());

        return ResponseEntity.status(HttpStatus.CREATED).body(cidadeDTO);
    }

    @GetMapping
    public ResponseEntity<List<CidadeDTO>> findAll(){
        List<Cidade> cidades = cidadeService.findAll();

        List<CidadeDTO> cidadeDTOS = cidades.stream()
                .map(cidade -> new CidadeDTO(cidade.getId(), cidade.getNome())).toList();

        return ResponseEntity.ok(cidadeDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CidadeDTO> findById(@PathVariable Integer id){
        Cidade cidade = cidadeService.findById(id);
        CidadeDTO cidadeDTO = new CidadeDTO(cidade.getId(), cidade.getNome());

        return ResponseEntity.ok(cidadeDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CidadeDTO> update(@PathVariable Integer id, @RequestBody CidadeDTO dto){
        Cidade cidade = cidadeService.findById(id);
        CidadeDTO cidadeDTO = new CidadeDTO(cidade.getId(), cidade.getNome());
        return ResponseEntity.ok(cidadeDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CidadeDTO> delete(@PathVariable Integer id){
        cidadeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }



}
