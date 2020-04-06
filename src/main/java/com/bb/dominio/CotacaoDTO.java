package com.bb.dominio;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CotacaoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<CotacaoDolarComercialDTO> value;
}
