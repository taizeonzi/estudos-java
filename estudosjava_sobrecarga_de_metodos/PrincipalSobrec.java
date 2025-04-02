package estudosjava_sobrecarga_de_metodos;

import java.util.Scanner;

// sobrecarga de métodos com programa de estoque - curso Udemy

public class PrincipalSobrec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		ProductSobrec produto = new ProductSobrec(name, price);
		System.out.println();
		System.out.println("Updated data: " + produto);
		System.out.println();
		System.out.print("Enter the number of products to be add in stock: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + produto);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + produto);

		sc.close();
	}
}
