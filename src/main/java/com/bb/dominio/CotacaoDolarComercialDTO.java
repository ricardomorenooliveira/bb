package com.bb.dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CotacaoDolarComercialDTO {
	public BigDecimal cotacaoCompra;
	public BigDecimal cotacaoVenda;
	public LocalDateTime dataHoraCotacao;
}
