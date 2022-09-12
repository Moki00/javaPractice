package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysStream {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Create a stream
		Stream<String> shoppingStream = Stream.of("apples", "bananas", "cherries", "coffee");

		// Array
		String[] shoppingArrayStrings = new String[] { "apples", "bananas", "cherries", "coffee" };
		Stream<String> shoppingArrayStream = Arrays.stream(shoppingArrayStrings);

		// Lists
		List<String> shoppingList = List.of("apples", "bananas", "cherries", "coffee");
		Stream<String> shoppingListStream = shoppingList.stream();

		// for loop in one line
		shoppingList.stream().forEach(System.out::println);
		System.out.println("*** line 24 ***");
		shoppingList.parallelStream().forEach(System.out::println);
		System.out.println("*** line 26 ***");

		// Match
		boolean isOnList = shoppingList.stream().anyMatch(item -> item.contains("apples"));
		System.out.println(isOnList);
		System.out.println("*** line 31 ***");

		// Filter
		Stream<String> itemsInAisleStream = shoppingList.stream().filter(item -> item.startsWith("c"));
		itemsInAisleStream.forEach(System.out::println);
		System.out.println("*** line 36 ***");

		// Map
		List<Integer> numbersList = List.of(4, 2, 6, 9, 10, 17, 3);
		Stream<Integer> doubledStream = numbersList.stream().map(n -> n * 2);
		doubledStream.forEach(System.out::println);
		System.out.println("*** line 42 ***");

		// Collect
		List<Integer> doubledList = numbersList.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(doubledList);
		System.out.println("*** line 48 ***");
		
		List<String> names = List.of("sally", "sarah", "sam");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
