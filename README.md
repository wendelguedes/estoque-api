## Projeto final da disciplina de programação backend avançada

### Tecnologias:

**Spring Boot**, **JPA/Hibernate**, **h2database**, **Swagger2** e **Lombok**.

### Para rodar a aplicação execute em seu terminal o seguinte comando:

`mvn spring-boot:run`

Obs: Caso importe o projeto utilizando alguma IDE como o Eclipse é nescessário instalar o lombok:

[https://projectlombok.org/download] (https://projectlombok.org/download)

### Documentação da API com o Swagger-ui :

[http://localhost:9090/estoque-api/swagger-ui.html](http://localhost:9090/estoque-api/swagger-ui.html)

### Passos para testar:

##### 1º Casdastre um estoque:

```
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{ \ 
   "id": 3, \ 
   "nome": "Estoque de trindade" \ 
 }'
```

##### 2º Cadastre um produto:

```
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{ \ 
   "codigo": "AS1D2A1SD21", \ 
   "id": 3, \ 
   "marca": "BOMBRIL", \ 
   "nome": "PALHA DE AÇO" \ 
 }'
 ```
 
 **Nota:** Quando um produto é cadastrado o sistema faz um POST para cadastrar o mesmo produto no sistema de vendas:
 
 Url Recurso: http://localhost:3000/venda-api/produtos
 
 
##### 3º Cadastre um itemEstoque:
 
 ```
 curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{ \ 
   "data": "2017-11-01 22:42:32", \ 
   "estoqueId": 1, \ 
   "produtoId": 1, \ 
   "quantidade": 10 \ 
 }' 'http://localhost:9090/estoque-api/itensEstoque'
 ```
 #### 4º Todos os EndPoints da API podem ser testados diretamente pelo swagger-ui:
 
 [http://localhost:9090/estoque-api/swagger-ui.html](http://localhost:9090/estoque-api/swagger-ui.html)