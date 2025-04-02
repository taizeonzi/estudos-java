package estudosjava_exceções;

//TTO DE EXCEÇÕES COM TRY/CATCH
public class App {

	public static void main(String[] args) {
		Matematica matematica = new Matematica();
		int[] numeros = new int[] { 10, 20, 30, 100 };
		int[] peso = new int[] { 2, 0, 4 };
		// Exception é a classe mais genérica
		// ArithmeticExcepetion, ArrayINdex... são subclasses da Exception, mais "especialistas"

		for (int indice = 0; indice < 4; indice++) {
			try {
				matematica.dividir(numeros[indice], peso[indice]);
				System.out.println("Mensagem após a exceção");
			} catch (ArithmeticException erro) {
				// Trata os erros de aritmética, de calculos matemáticos
				System.out.println("Erro de cálculo " + erro.getMessage());
			} catch (ArrayIndexOutOfBoundsException erro) {
				// Trata os erros relacionados a ultrapassar o tamanho do vetor
				System.out.println("Erro de vetor: " + erro.getMessage());
			} catch (Exception erro) { // Especialista primeiro, Generalista no final
				System.out.println("Erro genérico");
			}
		}
		System.out.println("Mensagem final");
	}

}
