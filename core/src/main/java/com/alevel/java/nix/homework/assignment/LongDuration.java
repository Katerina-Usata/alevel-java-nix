package com.alevel.java.nix.homework.assignment;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;

public final  class LongDuration {
	public Duration find(Collection<LocalDateTime> timestamps) {

		return timestamps.stream()
						 .map(Roster::empty)
						 .reduce(Roster::merge)
						 .map(range -> Duration.between(range.getStart(), range.getEnd()))
						 .orElse(Duration.ZERO);
	}

}
