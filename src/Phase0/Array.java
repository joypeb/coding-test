package Phase0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array {
	public static void main(String[] args) {
		/*
			Array
			- Array is the most fundamental and important data structure.
			- Arrays are stored in contiguous memory (배열은 메모리에 연속적으로 저장된다)
			- I can access elements by index in O(1) time
				- Why is array access O(1) time?
					- Because the memory address can be computed directly (주소 계산으로 바로 접근 가능하기 때문)
						`Address = Base Address + (Index * Element Size)`
						Base Address: Array's first address
						Elements Size: Data Type size (ex, int = 4byte)
			- in Java, Arrays are int[], String[]
		*/

		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr[2]);

		// Traversing an array once is O(n)
		for (int j : arr) {
			System.out.println(j);
		}

		// Reverse an array
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		System.out.println(Arrays.toString(arr));

		// Find max element in an array
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		// has duplicate
		// if i use nested loop, it's inefficient O(n^2)
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate");
				}
			}
		}

		// I can optimise this using a HashSet O(n)
		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			if (set.contains(num)) {
				System.out.println("Duplicate");
			}
			set.add(num);
		}
	}
}
