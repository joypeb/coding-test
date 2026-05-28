package Phase0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
	public static void main(String[] args) {
		String s = "loveleetcode";
		// set에 알파벳 추가, 값에는 index를 넣는다.
		// 미리 알파벳에 해당하는 배열을 준비한다. 배열에는 기본값으로 -1이 들어가있다.
		// 만약 알파벳이 한번 나왔다면 0, 한번 이상 나온다면 ++을 해준다.
		// 한번만 나온 알파벳을 찾아서 해당 hashMap의 값을 응답한다.


		char[] arr = s.toCharArray();
		int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

		Map<Character, Integer> map = new HashMap<>();

		for(int i=0; i<arr.length; i++) {
			map.put(arr[i], i);
			alphabet[arr[i]-'a']+=1;
		}

		System.out.println(Arrays.toString(alphabet));

		int result = Integer.MAX_VALUE;

		for (int j=0; j<alphabet.length; j++) {
			if (alphabet[j] == 0) {
				int index = map.get((char)(j+'a'));

				if (index < result) {
					result = index;
				}
			}
		}

		if (result == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
	}
}
