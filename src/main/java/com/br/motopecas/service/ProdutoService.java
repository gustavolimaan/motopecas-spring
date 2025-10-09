package com.br.motopecas.service;

import com.br.motopecas.dto.ProdutoDTO;
import com.br.motopecas.model.Categoria;
import com.br.motopecas.model.Produto;
import com.br.motopecas.repository.CategoriaRepository;
import com.br.motopecas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    CategoriaService categoriaService;

    public Produto save(ProdutoDTO dto) {

        Categoria categoria = categoriaService.findById(dto.getCategoria().getId());

        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        produto.setFabricante(dto.getFabricante());
        produto.setCategoria(categoria);

        return produtoRepository.save(produto);
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Produto findById(int id) {
        Optional<Produto> produto = produtoRepository.findById(id);

        return produto.orElseThrow(() -> new RuntimeException("Produto não encontrado"));

    }

    public Produto update(Integer id, ProdutoDTO dto) {

        Produto produto = findById(id);
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        produto.setFabricante(dto.getFabricante());
        produto.setCategoria(categoriaService.findById(dto.getCategoria().getId()));

        return produtoRepository.save(produto);
    }

    public void delete(int id) {
        Produto produto = findById(id);
        produtoRepository.delete(produto);
    }

    public Page<Produto> filtrarProduto(String nome, String descricao, Double preco, String fabricante, Integer categoria_id, Pageable pageable) {
        return produtoRepository.filtrarProduto(nome, descricao, preco, fabricante, categoria_id, pageable);
    }

}
