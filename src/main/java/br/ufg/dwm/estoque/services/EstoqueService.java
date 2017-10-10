package br.ufg.dwm.estoque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.dwm.estoque.model.Estoque;
import br.ufg.dwm.estoque.repositories.EstoqueRepository;

@Service
public class EstoqueService {

    @Autowired
    EstoqueRepository estoqueRepository;

    public Estoque consultarEstoquePorId(Long id) {
        return estoqueRepository.findOne(id);
    }

    public Estoque salvarEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    public List<Estoque> listarEstoques() {
        return (List<Estoque>) estoqueRepository.findAll();
    }

}
