package Phase0;

import java.util.*;

public class HashMaps {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("apple", 1);
		map.put("banana", 2);

		System.out.println(map.get("apple"));

		// searching -> reduce it using a HashMap

		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int target = 11;

		// 브루트 포스
		for (int i=0; i<nums.length; i++) {
			for(int j=1+1; j<nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println(Arrays.toString(new int[] {i, j}));
				}
			}
		}

		System.out.println("------");
		Map<Integer, Integer> map2 = new HashMap<>();

		// HashMap
		for (int i=0; i<nums.length; i++) {
			int complement = target - nums[i];

			if (map2.containsKey(complement)) {
				System.out.println(Arrays.toString(new int[]{map2.get(complement), i}));
			}

			map2.put(nums[i], i);
		}

		System.out.println("------");
		// 문자 또는 숫자의 개수를 세는 문제
		String s = "dddwefvadveebe";

		Map<Character, Integer> map3 = new HashMap<>();

		for (char c : s.toCharArray()) {
			map3.put(c, map3.getOrDefault(c, 0) + 1);
		}

		System.out.println(map3);

	}
}
