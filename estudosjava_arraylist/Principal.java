package estudosjava_arraylist;

import java.util.ArrayList;

//criando uma lista de pessoas

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoas> lista = new ArrayList<Pessoas>();
		lista.add(new Pessoas("João", 20));/*posso criar um objeto dentro do add*/
		lista.add(new Pessoas("Julia", 32));
		lista.add(new Pessoas("Bruno", 34));
		lista.add(new Pessoas("Joanna", 28));
		lista.add(new Pessoas("Sofia", 18));
		
		for (Pessoas pessoas : lista) {
			System.out.println(pessoas.getNome() + ", " + pessoas.getIdade() + " anos.");
		}
	}

}
