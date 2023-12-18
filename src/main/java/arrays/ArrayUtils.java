package arrays;

import java.util.Arrays;

public class ArrayUtils {

	public static int sum(int[] numbers) {
		int sum = 0;
		for (Integer n : numbers) {
			sum += n;
		}
		return sum;

	}

	public static int largest(int[] numbers) {
		Arrays.sort(numbers);
		return numbers [numbers.length -1];
	}

	public static double average(int[] numbers) {
		return (double) sum(numbers) / numbers.length;
	}

	public static int[] reverse(int[] numbers) {

		return new int[0];
	}

	public static int[] add(int[] a, int[] b) {
		return new int[0];
	}
}
