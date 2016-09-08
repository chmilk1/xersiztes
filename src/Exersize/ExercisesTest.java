package Exersize;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ExercisesTest {

	List<String> list = Arrays.asList(new String[] { "randomstring", "art", "science", "COMPUTER", "history",
			"INTERNET", "Http", "TCP", "URL", "uri", "MVC", "Controller", "VIEW", "Java", "PYTHON" });

	@Test
	public void testCount() {
		assertEquals(Exercises.countSmallWords(list), 8);
	}

	@Test
	public void testFilter() {
		assertEquals(Exercises.filterSmallWords(list), Arrays.asList(
				new String[] { "RANDOMSTRING", "SCIENCE", "COMPUTER", "HISTORY", "INTERNET", "CONTROLLER", "PYTHON" }));
	}

	@Test
	public void testUpperCase() {
		assertEquals(
				Arrays.asList(new String[] { "RANDOMSTRING", "ART", "SCIENCE", "COMPUTER", "HISTORY", "INTERNET",
						"HTTP", "TCP", "URL", "URI", "MVC", "CONTROLLER", "VIEW", "JAVA", "PYTHON" }),
				Exercises.toUpperCase(list));

	}

}
