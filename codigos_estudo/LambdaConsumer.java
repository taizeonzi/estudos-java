package codigos_estudo;

import java.util.List;
import java.util.function.Consumer;

// uso de lambda CONSUMER	

public class LambdaConsumer {

	public static void main(String[] args) {
		List<String> strings = List.of("Bruno", "Tai", "Cleusa");
		List<Integer> integers = List.of(1, 2, 3);
		forEach(strings, s -> System.out.println(s));
		forEach(integers, i -> System.out.println(i));

	}

	private static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T e : list) {
			consumer.accept(e);
		}

	}

}
