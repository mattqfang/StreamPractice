package uvu.cs.cs3250.assignment;

//import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Streamer {
	
	public Streamer() {
		
	}
	
	public int getMax(List<Integer> intList) {
		return intList.stream()
				.max(Integer::compare)
				.get();
	}
	
	public int getMin(List<Integer> intList) {
		return intList.stream()
				.min(Integer::compare)
				.get();
	}
	
	public int count(List<Integer> intList, Predicate<Integer> pred) {
		return (int) intList.stream()
				.filter(pred)
				.count();
	}
}
