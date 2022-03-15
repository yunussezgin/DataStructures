package array;

import java.util.*;

public class ExArray {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("-------------------------------");

		String[] categories = { "Root", "Women", "Men", "Kids", "Shoes", "Accessories", "Watch", "Umbrella",
				"Clothes" };

		for (String category : categories) {
			System.out.println(category);
		}

		System.out.println("------------ARRAY COPY-------------------");

		String[] categoriesTemp = new String[5];
		System.arraycopy(categories, 0, categoriesTemp, 0, 5);

		for (int i = 0; i < categoriesTemp.length; i++) {
			System.out.println(categoriesTemp[i]);
		}

		System.out.println("------------ARRAY SORT-------------------");

		Arrays.sort(categories, 0, 3);

		for (int i = 0; i < categories.length; i++) {
			System.out.println(categories[i]);
		}

		System.out.println("------------BINARY SEARCH-------------------");

		Arrays.sort(numbers);

		System.out.println(Arrays.binarySearch(numbers, 4));

		System.out.println("------------COMPARE ARRAYS-------------------");

		Arrays.sort(numbers);

		int[] copyArray = new int[numbers.length];
		System.arraycopy(numbers, 0, copyArray, 0, numbers.length);

		System.out.println(Arrays.equals(numbers, copyArray));
		copyArray[1] = 10;
		System.out.println(Arrays.equals(numbers, copyArray));
	}
}
