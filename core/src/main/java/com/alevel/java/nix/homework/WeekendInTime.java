package com.alevel.java.nix.homework;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class WeekendInTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar startDate = new GregorianCalendar();
		try {
			System.out.println("Введите дату (yyyy.mm.dd): ");
			String dateString = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			startDate.setTime(sdf.parse(dateString));


			System.out.println("Введенная дата: " + startDate.getTime());

		} catch (ParseException e) {
			System.out.println("Неправильно введена дата!!!");
		}
		Scanner sc1 = new Scanner(System.in);
		Calendar endDate = new GregorianCalendar();
		try {
			System.out.println("Введите дату (yyyy.mm.dd): ");
			String dateString = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			endDate.setTime(sdf.parse(dateString));


			System.out.println("Введенная дата: " + endDate.getTime());

		} catch (ParseException e) {
			System.out.println("Неправильно введена дата!!!");
		}

		int count = 0;
		while (startDate.before(endDate)) {
			if (isSaturdayOrSunday(startDate)) {
				System.out.println(startDate.getTime());
				count++;
			}
			startDate.add(Calendar.DAY_OF_MONTH, 1);
		}

		System.out.println("Weekend count: " + count);
	}

	public static boolean isSaturdayOrSunday(Calendar gc) {
		return (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);

	}
}


