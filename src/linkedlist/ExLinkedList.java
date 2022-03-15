package linkedlist;

import java.util.*;

public class ExLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Root");
		linkedList.add("Women");
		linkedList.add("Shoes");
		linkedList.add("Accessories");
		linkedList.add("Watch");
		linkedList.add("Umbrella");
		linkedList.add("Clothes");
		linkedList.add("Dresses");

		for (String l : linkedList) {
			System.out.println(l);
		}

		System.out.println("------------LINKED LIST ADD FIRST-------------------");

		linkedList.addFirst("FirstOne");

		for (String l : linkedList) {
			System.out.println(l);
		}

		System.out.println("------------LINKED LIST ADD LAST-------------------");

		linkedList.addLast("LastOne");

		for (String l : linkedList) {
			System.out.println(l);
		}

		System.out.println("------------LINKED LIST GET FIRST-------------------");

		System.out.println(linkedList.getFirst());

		System.out.println("------------LINKED LIST GET LAST-------------------");

		System.out.println(linkedList.getLast());

		System.out.println("------------LINKED LIST ADD NODE-------------------");

		linkedList.set(1, "Yunus");

		for (String l : linkedList) {
			System.out.println(l);
		}

		System.out.println("------------LINKED LIST UPDATE NODE-------------------");

		linkedList.set(1, "Sezgin");

		for (String l : linkedList) {
			System.out.println(l);
		}

		System.out.println("------------LINKED LIST REMOVE NODE-------------------");

		linkedList.remove(1);

		for (String l : linkedList) {
			System.out.println(l);
		}

		System.out.println("------------LINKED LIST EMPTY-------------------");

		while (!linkedList.isEmpty()) {
			System.out.println(linkedList.removeFirst());
		}

		System.out.println("------------LINKED LIST GET SIZE-------------------");

		System.out.println(linkedList.size());

	}

}
