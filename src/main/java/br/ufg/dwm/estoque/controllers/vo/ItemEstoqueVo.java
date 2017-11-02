package br.ufg.dwm.estoque.controllers.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ItemEstoqueVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long estoqueId;

	private Long produtoId;

	private BigDecimal quantidade = BigDecimal.ZERO;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date data;

}
