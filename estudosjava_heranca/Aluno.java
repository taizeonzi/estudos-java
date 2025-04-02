package estudosjava_heranca;

public class Aluno extends Pessoa {
	// Aluno é uma especialização de pessoa e Pessoa é uma generalização de Aluno

	private int matricula;
	private String curso;

	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.nome);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
