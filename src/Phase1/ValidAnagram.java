package Phase1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";

		HashMap<Character, Integer> sMap = new HashMap<>();
		HashMap<Character, Integer> tMap = new HashMap<>();

		for (char sChar : s.toCharArray()) {
			sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
		}

		for (char tChar : t.toCharArray()) {
			tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
		}

		if (sMap.size() != tMap.size()) {
			System.out.println("false");
		}

		System.out.println(sMap.equals(tMap));
	}
}
