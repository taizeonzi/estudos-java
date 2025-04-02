package codigos_estudo;

import java.util.Scanner;

//excercicio prof.Loiane
/* Faça um programa que peça 2 números inteiros e um real. 
 * Calcule e mostre:
 * a. o produto do dobro do primeiro com a metade do segundo.
 * b. a soma do triplo do primeiro com o terceiro.
 * c. o terceiro elevado ao cubo.*/

public class ExercicioMath3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do lado do quadrado:");
		double lado = sc.nextDouble();

		// area = lado * lado
		double area = Math.pow(lado, 2);

		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro da área do quadrado é: " + (area * 2));

	}

}