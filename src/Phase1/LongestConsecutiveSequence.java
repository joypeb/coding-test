package Phase1;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		// 해쉬맵 사용
		// 배열을 순회하면서, hashSet에 값 저장.
		// 하나를 순회할때마다 hashSet으로 이전값, 이후값 검색
		// 카운트 업데이트

		int[] nums = {100,4,200,1,3,2};

		HashSet<Integer> set = new HashSet<>();
		int result = 0;

		for (int num : nums) {
			int count = 1;
			set.add(num);

			int prevNum = num - 1;
			while(set.contains(prevNum)) {
				prevNum -= 1;
				count++;
			}

			int afterNum = num + 1;
			while(set.contains(afterNum)) {
				afterNum += 1;
				count++;
			}

			if (result < count) {
				result = count;
			}
		}


		System.out.println(result);

		// 개선

		HashSet<Integer> set2 = new HashSet();

		for (int num : nums) {
			set2.add(num);
		}

		int result2 = 0;

		for (int num : set) {
			// num이 시작접이 아닌 경우 스킵한다.
			if (set.contains(num - 1)) {
				continue;
			}

			int currentNum = num;
			int count = 1;

			while (set.contains(currentNum + 1)) {
				currentNum ++;
				count++;
			}

			result2 = Math.max(result2, count);
		}

		System.out.println(result2);
	}


}
