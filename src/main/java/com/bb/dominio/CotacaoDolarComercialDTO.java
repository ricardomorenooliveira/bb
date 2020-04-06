package com.bb.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CotacaoDolarComercialDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private BigDecimal cotacaoCompra;
	private BigDecimal cotacaoVenda;
	private LocalDateTime dataHoraCotacao;
}
