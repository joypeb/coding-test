package Phase1;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int[] nums = {1,2,3,4,5};
		int target = 5;

		// we are going to put the num in HashMap
		// and we are going to find if there's number: target - nums[i] in hashMap
		// if there's, that num + num[i] is result, so return that result

		for (int i=0; i<nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				System.out.println(map.get(complement) + ", " + i);
			}

			map.put(nums[i], i);
		}
	}
}
