// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package uvu.cs.cs3250.assignment;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

// Using "Stream" to implement the functionalities in "Streamer" class so as to pass the unit tests.

public class Streamer {

    public Streamer() {
    }

    public int getMax(List<Integer> list) {
        return list.stream().parallel()
            .sorted(Comparator.reverseOrder())
            .findFirst()
            .get();
    }

    public int getMin(List<Integer> list) {
        return list.stream().parallel()
            .sorted(Comparator.naturalOrder())
            .findFirst()
            .get();
    }

    public int count(List<Integer> list, Function<Integer, Boolean> x) {
        return list.stream().parallel()
            .reduce(Function.identity().equals(true));
        }

}
