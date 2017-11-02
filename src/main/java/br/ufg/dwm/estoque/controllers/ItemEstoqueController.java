package br.ufg.dwm.estoque.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.dwm.estoque.controllers.vo.ItemEstoqueVo;
import br.ufg.dwm.estoque.model.ItemEstoque;
import br.ufg.dwm.estoque.services.ItemEstoqueService;

@RestController
@RequestMapping("itensEstoque")
public class ItemEstoqueController {

	@Autowired
	private ItemEstoqueService itemEstoqueService;

	@PostMapping()
	public ItemEstoque salvarItemEstoqueVo(@RequestBody @Valid ItemEstoqueVo itemVo){
		return itemEstoqueService.salvarItemEstoqueVo(itemVo);
	}

	@GetMapping("/{produto_id}")
	public List<ItemEstoque> listarItensEstoquePorProduto(@PathVariable Long produto_id){
		return itemEstoqueService.listarItensEstoPorProduto(produto_id);
	}

	@GetMapping
	public List<ItemEstoque> listarItensEstoque(){
		return itemEstoqueService.listarItensEstoque();
	}
}