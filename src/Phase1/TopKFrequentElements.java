package Phase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Phase0.Array;

public class TopKFrequentElements {
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		int k = 2;

		int[] result = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i=0; i<nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		// value 기준 내림차순 정렬
		System.out.println(Arrays.toString(map.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
				.limit(k)
				.map(Map.Entry::getKey)
				.toArray(Integer[]::new)));


		// bucket sort 사용
		// hashMap으로 각 숫자들이 얼마나 있는지 생성
		// List[]를 생성한다. 배열의 크기는 얼마나 호출되었는지를 확인한다.
		// 예를들어 주어진 배열의 크기가 10일경우 최대 10번의 같은 숫자가 있을 수 있기때문에 배열의 크기를 10 (10+1)로 한다.
		// 그리고 배열중 빈도수가 가장 높은, 즉 뒤에서 부터 꺼내서 카운트를 한다
		List<Integer>[] bucket = new List[nums.length + 1];

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int num = entry.getKey();
			int count = entry.getValue();

			if (bucket[count] == null) {
				bucket[count] = new ArrayList<>();
			}

			bucket[count].add(num);
		}

		int[] result2 = new int[k];
		int index = 0;

		for (int count = bucket.length - 1; count >= 0; count --) {
			if (bucket[count] == null) {
				continue;
			}

			for (int num : bucket[count]) {
				result2[index++] = num;

				if (index == k) {
					System.out.println(Arrays.toString(result2));
					break;
				}
			}

			if (index == k) {
					break;
				}
		}
	}
}
