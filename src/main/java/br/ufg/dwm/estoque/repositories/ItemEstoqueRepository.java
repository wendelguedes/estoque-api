package br.ufg.dwm.estoque.repositories;

import org.springframework.data.repository.CrudRepository;

import br.ufg.dwm.estoque.model.ItemEstoque;

public interface ItemEstoqueRepository extends CrudRepository<ItemEstoque, Long> {

}
