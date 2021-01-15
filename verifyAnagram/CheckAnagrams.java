import java.util.Arrays;

import java.util.HashMap;

import java.util.HashSet;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;

public class CheckAnagrams {

	public static void main(String[] args) {

		String[] words = { "CAT", "DOG", "TAC", "MAD", "DAM", "AMD", "GOD", "SET" };

		if(null != args) {
			words = new String[args.length];
			words = args;
		}
		Map<String, Set<String>> map = new HashMap<String, Set<String>>();// Main Container

		checkAnagram(words, map);

		displayResults(map);

	}

	private static void checkAnagram(String[] words, Map<String, Set<String>> map) {
		/* Iterate all individual words */

		for (int i = 0; i < words.length; i++) {

			String w1 = words[i];

			Set<String> s1 = new HashSet<>();

			s1.add(w1);

			/* To avoid repeat Job */

			if (map.containsKey(sortString(w1))) {

				continue;

			}

			/*
			 * 
			 * Set sorted character in the Word as key. Sorted key avoids duplicate Group.
			 * 
			 * Ex: [CAT, TAC] and [TAC, CAT]
			 * 
			 */

			map.put(sortString(w1), s1);

			/* Compare the word with rest of the word available in the Array */

			for (int j = words.length - 1; j > -1; j--) {

				String w2 = words[j];

				if (isAnagram(w1, w2)) {

					Set<String> s2 = map.get(sortString(w1));

					s2.add(w2);

					map.put(sortString(w1), s2);

				}

			}

		}
	}

	/*
	 * 
	 * Check 2 words are Anagrams or Not
	 * 
	 */

	public static boolean isAnagram(String s1, String s2) {

		if (s1 == null || s2 == null || s1.length() != s2.length()) {

			return false;

		}

		char[] c1 = s1.toCharArray();

		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);

		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {

			return true;

		}

		return false;

	}

	/*
	 * 
	 * Sort the Characters in the word and return new Word
	 * 
	 */

	public static String sortString(String word) {

		char[] c = word.toCharArray();

		Arrays.sort(c);

		return new String(c);

	}

	/*
	 * 
	 * Print the result: Group by Anagram Words
	 * 
	 */

	private static void displayResults(Map<String, Set<String>> map) {

		for (Entry<String, Set<String>> e : map.entrySet()) {

			if (e.getValue().size() > 1) {

				System.out.println(e.getValue());

			}

		}

	}

}
