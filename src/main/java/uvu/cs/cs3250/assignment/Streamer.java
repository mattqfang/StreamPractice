package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;

interface MyFunc {
	public default int count(List<Integer> ints, Predicate<? super Integer> lamb) {
		return (int) ints.stream().filter(lamb).count();
				
	}
}

public class Streamer implements MyFunc {
	
	public int getMax(List<Integer> ints) {
		return ints.stream()
				.max(Integer::compare)
				.get();
	}
	
	public int getMin(List<Integer> ints) {
		return ints.stream()
				.min(Integer::compare)
				.get();
	}
}