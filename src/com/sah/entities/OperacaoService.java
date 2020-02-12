package com.sah.entities;

import javax.swing.JOptionPane;

public class OperacaoService implements IOperacoes {

	private double resultado = 0.0;
	
	public double getResultado() {
		return resultado;
	}

	@Override
	public double adicao(double num1, double num2) {
		resultado = num1 + num2;
		return resultado;
	}

	@Override
	public double divisao(double num1, double num2) {
		try {
			resultado = num1 / num2;
		} catch (ArithmeticException  e) {
			JOptionPane.showMessageDialog(null, "ERRO: Divisão por 0.");	
		}
		return resultado;
	}

	@Override
	public double multiplicacao(double num1, double num2) {
		resultado = num1 * num2;
		return resultado;
	}

	@Override
	public double subtracao(double num1, double num2) {
		resultado = num1 - num2;
		return resultado;
	}

}
