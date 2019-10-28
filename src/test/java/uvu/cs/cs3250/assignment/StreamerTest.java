package uvu.cs.cs3250.assignment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StreamerTest {
	private Streamer streamer;

	@Before
	public void setUp() {
		streamer = new Streamer();
	}

	@Test
	public void testGetMax() {
		List<Integer> data = Arrays.asList(1, 3, 8, 4, 6);
		int max = streamer.getMax(data);
		assertEquals(8, max);
	}

	@Test
	public void testGetMin() {
		List<Integer> data = Arrays.asList(1, 3, 8, 4, 6);
		int min = streamer.getMin(data);
		assertEquals(1, min);
	}

	@Test
	public void testCountWithCondition() {
		List<Integer> data = Arrays.asList(1, 3, 8, 4, 6);
		int count = streamer.count(data, x -> x % 3 == 0);
		assertEquals(2, count);
	}
}
