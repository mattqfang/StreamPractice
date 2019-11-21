package uvu.cs.cs3250.assignment;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Streamer {
    public static int getMax(List<Integer> numbers){
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get();
    }

    public static int getMin(List<Integer> numbers){
        return numbers.stream()
                .sorted(Comparator.naturalOrder())
                .findFirst()
                .get();
    }

    public static int count(List<Integer> numbers, Predicate<Integer> p){
        return (int) numbers.stream()
                .filter(p)
                .count();
    }
}
