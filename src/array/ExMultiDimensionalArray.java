package array;

import java.util.*;

public class ExMultiDimensionalArray {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int[] m : matrix) {
			System.out.println(m[0] + " " + m[1]);
		}

		System.out.println(matrix[1][0]);

		System.out.println("------------ARRAY ROW COUNT-------------------");

		System.out.println(matrix.length);

		System.out.println("------------ARRAY COLUMN COUNT-------------------");

		System.out.println(matrix[0].length);

		System.out.println("------------ARRAY ALL VARIABLES-------------------");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}

		System.out.println("------------ARRAY AS LIST-------------------");

		Integer[] categoryArray = new Integer[] { 1, 2, 3, 4, 5 };

		List<Integer> categoryList = Arrays.asList(categoryArray);

		for (Integer c : categoryList) {
			System.out.println(c);
		}

		System.out.println("------------ARRAY COPY OF-------------------");
		Integer[] copyCategoryArray = Arrays.copyOf(categoryArray, 3);

		for (Integer c : copyCategoryArray) {
			System.out.println(c);
		}

		System.out.println("------------ARRAY COPY OF RANGE-------------------");
		Integer[] copyRangeCategoryArray = Arrays.copyOfRange(categoryArray, 2, 5);

		for (Integer c : copyRangeCategoryArray) {
			System.out.println(c);
		}

		System.out.println("------------ARRAY FILL-------------------");
		Integer[] filledArray = new Integer[10];
		Arrays.fill(filledArray, 8);

		for (Integer f : filledArray) {
			System.out.print(f);
		}

		System.out.println();

		Arrays.fill(filledArray, 2, 4, 2);

		for (Integer f : filledArray) {
			System.out.print(f);
		}

	}
}
