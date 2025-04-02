package codigos_estudo;

import java.util.Scanner;

//excercicio prof.Loiane
//Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário

public class ExercicioMath2 {

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