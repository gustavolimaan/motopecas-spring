package com.br.motopecas.repository;

import com.br.motopecas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


    @Query("SELECT p FROM Produto p WHERE " +
            "(:nome IS NULL OR p.nome LIKE %:nome%) AND " +
            "(:descricao IS NULL OR p.descricao LIKE %:descricao%) AND " +
            "(:preco IS NULL OR p.preco = :preco) AND " +
            "(:fabricante IS NULL OR p.fabricante LIKE %:fabricante%) AND " +
            "(:categoria_id IS NULL OR p.categoria.id = :categoria_id)")
    List<Produto> filtrarProduto(String nome, String descricao, Double preco, String fabricante, Integer categoria_id);

}
