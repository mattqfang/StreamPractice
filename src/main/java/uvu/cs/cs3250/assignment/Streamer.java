package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;

public class Streamer {

	public int getMax(List<Integer> data) {
		// TODO Auto-generated method stub
		Integer max = data
				.stream()
				.max(Integer::compare).get();
		
		return max;
	}

	public int getMin(List<Integer> data) {
		// TODO Auto-generated method stub
		Integer min = data
				.stream()
				.min(Integer::compare).get();
		return min;
	}

	public long count(List<Integer> data, Predicate<Integer> condition) {
		// TODO Auto-generated method stub
		return data
				.stream()                                                                         
				.filter(condition)
				.count();
	}

}
