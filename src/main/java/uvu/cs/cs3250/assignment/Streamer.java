// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package uvu.cs.cs3250.assignment;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

// Using "Stream" to implement the functionalities in "Streamer" class so as to pass the unit tests.

public class Streamer {

    public int getMax(List<Integer> list) {
        return list.stream().parallel()
            .max(Comparator.naturalOrder()) // max after comparing everything in order
            .get();
    }

    public int getMin(List<Integer> list) {
        return list.stream().parallel()
            .min(Comparator.naturalOrder()) // min after comparing everything in order
            .get();
    }

    public int count(List<Integer> list, Predicate<? super Integer> predicate) {
        return (int) list.stream().parallel() // count returns long. cast to int
            .filter(predicate) // filter list based on results of predicate
            .count(); 
        }

}
