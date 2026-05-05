package Phase1;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		// 응답시 각 n번째에는 기존 배열 n번째를 제외한 나머지 배열의 곱이 들어가야한다.
		// 배열을 배열만큼 한번 더 순회하면서 자기 자신 제외하고 곱하여 배열에 넣기 -> n^2
		// 배열을 순회하면서 자신 인덱스 이전의 내용을 저장한다
		// 그리고 자신 이후의 인덱스들의 곱을 구한 후, 두 값을 곱한다.

		int[] nums = {1,2,3,4};
		int[] result = new int[4];
		int beforeProduct = 1;

		for (int i=0; i<nums.length; i++) {
			int afterProduct = 1;

			if (i > 0) {
				beforeProduct *= nums[i-1];
			}

			for (int j=i+1; j<nums.length; j++) {
				afterProduct *= nums[j];
			}

			result[i] = beforeProduct * afterProduct;
		}

		System.out.println(Arrays.toString(result));


		// 위의 방법은 비효율적임

		// 각 result에 자신 기준 왼쪽 곱 저장
		int n = nums.length;
		int[] result2 = new int[n];

		result2[0] = 1;

		// result에 왼쪽 곱을 저장한다.
		for (int i=1; i<n; i++) {
			result2[i] = result2[i - 1] * nums[i - 1];
		}

		int right = 1;

		for (int i=n-1; i>=0; i--) {
			result2[i] = result2[i] * right;
			right *= nums[i];
		}

		System.out.println(Arrays.toString(result2));
	}
}
