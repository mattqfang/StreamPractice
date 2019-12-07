package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;

public class Streamer {

	public int getMax(List<Integer> data) {
		return data.stream()
				.max(Integer::compare)
				.get();
	}

	public int getMin(List<Integer> data) {
		// TODO Auto-generated method stub
		return data.stream()
				.min(Integer::compare)
				.get();
	}

	public int count(List<Integer> data, Predicate<? super Integer> condition) {
		return (int) data.stream()
			.filter(condition) //add one to the iterator that is returned at the end that indicates how many items in the list (parameter 1) that meet the condition (parameter 2).
			.count();
	}

}
