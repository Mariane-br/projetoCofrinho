package cofrinho;

public class Real extends Moeda{
	
	//Construtor da classe Moeda herdando o valor dela
	public Real(double valor) {
		super(valor);
	}

	//Método para exibir informações
	@Override
	public void info() {
	}

	//Método para converter Reaal para Real. Este método está retornando o próprio valor informado
	@Override
	public double converter() {
		return this.valor;
	}

	//Utilizado para representação textual do valor e do resultado da conversão
	@Override
	public String toString() {
		return "Real [valor=" + valor + ", convertido para Real=" + converter() + "]";
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
