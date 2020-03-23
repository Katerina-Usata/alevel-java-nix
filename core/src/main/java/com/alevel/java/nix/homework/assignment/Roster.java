package com.alevel.java.nix.homework.assignment;

public final  class Roster <T extends Comparable<? super T>>
{
	private final T start;

	private final T end;

	private Roster(T start, T end) {
		this.start = start;
		this.end = end;
	}

	public T getStart() {
		return start;
	}

	public T getEnd() {
		return end;
	}
	static <T extends Comparable<? super T>> Roster<T> of(T first, T second) {
		return first.compareTo(second) < 0 ? new Roster<>(first, second) : new Roster<>(second, first);
	}

	static <T extends Comparable<? super T>> Roster<T> empty(T value) {
		return new Roster<>(value, value);
	}

	static <T extends Comparable<? super T>> Roster<T> merge(Roster<T> first, Roster<T> second) {
		if (first.start.compareTo(second.start) < 0) {
			if (first.end.compareTo(second.end) > 0) return first;
			return new Roster<>(first.start, second.end);
		} else {
			if (first.end.compareTo(second.end) < 0) return second;
			return new Roster<>(second.start, first.end);
		}
	}


}
