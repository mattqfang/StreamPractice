package uvu.cs.cs3250.assignment;

import java.util.List;

public class Streamer {
	//int getmax (array) 
	//int get min (array)
	//getcount (data, x -> x % 3 == 0)
	List<Integer> a;

	public int getMax(List<Integer> _a) {
		a = _a;
		return a.stream()
				.max(Integer::compareTo)
				.get();
	}
	
	public int getMin(List<Integer>_a) {
		a = _a;
		return a.stream()
				.min(Integer::compareTo)
				.get();
	}
	
	public int count(List<Integer>_a, Condition b) {
		a = _a;
		return (int)a.stream()
				.filter(a-> b.isValid(a))
				.count();
				
		
	}
}
