package estudosjava_polimorfismo;

public class Cachorro extends Mamifero {
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!!");
	}

	public void reagir(String frase) {// POLIMORFISMO de sobrecarga-> todos os métodos são com assinaturas diferentes
										// na mesma classe.
//nome é igual mas a quantidade ou tipo de parâmetros são diferentes.
		if (frase.equals("Toma comida") || frase.equals("Olá")) {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	public void reagir(int hora, int min) { // POLIMORFISMO de sobrecarga
		if (hora < 12) {
			System.out.println("Abanar o rabo");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar o rabo e latir");
		}
	}

	public void reagir(boolean dono) {// POLIMORFISMO de sobrecarga
		if (dono) {
			System.out.println("Abanar o rabo");
		} else {
			System.out.println("Rosnar e latir");
			this.emitirSom();
		}
	}

	public void reagir(int idade, float peso) {// POLIMORFISMO de sobrecarga
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar o rabo");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}

		}
	}
}
