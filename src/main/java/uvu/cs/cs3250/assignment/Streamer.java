package uvu.cs.cs3250.assignment;

import java.util.List;

public class Streamer {

    public int getMax(List<Integer> data) {
        return data.stream().max(Integer::compare).get();
    }

    public int getMin(List<Integer> data) {
        return data.stream().min(Integer::compare).get();
    }

    public int count(List<Integer> data, int total) {
    }
}
