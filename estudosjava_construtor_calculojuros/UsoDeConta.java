package estudosjava_construtor_calculojuros;

public class UsoDeConta {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Conta suaConta = new Conta();

		minhaConta.nome = "Alberto Rodrigues";
		minhaConta.endereco = "Rua das Palmeiras, 111";
		minhaConta.saldo = 24.02;

		suaConta.nome = "João Marildo";
		suaConta.endereco = "Rua do Consumidor, 151";
		suaConta.saldo = 55.63;

		minhaConta.display();
		System.out.printf(" mais R$ %.2f de juros.", minhaConta.getJuros(5.00)); /* refere-se ao objeto minhaConta */
//retorna o seguinte cálculo: return saldo * taxaPercentual(que é tipo double) / 100.00;
//ou seja, 24.02 * 5.00 / 100

		System.out.println();
		System.out.println();

		suaConta.display();

//no método main, antes que a 2ª chamada seja feita, o valor 7.00 é atribuído à variável suaTaxaJuros

		double suaTaxaJuros = 7.00;
		System.out.print(" mais R$");
		double seuValorJuros = suaConta.getJuros(suaTaxaJuros); 
											/*
											 * a chamada suaConta.getJuros(suaTaxaJuros), refere-se ao objeto suaConta e
											 * ao valor armazenado nos campos do objeto suaConta
											 */
		System.out.printf(" %.2f de juros.", seuValorJuros);

		/*
		 * Então, quando a chamada é feita, a expressão saldo * taxaPercentual(que é
		 * tipo double) / 100.00 fica 55.63 * 7.00 / 100
		 */
	}
}