package estudosjava_private;

//uso de conta com GET e SET 

public class UsoDeConta {

	public static void main(String[] args) {
		Private minhaConta = new Private();
		Private suaConta = new Private();

		minhaConta.setNome("Millie Bob"); /* set: permite modificar (gravar) o valor de um atributo da classe */
		minhaConta.setEndereco("Rua Stranger 222");
		minhaConta.setSaldo(24.02);

		suaConta.setNome("Mike");
		suaConta.setEndereco("Rua Invertida 111");
		suaConta.setSaldo(55.63);

		System.out.print(minhaConta.getNome() + " (" + minhaConta.getEndereco() + ") tem R$" + minhaConta.getSaldo());
		System.out.println();
		System.out.println();
		// get: permite a leitura dos dados

		System.out.print(suaConta.getNome() + " (" + suaConta.getEndereco() + ") tem R$" + suaConta.getSaldo());
	}
}