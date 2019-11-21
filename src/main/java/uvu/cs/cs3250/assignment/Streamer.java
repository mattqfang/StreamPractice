package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Streamer {

	public int getMax(List<Integer> data) {
		int max = Collections.max(data);
		return max;
	}

	public int getMin(List<Integer> data) {
		int min = Collections.min(data);
		return min;
	}

	public int count(List<Integer> data, logic var) {
		int result = 0;
		for(Integer item: data) {
			if(var.calculate(item)) {
				result++;
			}
		}
		return result;
	}
	//interface
	interface logic{
		boolean calculate(Integer item);
	}

}
