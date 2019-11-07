package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;

public class Streamer {

  public Integer getMax(List<Integer> numbers) {
    return numbers.stream().max(Integer::compare).get();
  }

  public Integer getMin(List<Integer> numbers) {
    return numbers.stream().min(Integer::compare).get();
  }

  public Integer count(List<Integer> numbers, Predicate<Integer> condition) {
    return (int) numbers.stream().filter(condition).count();
  }
  
}
