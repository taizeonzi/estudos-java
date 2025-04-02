package estudosjava_subclasses;

// classe mãe
public class Empregado {

	private String nome;
	private String cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeIn) {
		nome = nomeIn;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargoIn) {
		cargo = cargoIn;
	}

	public void preencherCheque(double valorPago) {
		System.out.printf("Pague em nome de %s, %s, o valor de ", nome, cargo);
		System.out.printf("%.2f\n", valorPago);
	}
}