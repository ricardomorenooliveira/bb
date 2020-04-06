package com.bb.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COTACAO_DOLAR_COMERCIAL")
@Getter
@Setter
public class CotacaoDolarComercial implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(name = "DATA_REQUISICAO")
	private LocalDateTime dataRequisicao;
	
    @Column(name = "DATA_COTACAO_DOLAR")
	private LocalDate dataCotacao;
	
    @Column(name = "COTACAO_COMPRA")
	private BigDecimal cotacaoCompra;
	
    @Column(name = "COTACAO_VENDA")
	private BigDecimal cotacaoVenda;
	
    @Column(name = "DATA_COTACAO")
	private LocalDateTime dataHoraCotacao;
}
