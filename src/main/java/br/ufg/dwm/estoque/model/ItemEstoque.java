package br.ufg.dwm.estoque.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
public class ItemEstoque implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER,optional=false)
	@JoinColumn(name = "estoque_id")
	private Estoque estoque;

	@ManyToOne(fetch = FetchType.EAGER,optional=false)
	@JoinColumn(name = "produto_id")
	private Produto produto;

	private BigDecimal quantidade = BigDecimal.ZERO;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date data;

}