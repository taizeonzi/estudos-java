package estudosjava_sobrecarga_de_metodos;

public class ProductSobrec {
	public String name;
	public double price;
	public int quantity;

	public ProductSobrec() { /* construtor padrão */
	}

	public ProductSobrec(String name, double price, int quantity) { /* construtor */
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public ProductSobrec(String name, double price) { /* sobrecarga */
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() { /* "toString" converte o objeto para string */
		return name + " , $ " + String.format("%.2f", price) + " , " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}