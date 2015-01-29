package testingretrolambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<List<Integer>> dlist = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5),
				Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(1, 2, 3, 4, 5));

		int a = 10;

		// It handles these two calls similarly, extract dynamically-created
		// class and dump it out
		list.forEach(System.out::println);
		list.forEach(n -> System.out.println(n + a));

		System.out.println(list.stream().filter(m -> m % 2 == 0)
				.collect(Collectors.toList()));

	}
}
