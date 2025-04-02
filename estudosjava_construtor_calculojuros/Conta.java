package estudosjava_construtor_calculojuros;

public class Conta {
	String nome;
	String endereco;
	double saldo;

	public void display() {
		System.out.print(nome + " (" + endereco + ") tem R$" + saldo);
	}

	// METODO GETJUROS com parâmetros
	public double getJuros(double taxaPercentual) {
		return saldo * taxaPercentual / 100.00;
	}

}
