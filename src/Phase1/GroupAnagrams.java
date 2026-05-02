package Phase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void main(String[] args) {
		// made HashMap for each strs[i]
		// made result list, inner list of result and innnerMap for compare map
		// if result is empty, just add list
		// if result is not empty, compare to previous innerMap, if there not match, add new innerList and add in result
		// if there match, we can check index of list and add that strs[i] in that index of inner

		String[] strs = {"eat","tea","tan","ate","nat","bat"};

		List<List<String>> result = new ArrayList<>();
		List<HashMap<Character, Integer>> innerMap = new ArrayList<>();

		boolean flag = false;

		for (int i=0; i<strs.length; i++) {
			HashMap<Character, Integer> map = new HashMap<>();
			for (int j=0; j<strs[i].length(); j++) {
				map.put(strs[i].charAt(j), map.getOrDefault(strs[i].charAt(j), 0) + 1);
			}

			if (result.isEmpty()) {
				List<String> inner = new ArrayList<>();
				inner.add(strs[i]);
				innerMap.add(map);
				result.add(inner);
			} else {
				for (int k=0; k<innerMap.size(); k++) {
					if (innerMap.get(k).equals(map)) {
						result.get(k).add(strs[i]);
						flag = true;
						break;
					}
				}

				if (!flag) {
					List<String> inner = new ArrayList<>();
					inner.add(strs[i]);
					innerMap.add(map);
					result.add(inner);
				}

				flag = false;
			}
		}


		Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
			// 배열 생성
            char[] chars = s.toCharArray();

			// char 배열 정렬 (이제 모두 같은 문자)
			Arrays.sort(chars); // sort string

			// char 배열로 다시 문자로 만듦
            String key = new String(chars);

			// map에 해당 key와 value에 list를 만든다
            map.putIfAbsent(key, new ArrayList<>());

			// 해당 키 value list에 값을 추가
            map.get(key).add(s);
        }

	}
}
