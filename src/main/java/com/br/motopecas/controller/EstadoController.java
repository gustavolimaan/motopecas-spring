package com.br.motopecas.controller;

import com.br.motopecas.dto.EstadoDTO;
import com.br.motopecas.model.Estado;
import com.br.motopecas.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;


    @PostMapping
    public ResponseEntity<EstadoDTO> create(@RequestBody EstadoDTO dto){
        Estado estado = estadoService.save(dto);
        EstadoDTO estadoDTO = new EstadoDTO(estado.getId(), estado.getNome());

        return ResponseEntity.status(HttpStatus.CREATED).body(estadoDTO);
    }

    @GetMapping
    public ResponseEntity<List<EstadoDTO>> findAll(){
        List<Estado> estados = estadoService.findAll();

        List<EstadoDTO> estadoDTOS = estados.stream()
                .map(estado -> new EstadoDTO(estado.getId(), estado.getNome()))
                .toList();

        return ResponseEntity.ok(estadoDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoDTO> findById(@PathVariable Integer id){
        Estado estado = estadoService.findById(id);
        EstadoDTO dto = new EstadoDTO(estado.getId(), estado.getNome());

        return ResponseEntity.ok(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody EstadoDTO dto){
        estadoService.update(id, dto);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        estadoService.delete(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
