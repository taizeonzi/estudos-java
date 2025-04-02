package codigos_estudo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//uso de lambda FUNCTION

public class LambdaFunction {

	public static void main(String[] args) {
		List<String> strings = List.of("Tai", "Bruno");
		List<Integer> integers = map(strings, (String s) -> s.length());
		List<String> map = map(strings, s -> s.toUpperCase());
		System.out.println(integers);
		System.out.println(map);
	}

	// tipo T, retorno R
	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for (T e : list) {
			R r = function.apply(e);
			result.add(r);
		}
		return result;
	}
}
