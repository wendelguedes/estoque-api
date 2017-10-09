package br.ufg.dwm.estoque;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import br.ufg.dwm.estoque.model.Produto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationEstoqueTest {

    private static String URL_VENDA_API = "http://localhost:9000/patrimonio-api";

    public void enviarProdutoParaSistemaDeVendas(Produto produto) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity(URL_VENDA_API + "/produtos", produto, Produto.class);
    }

    @Test
    public void test_create() {
        RestTemplate restTemplate = new RestTemplate();

        Produto produto = new Produto();
        produto.setNome("Carro");
        produto.setMarca("Volks");
        produto.setCodigo("ds21fsd21f3sdfs");

        ResponseEntity<Produto> responseEntity = restTemplate.postForEntity(URL_VENDA_API + "/produtos", produto, Produto.class);

        produto = responseEntity.getBody();
        Assert.assertNotNull(produto);
        System.out.println(produto.getId());
    }

}
