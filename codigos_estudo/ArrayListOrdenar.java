package codigos_estudo;

import java.util.ArrayList;
import java.util.Collections;

//lsitando em ordem crescente e decrescente

public class ArrayListOrdenar {

	public static void main(String[] args) {
		ArrayList<String> bandas = new ArrayList<String>();
		bandas.add("Guns N' Roses");
		bandas.add("Metallica");
		bandas.add("AC/DC");
		bandas.add("Linkin Park");
		bandas.add("Aerosmith");
		bandas.add("Iron Maiden");
		bandas.add("Rise Against");
		bandas.add("The Offspring");
		
		//imprimir em ordem crescente (alfabética):
		Collections.sort(bandas);
			for (String nome : bandas) {
			System.out.println(nome);
			
			}
			System.out.println();
			System.out.println("************");
			
		//decrescente:
		Collections.sort(bandas, Collections.reverseOrder());
			for (String nome : bandas) {
			System.out.println(nome);
			}
		
		}
}

