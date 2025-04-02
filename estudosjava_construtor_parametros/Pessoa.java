package estudosjava_construtor_parametros;

public class Pessoa { // CONSTRUTOR COM PARÂMETROS

	private String nome;
	private int idade;
	private float altura;

	public Pessoa(String nome, int idade, float altura) { // construtor com parâmetros
		System.out.println("Você foi chamado para a vaga de atleta!");
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public void imprimirDados() {
		System.out.printf("Nome: %s, idade: %d, altura: %.2fm \n", nome, idade, altura);
	}

	// métodos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
