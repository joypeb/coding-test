package Phase1;

import java.util.Arrays;

public class TwoSum2Sorted {
	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 9;

		// 배열에 투 포인트를 이용
		// 배열의 왼쪽 값 획득
		// 배열의 오른쪽에서 시작하여 숫자가 타겟 숫자보다 작을때까지 이동한다.
		// 타겟보다 작아질경우, 왼쪽 포인터를 이동한다.
		// 왼쪽 포인터를 이동하는데 타겟보다 커질경우 다시 오른쪽 포인터를 이동한다.
		// 반복

		int left = 0;
		int right = numbers.length - 1;

		while (left <= right) {
			int leftNum = numbers[left];
			int rightNum = numbers[right];

			if (leftNum + rightNum == target) {
				System.out.println(Arrays.toString(new int[]{left,right}));
				System.out.println(left+1 + ", " + (right+1));
				break;
			}

			if ((target - leftNum) < rightNum) {
				right--;
				continue;
			}

			if ((target - rightNum) > leftNum) {
				left++;
				continue;
			}

		}
	}
}
