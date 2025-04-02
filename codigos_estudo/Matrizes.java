package codigos_estudo;

public class Matrizes {
	public static void main(String[] args) {

		// instanciando uma matriz:
		double[][] notasAlunos = new double[3][4]; /* (3 alunos, 4 notas) */

		// inserindo os valores:
		notasAlunos[0][0] = 10; /* 1º aluno; 1ª nota */
		notasAlunos[0][1] = 7; /* 1º aluno; 2ª nota */
		notasAlunos[0][2] = 9; /* 1º aluno; 3ª nota */
		notasAlunos[0][3] = 9.5; /* 1º aluno; 4ª nota */

		notasAlunos[1][0] = 9; /* 2º aluno; 1ª nota */
		notasAlunos[1][1] = 8; /* 2º aluno; 2ª nota */
		notasAlunos[1][2] = 7; /* 2º aluno; 3ª nota */
		notasAlunos[1][3] = 9; /* 2º aluno; 4ª nota */

		notasAlunos[2][0] = 8; /* 3º aluno; 1ª nota */
		notasAlunos[2][1] = 9; /* 3º aluno; 2ª nota */
		notasAlunos[2][2] = 10; /* 3º aluno; 3ª nota */
		notasAlunos[2][3] = 7; /* 3º aluno; 4ª nota */

		// imprimindo os valores na tela:
		for (int i = 0; i < notasAlunos.length; i++) { /* percorre as linhas */
			for (int j = 0; j < notasAlunos[i].length; j++) { /* percorre as colunas */
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// alterando um valor:
		notasAlunos[1][3] = 8;

		// imprimindo os novos valores na tela: mudou de 9.0 para 8.0
		for (int i = 0; i < notasAlunos.length; i++) { /* percorre as linhas */
			for (int j = 0; j < notasAlunos[i].length; j++) { /* percorre as colunas */
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}
		// calculando a média de cada aluno:
		System.out.println("Calculando a média de cada aluno:");

		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {

			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + i + " é = " + (soma / 4));
		}
		System.out.println();
		System.out.println("************");

		// inicializando array de array já com os valores:
		double[][] notasAlunos2 = { { 10, 7, 8, 9.5 }, { 9, 8, 7, 6.6 } };

		for (int i = 0; i < notasAlunos2.length; i++) { /* percorre as linhas */
			for (int j = 0; j < notasAlunos2[i].length; j++) { /* percorre as colunas */
				System.out.print(notasAlunos2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
