package estudosjava_heranca;

public class Principal {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Cláudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade(); /*
								 * pagarMensalidade do "Aluno" é diferente da do "Bolsista", usando a
								 * sobreposição
								 */
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade(); /*
								 * pagarMensalidade do "Aluno" é diferente da do "Bolsista", usando a
								 * sobreposição
								 */
	}

}
