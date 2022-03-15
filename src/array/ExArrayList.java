package array;

import java.util.*;

public class ExArrayList {

	public static void main(String[] args) {
		List<String> categoryList = new ArrayList<>();
		categoryList.add("Root");
		categoryList.add("Women");
		categoryList.add("Shoes");
		categoryList.add("Accessories");
		categoryList.add("Watch");
		categoryList.add("Umbrella");
		categoryList.add("Clothes");

		for (String s : categoryList) {
			System.out.println(s);
		}

		categoryList.remove(1);

		for (String s : categoryList) {
			System.out.println(s);
		}

		System.out.println("------------ARRAY LIST ITERATOR-------------------");

		ListIterator<String> c = categoryList.listIterator();

		while (c.hasNext()) {
			System.out.print(c.nextIndex() + " ");
			System.out.println(c.next());
		}

		while (c.hasPrevious()) {
			System.out.print(c.previousIndex() + " ");
			System.out.println(c.previous());
		}

		System.out.println("------------ARRAY LIST SET VALUE-------------------");

		categoryList.set(0, "NewRoot");

		for (int i = 0; i < categoryList.size(); i++) {
			System.out.println(categoryList.get(i));
		}

		System.out.println("------------ARRAY LIST SORT-------------------");

		System.out.println(categoryList);

		Collections.sort(categoryList);

		System.out.println(categoryList);

		Collections.reverse(categoryList);

		System.out.println(categoryList);

		categoryList.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});

		System.out.println(categoryList);

		categoryList.sort((s1, s2) -> s2.compareTo(s1));

		System.out.println(categoryList);
	}
}
