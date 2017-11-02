package br.ufg.dwm.estoque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.dwm.estoque.controllers.vo.ItemEstoqueVo;
import br.ufg.dwm.estoque.model.Estoque;
import br.ufg.dwm.estoque.model.ItemEstoque;
import br.ufg.dwm.estoque.model.Produto;
import br.ufg.dwm.estoque.repositories.ItemEstoqueRepository;

@Service
public class ItemEstoqueService {

    @Autowired
    private ItemEstoqueRepository itemEstoqueRepository;

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private EstoqueService estoqueService;

    public ItemEstoque salvarItemEstoqueVo(ItemEstoqueVo itemVo){
        Produto produto = produtoService.consultarProdutoPorId(itemVo.getProdutoId());
        Estoque estoque = estoqueService.consultarEstoquePorId(itemVo.getEstoqueId());

        ItemEstoque itemEstoque = new ItemEstoque();
        itemEstoque.setEstoque(estoque);
        itemEstoque.setProduto(produto);
        itemEstoque.setQuantidade(itemVo.getQuantidade());
        itemEstoque.setData(itemVo.getData());

        return itemEstoqueRepository.save(itemEstoque);
    }

    public List<ItemEstoque> listarItensEstoque(){
        return (List<ItemEstoque>) itemEstoqueRepository.findAll();
    }

	public List<ItemEstoque> listarItensEstoPorProduto(Long id) {
		return (List<ItemEstoque>) itemEstoqueRepository.listarItensEstoquePorProduto(id);
	}

}
