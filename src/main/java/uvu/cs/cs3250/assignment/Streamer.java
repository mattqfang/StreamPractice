package uvu.cs.cs3250.assignment;

import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Streamer {
	Streamer() {
	}

	public int getMin(List<Integer> nums) {
		return nums
			.stream()
			.sorted()
			.findFirst()
			.orElse(null);
	}

	public int getMax(List<Integer> nums) {
		return nums
			.stream()
			.sorted(Comparator.reverseOrder())
			.findFirst()
			.orElse(null);
	}

	public int count(List<Integer> nums, Predicate<Integer> condition) {
		return (int) nums
			.stream()
			.filter(condition)
			.count();
	}
}
