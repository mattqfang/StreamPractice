package uvu.cs.cs3250.assignment;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Streamer {
	public int getMax(List<Integer> data) {
		return data.stream()
				.sorted(Comparator.reverseOrder())
				.findFirst()
				.get();
	}
	
	public int getMin(List<Integer> data) {
		return data.stream()
				.sorted()
				.findFirst()
				.get();
	}
		
	public int count(List<Integer> data, Predicate<Integer> t) {
		return (int) data.stream()
				.filter(t)
				.count();
	}
}
