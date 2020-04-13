package com.alevel.java.nix.module2;
import java.util.*;
import java.util.regex.Pattern;


public class ChangeDateList {
	public static void main(String[] args) {

		List<String> date = new ArrayList<String>();
		date.add("2018-04-30");
		date.add("20/12/2005");
		date.add("02/04/2014");
		date.add("2010-02-14");
		date.add("15526423");
		date.add("1ljlhhhhg14515581");
		date.add("1565316561");


		removeElements(date);
		String result[] = new String[date.size()];
		ChangeList(date, result);


		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	public static void removeElements(List<String> date) {
		if (date != null) {
			for (int i = 0; i < date.size(); i++) {
				boolean found = Pattern.matches("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26]))).02.29)$"
						+ "|^(((19|2[0-9])[0-9]{2}).02.(0[1-9]|1[0-9]|2[0-8]))$"
						+ "|^(((19|2[0-9])[0-9]{2}).(0[13578]|10|12).(0[1-9]|[12][0-9]|3[01]))$"
						+ "|^(((19|2[0-9])[0-9]{2}).(0[469]|11).(0[1-9]|[12][0-9]|30))$"
						+ "|^((0[469]|12).((19|2[0-9])[0-9]{2}).(0[1-9]|[12][0-9]|30))$"
						+ "|^((0[1-9]|[12][0-9]|3[01]).(0[469]|12).((19|2[0-9])[0-9]{2}))$"
						+ "|^((0[1-9]|[12][0-9]|30).((19|2[0-9])[0-9]{2}).(0[469]|12))", date.get(i));
				System.out.println(found);
				if (found == false) {
					date.remove(i);
					i--;
				}
			}
		}
	}

	public static void ChangeList(List<String> date, String result[]) {
		char c = '/';
		char c2 = '-';
		for (int j = 0; j < date.size(); j++) {
			for (int i = 0; i < 10; i++) {

				if (date.get(j)
						.charAt(i) != c & date.get(j)
											  .charAt(i) != c2) {
					result[j] += date.get(j)
									 .charAt(i);

				}
			}
		}

	}
}


