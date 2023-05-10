package cofrinho;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	//Método para adicionar uma moeda
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	//Método para remover uma moeda
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	//Método para listar as moedas
	public void listagemMoedas() {
		 System.out.println("\nLISTA DE MOEDAS:\n");
		//Estrutura de repetição for para listar cada moeda da lista de moedas
		for(Moeda moeda : listaMoedas) {
			System.out.println(moeda);
		}
		System.out.println();
	}
	
	//Método para obter o total de moedas convertido para real
	public void totalConvertido() {
		double totalConvertido = 0;
		//Estrutura de repetição for para somar cada moeda convertida para Real da lista de moedas
		for(Moeda moeda : listaMoedas) {
			totalConvertido = totalConvertido + moeda.converter();
		}
		System.out.println("\nTOTAL CONVERTIDO:" + totalConvertido);
		System.out.println();
	}	

}
