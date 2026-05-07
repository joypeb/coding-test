package Phase1;

public class ValidPalindrome {
	public static void main(String[] args) {
		// 배열을 순회
        // 앞에 포인터 하나, 뒤에 포인터 하나
        // 포인터에 있는 char가 알파벳 혹은 숫자가 아닐경우 다음칸으로 이동
        // 포인터가 알파벳일경우 멈추고 소문자 변환 후 두 알파벳 비교
        // 두 알파벳이 동일할경우 통과, 아닐경우 false 반환

		// String s = "A man, a plan, a canal: Panama";
		String s = "0p";

		int left = 0;
		int right = s.length() - 1;

		char[] arr = s.toCharArray();

		while (left <= right) {
			while (!isAlphabetOrNumber(arr[left]) && left < right) {
				left++;
			}

			while (!isAlphabetOrNumber(arr[right]) && left < right) {
				right--;
			}

			if (isUpper(arr[left])) {
				arr[left] += 32;
			}

			if (isUpper(arr[right])) {
				arr[right] += 32;
			}

			System.out.println(arr[left]);
			System.out.println(arr[right]);
			System.out.println();

			if (arr[left] != arr[right]) {
				System.out.println("false");
				break;
			}

			left++;
			right--;
		}

	}

	public static boolean isAlphabetOrNumber(char c) {
		return (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57);
	}

	public static boolean isUpper(char c) {
		return c >= 65 && c <= 90;
	}
}
