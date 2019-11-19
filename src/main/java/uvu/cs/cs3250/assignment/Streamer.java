package uvu.cs.cs3250.assignment;

import java.util.List;
import java.util.function.Predicate;

class Streamer {

    int getMax(List<Integer> data) {
        return data.stream().max(Integer::compare).get();
    }

    int getMin(List<Integer> data) {
        return data.stream().min(Integer::compare).get();
    }

    int count(List<Integer> data, Predicate<Integer> lambda) {
        return (int) data.stream().filter(lambda).count();
    }
}
