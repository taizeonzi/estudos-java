package codigos_estudo;

import java.util.ArrayList;
import java.util.List;

//adicionando os itens da lista 2 na lista 1

public class ArrayListAdd {
	
	public static void main(String[] args) {
		List<String> itens1 = new ArrayList<>();
		List<String> itens2 = new ArrayList<>();
		
		itens1.add("caneta");
		itens1.add("borracha");
		itens1.add("lápis");
		
		itens2.add("mesa");
		itens2.add("cadeira");
		itens2.add("luminária");
		
		for(String itens : itens1) {
			System.out.println(itens);
		}
		System.out.println("----------");
		System.out.println("Unindo as listas:");
		itens1.addAll(itens2);
		for(String itens : itens1) {
			System.out.println(itens);
		}
	}

}
