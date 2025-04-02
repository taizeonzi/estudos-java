package estudosjava_construtor_parametros;

//construtor com parâmetros

public class App {

	public static void main(String[] args) {
		// pode-se passar parâmetros para o contrutor
		Pessoa pessoa = new Pessoa("Oscar", 23, 1.88f);

		pessoa.imprimirDados();
	}
}
