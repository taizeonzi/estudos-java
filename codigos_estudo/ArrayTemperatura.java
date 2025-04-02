package codigos_estudo;

//lista de temperaturas, tamanho do array e incremento do dia

public class ArrayTemperatura {
	
	public static void main(String[] args) {
		double[] temperatura = new double[5];
		temperatura[0] = 31.3;
		temperatura[1] = 32;
		temperatura[2] = 33.7;
		temperatura[3] = 34;
		temperatura[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 3 é: " + temperatura[2]);
		
		System.out.println("O tamanho do array é: " + temperatura.length);
		
		for(int i = 0; i < temperatura.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperatura[i]);
		
		System.out.println();
		
		//foreach
		for(double temp : temperatura) {
			System.out.println(temp);
			}
		}
	}
}
