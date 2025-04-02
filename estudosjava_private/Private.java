package estudosjava_private;

//"escondendo" os campos com PRIVATE

public class Private {
	
	private String nome;
	private String endereco;
	private double saldo;

	public void setNome(String n) {
		nome = n;
	}

	public String getNome() {
		return nome;
	}

	public void setEndereco(String e) {
		endereco = e;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setSaldo(double s) {
		saldo = s;
	}

	public double getSaldo() {
		return saldo;
	}

}
