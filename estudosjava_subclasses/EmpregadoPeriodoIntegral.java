package estudosjava_subclasses;

//herança
//classe filha
//a classe filha não pode fazer referência direta aos campos privados da classe mãe

public class EmpregadoPeriodoIntegral extends Empregado {
	private double salarioSemanal;
	private double deducaoBeneficios;

	public void setSalarioSemanal(double salarioSemanalIn) {
		salarioSemanal = salarioSemanalIn;
	}

	public double getSalarioMensal() {
		return salarioSemanal;
	}

	public void setDeducaoBeneficios(double benefDedIn) {
		deducaoBeneficios = benefDedIn;
	}

	public double getDeducaoBeneficios() {
		return deducaoBeneficios;
	}

	public double calcValorPagamento() {
		return salarioSemanal - deducaoBeneficios;
	}

}