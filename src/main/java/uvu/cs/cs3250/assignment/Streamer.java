package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Streamer {

	public int getMax(List<Integer> input) 
	{
		int result = input.stream()
				.max((x, y) -> x - y)
				.get();
		
		return result;
	}

	public int getMin(List<Integer> input) 
	{
		int result = input.stream()
				.min((x, y) -> x - y)
				.get();
		
		return result;
	}

	public int count(List<Integer> input, Predicate<Integer> obj)
	{
		long result = input.stream()
				.filter(obj)
				.count();
		return (int)result;
	}

}
