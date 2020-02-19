package com.sah.entities;

import java.util.ArrayList;
import java.util.List;

public class Log {

	private List<OperacaoService> listaDeOperacoes = new ArrayList<OperacaoService>();

	public List<OperacaoService> getListaDeOperacoes() {
		return listaDeOperacoes;
	}
	
	public void adicionarOperacao(OperacaoService operacaoService) {
		listaDeOperacoes.add(operacaoService);
	}
	public Object[] converterLista(List<?> listDeOperacoes) {
		Object[] array;
		array = listaDeOperacoes.toArray();
		for(int i = 0 ; i <= array.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(array[i].toString());
		}
		return array;
	}
}
