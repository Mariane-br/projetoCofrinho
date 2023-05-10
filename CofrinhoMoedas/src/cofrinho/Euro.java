package cofrinho;

import java.util.Scanner;

public class Euro extends Moeda{
	
	//Construtor da classe Moeda herdando o valor dela
	public Euro(double valor) {
		super(valor);
	}

	//Método para exibir informações
	@Override
	public void info() {
	}

	//Método para converter Euro para Real
	@Override
	public double converter() {
		double valorReal;
		valorReal = this.valor * 3.73;
		return valorReal;
	}

	//Método utilizado para representação textual do valor e do resultado da conversão
	@Override
	public String toString() {
		return "Euro [valor=" + valor + ", convertido para Real=" + converter() + "]";
	}

	//hashCode -> utilizado para organizar os elementos
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	//Comparando a referência entre objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
}
