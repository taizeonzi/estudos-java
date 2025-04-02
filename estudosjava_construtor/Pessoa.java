package estudosjava_construtor;

public class Pessoa { // COM CONSTRUTOR PADRÃO
	private String nome;
	private int idade;
	private float altura;

//construtor: 1º método que será executado assim que for instaciado o objeto
	public Pessoa() { // construtor padrão
		System.out.println("Você foi chamado para a vaga de atleta!"); // com o construtor posso criar mensagens
		altura = 1.88f; // com o construtor posso alterar valores dos atributos
		nome = "Oscar";
		idade = 23;
		imprimirDados(); // com o construtor posso chamar outros métodos
	}

	private void imprimirDados() {
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
