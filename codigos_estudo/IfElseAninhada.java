package codigos_estudo;

import java.util.Scanner;

// If-Else aninhada
public class IfElseAninhada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite seu Login: ");
		String login = teclado.next(); // criei a variável ao mesmo tempo que vai ler essa String
		if (login.equals("Tai")) {
			System.out.print("Digite a senha: ");
			String senha = teclado.next();
			if (senha.equals("treinoifelse")) {
				System.out.println("Bem-vinda! Você está conectada ao sistema da empresa! Bom trabalho!");
			} else {
				System.out.println("Senha incorreta");
			}
		} else {
			System.out.println("Usuário desconhecido");
		}
		teclado.close();
	}

}
