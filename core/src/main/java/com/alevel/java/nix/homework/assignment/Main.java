package com.alevel.java.nix.homework.assignment;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;

import static java.util.stream.Collectors.joining;

public class Main {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		List<LocalDateTime> timestamps = Arrays.asList(
				now,
				now.minusHours(2),
				now.plusHours(2),
				now.minusDays(1),
				now.plusDays(1),
				now.plusYears(12),
				now.plusWeeks(5)
		);
		System.out.println(timestamps);
		SortedMap<LocalDate, SortedSet<LocalTime>> byDate = new TimeByDate().group(timestamps);

		String newline = System.lineSeparator();
		String humanReadableOutput = byDate.entrySet().stream()
										   .map(String::valueOf)
										   .collect(joining(newline, "List:" + newline, newline));
		System.out.print(humanReadableOutput);

		Duration LongDuration = new LongDuration().find(timestamps);
		System.out.println(LongDuration.toHours());
	}

}
