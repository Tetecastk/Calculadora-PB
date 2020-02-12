package com.sah.main;

import javax.swing.JOptionPane;

import com.sah.entities.OperacaoService;

public class Main {

	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {
		boolean continua = true;				
		int opcao;
		OperacaoService operacoes = new OperacaoService();
		
			while(continua == true){
				try {
					opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Opções \n  1 - SOMAR \n 2 - DIVISÃO \n 3 - MULTIPLICAÇÃO \n 4 - SUBTRAÇÃO \n 5 - SAIR"));	
					if (opcao == 5) {
						continua = false;
					} else {
						double num1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com um número."));
						double num2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com outro número."));				
						switch (opcao) {
						case 1:
							operacoes.adicao(num1, num2);
							JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + operacoes.getResultado());
							break;
						case 2:		
							operacoes.divisao(num1, num2);
							JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + operacoes.getResultado());
							break;
						case 3:
							operacoes.multiplicacao(num1, num2);
							JOptionPane.showMessageDialog(null, num1 + " x " + num2 + " = " + operacoes.getResultado());
							break;
						case 4:		
							operacoes.subtracao(num1, num2);
							JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + operacoes.getResultado());
							break;
						case 5:
							break;
						default:
							JOptionPane.showMessageDialog(null, "Favor escolher uma opção válida de 1 à 5.");
							break;
							
						}
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERRO: Favor entrar apenas com números.");
				}	
			}
	}
	//TODO: Tratar entrada nula.
	//TODO: Não chamar num1 e num2 quando opção for diferente de um número de 1 a 5.
}
