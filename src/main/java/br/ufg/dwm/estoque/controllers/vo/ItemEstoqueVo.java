package br.ufg.dwm.estoque.controllers.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ItemEstoqueVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long estoqueId;

    private Long produtoId;

    private BigDecimal quantidade = BigDecimal.ZERO;

    private Date data;

    public Long getEstoqueId() {
        return estoqueId;
    }

    public void setEstoqueId(Long estoqueId) {
        this.estoqueId = estoqueId;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
