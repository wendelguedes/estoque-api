package br.ufg.dwm.estoque.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.dwm.estoque.model.Estoque;
import br.ufg.dwm.estoque.services.EstoqueService;

@RestController
@RequestMapping("estoques")
public class EstoqueController {

    @Autowired
    EstoqueService estoqueService;

    @PostMapping()
    public Estoque salvarEstoque(@RequestBody @Valid Estoque estoque){
        return estoqueService.salvarEstoque(estoque);
    }

    @GetMapping()
    public List<Estoque> listar(){
        return estoqueService.listarEstoques();
    }

}
