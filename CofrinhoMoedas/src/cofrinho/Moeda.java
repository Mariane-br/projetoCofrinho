package cofrinho;
//Classe abstrata
public abstract class Moeda{
	double valor;

	//Construtor
	public Moeda(double valor) {
		this.valor = valor;
	}

	//hashCode -> utilizado para organizar os elementos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	//Comparando a referência entre objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
    
	//Método abstrato para exibir informaçõs
	public abstract void info();
	//Método abstrato para converter as moedas
	public abstract double converter();

}
