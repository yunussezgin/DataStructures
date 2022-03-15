package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayListExample {

	public static void main(String[] args) {
		String[] categories = { "Main", "Women", "Shoes", "Accessories", "Watch", "Umbrella", "Clothes", "Dresses",
				"Men", "Clothes", "Shirts", "Shoes", "Short", "Outdoor", "Casual", "Kids", "Clothes", "Shoes" };

		for (int i = 0; i < categories.length; i++) {
			System.out.println(categories[i]);
		}

		System.out.println("----------------------------------");

		List<String> categoryList = new ArrayList<>();
		categoryList.add("Main");
		categoryList.add("Women");
		categoryList.add("Shoes");
		categoryList.add("Accessories");
		categoryList.add("Watch");
		categoryList.add("Umbrella");
		categoryList.add("Clothes");
		categoryList.add("Dresses");

		for (int i = 0; i < categoryList.size(); i++) {
			System.out.println(categoryList.get(i));
		}

		Stack<String> s = new Stack<String>();
		System.out.println(s.push("dfd"));
		System.out.println(s.pop());
		// categoryList.add(s.isEmpty());

	}

}
