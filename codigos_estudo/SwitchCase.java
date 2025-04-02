package codigos_estudo;

import java.util.Scanner;

//usando Switch Case para escolher um dia da semana

public class SwitchCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número correspondente ao dia da semana [1 à 6]: ");
		int diadasemana = sc.nextInt();
		String dia;

		switch (diadasemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Dia da semana inválido";
			break;
		}
		System.out.println("O dia da semana escolhido é: " + dia);
	}

}
