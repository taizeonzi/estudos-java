package estudosjava_subclasses;

//classe filha de Empregado

public class EmpregadoMeioPeriodo extends Empregado {
	private double taxaHora;

	public void setTaxaHora(double taxaIn) {
		taxaHora = taxaIn;
	}

	public double getTaxaHora() {
		return taxaHora;
	}

	public double calcValorPagamento(int horas) {
		return taxaHora * horas;
	}
}