package estudosjava_polimorfismo;

//polimorfismo - programa criado com prof.Guanabara

public class Principal {
	public static void main(String[] args) { // EXEMPLO PARA DEMONSTRAR CONCEITO DE POLIMORFISMO DE SOBREPOSIÇÃO
		Cachorro c = new Cachorro();

		c.reagir("Olá");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);

	}

}
