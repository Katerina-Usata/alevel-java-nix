package com.alevel.java.nix.module2;
import java.util.ArrayList;
import java.util.*;
import java.util.Map;

public class UnicName {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Vita");
		list.add("Vita");
		list.add("Una");
		list.add("Una");
		list.add("Unac");
		Map<String, Integer> map = countWords((ArrayList<String>) list);
		for (Map.Entry<String, Integer> pair2 : map.entrySet()) {
			if (pair2.getValue() == 1) {
				System.out.println(pair2.getKey());
				break;
			}
		}
	}

	public static Map<String, Integer> countWords(ArrayList<String> list) {
		LinkedHashMap<String, Integer> result = new LinkedHashMap<String, Integer>();

		list.forEach(word -> result.put(word, result.containsKey(word) ? result.get(word) + 1 : 1));
		return result;
	}
}

