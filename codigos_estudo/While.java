package codigos_estudo;

import java.util.Scanner;

//usando "While" para jogo de adivinhação

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite números de 0 a 10 até acertar o número da sorte!");
		System.out.print("Insira o número: ");
		int num = sc.nextInt();
		int soma = 0;

		while (num != 0) {
			System.out.print("Insira o número: ");
			num = sc.nextInt();
			soma = soma + num;
		}
		System.out.println("Você acertou! O número da sorte é 0!!");
		System.out.println("A soma dos números inseridos é: " + soma);
	}

}