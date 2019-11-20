package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;

public class Streamer 
{
	// Gets the max of a passed in list
	public int getMax(List<Integer> data)
	{
		return data.stream()
				.max(Integer::compare)
				.get();
	}

	// Gets the min of a passed in list
	public int getMin(List<Integer> data)
	{
		return data.stream()
				.min(Integer::compare)
				.get();
	}

	// Counts the list filtered by the passed in lambda
	public int count(List<Integer> data, Predicate<Integer> filter)
	{
		return (int)data.stream() // Have to cast as an int because count returns a long
				.filter(filter) // Filter using the passed in predicate
				.count();
	}
}
