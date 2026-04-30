package Phase1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public static void main(String[] args) {
		// put the nums and that count in HashMap
        // if there's no number in HashMap, count is 1 (default)
        // and check the count if that's over than 1
        // if it's over it, return true

		int[] nums = {1,2,3,1};

		// 첫번째 풀이 HashMap을 이용
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) >= 2) {
                System.out.println("true");
            }
        }
		System.out.println("false");

		// 두번재 풀이 HashSet을 이용
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
				System.out.println("true");
            }
            set.add(num);
        }
		System.out.println("false");
	}
}
