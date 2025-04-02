package estudosjava_subclasses;

// usando subclasses - programa exemplo do livro Java para Leigos

//usando as subclasses

public class FazerFolhaTipoF {

	public static void main(String[] args) {

		EmpregadoPeriodoIntegral piEmpregado = new EmpregadoPeriodoIntegral();
		piEmpregado.setNome("Taíze Onzi");
		piEmpregado.setCargo("Programadora Senior");
		piEmpregado.setSalarioSemanal(8000.00);
		piEmpregado.setDeducaoBeneficios(500.00);
		piEmpregado.preencherCheque(piEmpregado.calcValorPagamento());
		/*
		 * o método "calcValorPagamento" não tem lista de parâmetros, conforme o método
		 * "original" na outra classe. Ele retorna um valor tipo double, conforme o
		 * método "original". O valor double que piEmpregado.calcValorPagamento retorna
		 * é passado para o método piEmpregado.preencherCheque. Está correto, pois o
		 * método "original" preencherCheque tem parâmetro tipo double.
		 * 
		 */
		System.out.println();

		EmpregadoMeioPeriodo mpEmpregado = new EmpregadoMeioPeriodo();
		mpEmpregado.setNome("Steve Surace");
		mpEmpregado.setCargo("Motorista");
		mpEmpregado.setTaxaHora(30.00);
		mpEmpregado.preencherCheque(mpEmpregado.calcValorPagamento(10));

		System.out.println();

		MeioPeriodoHorasEmDobro mpdEmpregado = new MeioPeriodoHorasEmDobro();
		mpdEmpregado.setNome("Bruno Fonseca");
		mpdEmpregado.setCargo("Advogado");
		mpdEmpregado.setTaxaHora(120.00);
		mpdEmpregado.preencherCheque(mpdEmpregado.calcValorPagamento(20));
	}

}
