package uvu.cs.cs3250.assignment;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streamer {
	
	// Get the maximum value from a list.
	int getMax(List<Integer> data) {
		return data.stream()
				.collect(Collectors.maxBy(Comparator.naturalOrder()))
				.orElse(0);
	}
	
	int getMin(List<Integer> data) {
		return data.stream()
				.collect(Collectors.minBy(Comparator.naturalOrder()))
				.orElse(0);
	}
	
	int count(List<Integer> data, Predicate<Integer> condition) {
		return data.stream()
				.filter(condition)
				.collect(Collectors.counting()).intValue();
	}
}
