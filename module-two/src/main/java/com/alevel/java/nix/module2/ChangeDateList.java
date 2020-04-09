package com.alevel.java.nix.module2;
import java.util.*;
import java.text.*;


public class ChangeDateList {
	public static void main(String[] args) {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd");
		String[] date = {"2020/04/05", "20/12/2005", "02/04/2014", "1525-02-14"};
		String[] r = {"", "", "", ""};
		char c = '/';
		char c2 = '-';
		for (int j = 0; j < date.length; j++) {
			for (int i = 0; i < 10; i++) {

				if (date[j].charAt(i) != c & date[j].charAt(i) != c2) {
					r[j] += date[j].charAt(i);

				}
			}
		}
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
	}
}


