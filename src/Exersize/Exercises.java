package Exersize;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises {

	public static List<String> toUpperCase(List<String> list) {
		Stream<String> x = list.stream().map(i -> i.toUpperCase());
		return x.collect(Collectors.toList());
	}

	public static Object countSmallWords(List<String> list) {
		Stream<String> stram = list.stream().filter(i -> i.length() < 5);
		return (int) stram.count();
	}

	public static Object filterSmallWords(List<String> list) {
		Stream<String> stram = list.stream().filter(i -> i.length() > 4);
		return stram.collect(Collectors.toList());
	}

}
