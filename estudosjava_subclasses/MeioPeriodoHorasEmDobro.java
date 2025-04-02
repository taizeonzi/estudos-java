package estudosjava_subclasses;

public class MeioPeriodoHorasEmDobro extends EmpregadoMeioPeriodo {

//esta é uma SUBCLASSE de outra SUBCLASSE (subclasse da subclasse EmpregadoMeioPeriodo)	

	@Override
	public double calcValorPagamento(int horas) {
		if (horas <= 40) {
			return getTaxaHora() * horas;
		} else {
			return getTaxaHora() * 40 + getTaxaHora() * 2 * (horas - 40);

			/*
			 * esta subclasse SOBRESCREVE o método de sua classe mãe "calcValorPagamento".
			 * Se criássemos um objeto da classe MeioPeriodoHorasEmDobro, ele teria nome,
			 * cargo, taxaHora e preencherCheque da classe EmpregadoMeioPeriodo, mas teria o
			 * método "calcValorPagamento" da subclasse MeioPeriodoHorasEmDobro.
			 */
		}
	}
}