package codigos_estudo;

import java.util.Scanner;

//usando if-else (e equals) para verificar se usuário e senha estão corretos - exemplo livro Java para Leigos

public class Equals {
	
	public static void main(String[] args) {
		System.out.println("Qual é a senha?");

		Scanner keyboard = new Scanner(System.in);
		String senha = keyboard.next();

		System.out.println("Você digtou >>" + senha + "<<");
		System.out.println();

		if (senha == "swordfish") { /* não é correto usar == neste caso */
			System.out.println("A palavra digitada está gravada no mesmo lugar que a senha verdadeira senha.");
			System.out.println("Você tem que ser hacker");

		} else {
			System.out.println("A palavra digitada não está gravada no mesmo lugar que a senha, mas não tem problema.");
		}
		System.out.println();
		if (senha.equals("swordfish")) { /* está correto usar o EQUALS -- PODE SER TBM ("swordfish".equals(senha)) */
			System.out.println("A palavra digitada é a mesma que a senha real. Pode usar o sistema.");
		} else {
			System.out.println("A palavra digitada não é a mesma que a senha real. Não pode usar o sistema.");
		}

	}
}