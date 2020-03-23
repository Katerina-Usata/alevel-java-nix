package com.alevel.java.nix.homework.assignment;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

import static java.util.stream.Collectors.*;

public class TimeByDate {
	public SortedMap<LocalDate, SortedSet<LocalTime>> group(Collection<LocalDateTime> timestamps) {

		return timestamps.stream().collect(groupingBy(
				LocalDateTime::toLocalDate,
				TreeMap::new,
				mapping(LocalDateTime::toLocalTime, toCollection(TreeSet::new))
		));
	}

}
