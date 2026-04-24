package Phase0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetSort {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);

		System.out.println(set);

		int[] arr = {1,2,3,4,5,1};

		// 배열에서 중복 제거
		Set<Integer> set2 = new HashSet<>();

		for (int i : arr) {
			set2.add(i);
		}

		int[] arr2 = new int[set2.size()];
		int i = 0;

		for (int num : set2) {
			arr2[i++] = num;
		}

		System.out.println(Arrays.toString(arr2));

		List<Integer> list = new ArrayList<>(set2);

		list.sort(Comparator.naturalOrder());
		System.out.println(list);

		list.sort(Comparator.reverseOrder());
		System.out.println(list);
	}
}
