package uvu.cs.cs3250.assignment;

import java.util.*;
import java.util.function.Predicate;


public class Streamer {
	
	Integer count(List<Integer> data, Predicate <? super Integer> predicate) {
		Integer count = (int) data.stream().filter(predicate).count();
		return count;
	}
	Integer getMin(List<Integer> data) {
		 Integer min = data.stream().min(Integer::compare).get();
		 return(min);
	}
	Integer getMax(List<Integer> data) {
		 Integer max = data.stream().max(Integer::compare).get();
		 return(max);
	}

}
