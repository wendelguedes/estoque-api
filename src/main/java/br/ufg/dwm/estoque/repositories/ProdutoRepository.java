package br.ufg.dwm.estoque.repositories;

import org.springframework.data.repository.CrudRepository;

import br.ufg.dwm.estoque.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto,Long> {

}
