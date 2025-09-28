package com.br.motopecas.repository;

import com.br.motopecas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
/*

    @Query("SELECT nome FROM PRODUTO" +
    "(:nome IS NULL OR PRODUTO.nome LIKE %:nome%) AND" +
    "(:id IS NULL OR PRODUTO.id = :id)")
    List<Produto> filtrarProduto(String nome, Integer id);

 */
}
