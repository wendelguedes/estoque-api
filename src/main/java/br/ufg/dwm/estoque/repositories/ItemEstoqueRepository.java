package br.ufg.dwm.estoque.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.ufg.dwm.estoque.model.ItemEstoque;

public interface ItemEstoqueRepository extends CrudRepository<ItemEstoque, Long> {

	@Query("select i from ItemEstoque i where i.produto.id = :id and quantidade > 0.0")
	List<ItemEstoque> listarItensEstoquePorProduto(@Param("id") Long id);
}
