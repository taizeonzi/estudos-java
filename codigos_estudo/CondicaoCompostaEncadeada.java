package codigos_estudo;

import java.util.Scanner;

//Condição composta encadeada

public class CondicaoCompostaEncadeada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o ano do seu nascimento: ");
		int nasc = sc.nextInt();
		System.out.print("Você já fez aniversário este ano? Sim, digite 1, se não, digite 2: ");
		int aniv = sc.nextInt();
		int idade = 0;

		if (aniv == 1) {
			idade = 2024 - nasc;
		} else if (aniv == 2) {
			idade = 2023 - nasc;
		}

		System.out.println("Sua idade é: " + idade);

		if (idade < 16) {
			System.out.println("Você não vota.");
		} else if ((idade >= 16 && idade < 18) || (idade > 70)) {
			System.out.println("Seu voto é opcional.");
		} else {
			System.out.println("Seu voto é obrigatório.");
		}

		sc.close();
	}

}
