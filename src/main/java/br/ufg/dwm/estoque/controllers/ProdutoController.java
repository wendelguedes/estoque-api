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

import br.ufg.dwm.estoque.model.Produto;
import br.ufg.dwm.estoque.services.ProdutoService;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping()
    public Produto salvarProduto(@RequestBody @Valid Produto produto){
        return produtoService.salvarProduto(produto);
    }

    @GetMapping("/{id}")
    public Produto consultarProdutoPorId(@PathVariable Long id){
        return produtoService.consultarProdutoPorId(id);
    }

    @GetMapping()
    public List<Produto> listar(){
        return produtoService.listarProdutos();
    }

}
