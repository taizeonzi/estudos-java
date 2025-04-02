package estudosjava_composicao;

//exemplo de composição

public class Pessoa {
	private String nome;
	private Endereco endereco;
	// classe Pessoa tem um atributo do tipo Endereco, demonstrando a composição

	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public void mostrarDetalhes() {
		// O método mostrarDetalhes da classe Pessoa exibe o nome da pessoa e os detalhes do endereço
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getCidade());
	}

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua das Flores", "Porto Alegre");
		Pessoa pessoa = new Pessoa("João", endereco);
		pessoa.mostrarDetalhes();
		//ao executar o método main, ele cria um objeto Endereco e um objeto Pessoa que contém esse endereço, e então exibe os detalhes da pessoa e do endereço

	}
}