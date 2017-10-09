package br.ufg.dwm.estoque.repositories;

import org.springframework.data.repository.CrudRepository;

import br.ufg.dwm.estoque.model.Estoque;

public interface EstoqueRepository extends CrudRepository<Estoque, Long> {

}
