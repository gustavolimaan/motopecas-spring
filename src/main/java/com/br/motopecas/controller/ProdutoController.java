package com.br.motopecas.controller;

import com.br.motopecas.dto.CategoriaDTO;
import com.br.motopecas.dto.ProdutoDTO;
import com.br.motopecas.model.Produto;
import com.br.motopecas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoDTO> create(@RequestBody ProdutoDTO dto){

        Produto produto = produtoService.save(dto);
        ProdutoDTO produtoDTO = new ProdutoDTO(produto.getId(), produto.getNome(),
                produto.getDescricao(), produto.getPreco(), produto.getFabricante(), new CategoriaDTO(produto.getCategoria().getId(), produto.getCategoria().getNome()));

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoDTO);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll(){
        List<Produto> produtos = produtoService.findAll();
        List<ProdutoDTO> produtosDTOS = produtos.stream().
                map(produto -> new ProdutoDTO(produto.getId(), produto.getNome(),
                        produto.getDescricao(), produto.getPreco(), produto.getFabricante(), new CategoriaDTO(produto.getCategoria().getId(), produto.getCategoria().getNome()))).toList();

        return ResponseEntity.ok(produtosDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> findById(@PathVariable Integer id){
        Produto produto = produtoService.findById(id);
        ProdutoDTO produtoDTO = new ProdutoDTO(produto.getId(), produto.getNome(),
                produto.getDescricao(), produto.getPreco(), produto.getFabricante(), new CategoriaDTO(produto.getCategoria().getId(), produto.getCategoria().getNome()));

        return ResponseEntity.ok(produtoDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody ProdutoDTO dto){
        produtoService.update(id,dto);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        produtoService.delete(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/filtrar")
    public List<Produto> filtrarProduto(@RequestParam(required = false) String nome, @RequestParam(required = false) String descricao,
                                        @RequestParam(required = false) Double preco, @RequestParam(required = false) String fabricante){
        return produtoService.filtrarProduto(nome, descricao, preco, fabricante);
    }

}
