package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streamer {

    public int getMax(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
    }

    public int getMin(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
    }

    public int count(List<Integer> list, Predicate<Integer> condition ) {
        return list.stream()
                .filter(condition)
                .mapToInt(Integer -> 1)
                .sum();

    }

}
