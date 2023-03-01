package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
		System.out.println("*** stream ***");
		shoppingList.stream().forEach(System.out::println);
		System.out.println("*** parallelStream ***");
		shoppingList.parallelStream().forEach(System.out::println);

		// Match
		System.out.println("*** anyMatch ***");
		boolean isOnList = shoppingList.stream().anyMatch(item -> item.contains("apples"));
		System.out.println(isOnList);

		// Filter
		System.out.println("*** filter ***");
		Stream<String> itemsInAisleStream = shoppingList.stream().filter(x -> x.startsWith("c"));
		itemsInAisleStream.forEach(System.out::println);
		System.out.println("*** filter, find first ***");
		Optional<String> itemsInAisleStream2 = shoppingList.stream().filter(x -> x.startsWith("c")).findFirst();
		System.out.println(itemsInAisleStream2.get());

		// Map
		System.out.println("*** map ***");
		List<Integer> numberList1 = List.of(3, 5, 8, 13, 21, 34);
		List<Integer> numberList3 = Arrays.asList(3, 5, 8, 13, 21, 34);
		List<Integer> numberList9 = new ArrayList<Integer>(Arrays.asList(3, 5, 8, 13, 21, 34));
		Stream<Integer> doubledStream = numberList1.stream().map(num -> num * 2);
		doubledStream.forEach(System.out::println);

		// Collect
		System.out.println("*** collect ***");
		List<Integer> doubledList = numberList3.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(doubledList);
		
		System.out.println("*** String ***");
		List<String> names = List.of("sally", "sarah", "sam");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
