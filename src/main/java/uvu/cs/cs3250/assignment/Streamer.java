package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;

public class Streamer {
    public int getMax(List<Integer> numbers) {
        int maxNum = numbers.stream().reduce(0, (a,b) -> a > b ? a : b);
        return maxNum;
    }

    public int getMin(List<Integer> numbers) {
        int minNum = numbers.stream().reduce(numbers.get(0), (a,b) -> a < b ? a : b);
        return minNum;
    }

    public int count(List<Integer> numbers, Predicate<Integer> condition) {
        int count = (int) numbers.stream().filter(condition).count();
        return count;
    }
}
