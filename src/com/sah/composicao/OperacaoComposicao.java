package com.sah.composicao;

import java.util.ArrayList;
import java.util.List;

import com.sah.entities.OperacaoService;

public class OperacaoComposicao {

	
	public List<OperacaoService>lisOperacaoServices = new ArrayList<OperacaoService>();
	
	public void adicionarOperacao(OperacaoService operacaoService) {
		lisOperacaoServices.add(operacaoService);
	}
	
}