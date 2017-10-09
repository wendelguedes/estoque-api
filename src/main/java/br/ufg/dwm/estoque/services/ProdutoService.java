package br.ufg.dwm.estoque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.ufg.dwm.estoque.model.Produto;
import br.ufg.dwm.estoque.repositories.ProdutoRepository;

@Service
public class ProdutoService {

    @Value("${url-venda-api}")
    private static String URL_VENDA_API;

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto){
        Produto produtoSalvo = produtoRepository.save(produto);
        this.enviarProdutoParaSistemaDeVendas(produtoSalvo);
        return produtoSalvo;
    }

    public Produto consultarProdutoPorId(Long id) {
        return produtoRepository.findOne(id);
    }

    public List<Produto> listarProdutos() {
        return (List<Produto>) produtoRepository.findAll();
    }

    public void enviarProdutoParaSistemaDeVendas(Produto produto) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity(URL_VENDA_API + "/produtos", produto, Produto.class);
    }

}
