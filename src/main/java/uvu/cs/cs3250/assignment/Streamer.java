package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Streamer {
	public Integer getMax(List<Integer> data) {
		return data.stream().max(Integer::compare).get();
	}
	
	public Integer getMin(List<Integer> data) {
		return data.stream().min(Integer::compare).get();
	}
	
	public Integer count(List<Integer> data, Predicate<Integer> predicate) {
		return (int) data.stream().filter(predicate).count();
	}
}
