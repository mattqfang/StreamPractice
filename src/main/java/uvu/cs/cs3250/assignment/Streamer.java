package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.stream.Collectors;

interface Mod3 {
	boolean test(int x);
}

public class Streamer {
	public int getMax(List<Integer> data) {
		return data
				.stream()
				.max(Integer::compare)
				.get();
	}
	
	public int getMin(List<Integer> data) {
		return data
				.stream()
				.min(Integer::compare)
				.get();
	}
	
	public int count(List<Integer> data, Mod3 canDivide) {
		List<Integer> Threes = data
				.stream()
				.filter(x -> canDivide.test(x))
				.collect(Collectors.toList());
		return Threes.size();
	}


}
