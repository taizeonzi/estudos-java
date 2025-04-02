package estudosjava_programa_acoesdevideo;

public class Gafanhoto extends Pessoa { // herança
	private String login; // encapsulamento
	private int totAssistido;

	// construtor
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo); // "super" chamando a superinstância, que é Pessoa
		this.login = login;
		this.totAssistido = 0;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return "Gafanhoto [" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
	}

}
