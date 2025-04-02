package codigos_estudo;

import java.util.Random;
import java.util.Scanner;

// criando número aleatório com "new Random()"

public class NumeroAleatorio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um int de 1 a 10: ");

		int numeroEntrada = sc.nextInt();
		int numeroAleatorio = new Random().nextInt(10) + 1;

		if (numeroEntrada == numeroAleatorio) {
			System.out.println("****Você venceu****");
		} else {
			System.out.println("Você perdeu.");
			System.out.println("O número aleatório era " + numeroAleatorio + ".");

		}

		System.out.println("Obrigado por jogar!");
		sc.close();

	}

}
