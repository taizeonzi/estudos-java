package codigos_estudo;

import java.util.Scanner;

//excercicio prof.Loiane
//Faça um programa que peça o raio de um círculo, calcule e mostre sua área

public class ExercicioMath1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio do círculo:");
		double raio = sc.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("A área do círculo é: " + area);

	}

}