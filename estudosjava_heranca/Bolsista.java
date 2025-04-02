package estudosjava_heranca;

public class Bolsista extends Aluno {
	private float bolsa;

	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}

	@Override // polimorfismo
//tem 2 metodos pagarMensalidade, então este está SOBREPOSTO
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento facilitado!");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
