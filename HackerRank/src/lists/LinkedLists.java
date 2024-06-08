package lists;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {

		LinkedList<String> listy = new LinkedList<>();
		listy.add("Max");
		listy.add("Rio");
		listy.add("Koto");
		listy.add("Jiji");
		listy.add("Baba");

		System.out.println(listy.contains("Rio")); // true
		System.out.println(listy.size()); // 5

		listy.remove("Max");

		for (String item : listy) {
			System.out.print(item + " ->> ");
		}

		System.out.println();

		for (int i = 0; i < listy.size(); i++) {
			if (i == listy.size() - 1) {
				System.out.print(listy.get(i));
			} else {
				System.out.print(listy.get(i) + " <-> ");
			}
		}

		System.out.println();

		listy.forEach(x -> System.out.print((x + " <<- ")));

	}

}
