package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;

public class Streamer {
    public int getMax(List<Integer> data) {
        return data.stream()
        .max((i,j) -> i.compareTo(j))
        .get();
    }
    public int getMin(List<Integer> data){
        return data.stream()
        .min((i,j) -> i.compareTo(j))
        .get();
    }
    public int count(List<Integer> data, Predicate<Integer> cond){
        return (int) data.stream()
        .filter(cond)
        .count();
        
    }
}