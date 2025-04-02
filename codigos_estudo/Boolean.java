package codigos_estudo;

import java.util.Scanner;

// usando booleanos para verificar se usuário e senha estão corretos

public class Boolean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("USUÁRIO: ");
		String usuario = sc.next();
		System.out.print("SENHA: ");
		String senha = sc.next();
		
		String usuarioCorreto = "cavalobranco";
		String senhaCorreta = "2332";
		
		boolean loginCorreto = usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta);
		System.out.println(loginCorreto);
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();
		
		//tabela verdade
		
		int idUsuario = 10;
		boolean numero = idUsuario == 2 ||  idUsuario == 5;
		System.out.println(numero);
		
		int idUsuario2 = 5;
		boolean numero2 = idUsuario2 == 2 ||  idUsuario2 == 5;
		System.out.println(numero2);
		
		boolean resultado = false;
		System.out.println("Resultado: " + resultado);
		
		boolean resultado2 = !false;
		System.out.println("Resultado: " + resultado2);
		
		boolean resultado3 = (usuarioCorreto.equals(usuario));
		System.out.println("Resultado: " + resultado3);
		
	}

}
