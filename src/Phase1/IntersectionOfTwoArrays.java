package Phase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};

		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> result = new HashSet<>();

		for (int num1 : nums1) {
			set.add(num1);
		}

		for (int num2 : nums2) {
			if (set.contains(num2)) {
				result.add(num2);
			}
		}

		System.out.println(
				Arrays.toString(
						result.stream()
								.mapToInt(Integer::intValue)
								.toArray())
		);
	}
}
