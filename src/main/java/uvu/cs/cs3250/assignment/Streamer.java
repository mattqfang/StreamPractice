package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streamer {

	
	public int getMax(List<Integer> intData) {
		int maxInt = 0;
		
		maxInt = intData.stream()
						.max(Integer::compare)
						.get();
		return maxInt;
	}
	
	public int getMin(List<Integer> intData) {
		int minInt = 0;
		
		minInt = intData.stream()
						.min(Integer::compare)
						.get();
		return minInt;
	}
	
	public int count(List<Integer> intData, Predicate<Integer> countCondition) {
		int sumInt = 0;
		
		sumInt = (int) intData.stream()
						.filter(countCondition)
						.count();
		return sumInt;
	}
}
