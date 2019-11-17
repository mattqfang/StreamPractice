package uvu.cs.cs3250.assignment;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Streamer {
	
	public Integer getMax(List<Integer> numberList) {
		return numberList.stream()
				.sorted(Comparator.reverseOrder())
				.findFirst()
				.orElse(null);
	}
	
	public Integer getMin(List<Integer> numberList) {
		return numberList.stream()
				.sorted()
				.findFirst()
				.orElse(null);
	}
	
	public Integer count(List<Integer> numberList, Predicate<Integer> predicate) {
		return (int) numberList.stream()
				.filter(predicate)
				.count();
	}

}
