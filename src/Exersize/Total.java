package Exersize;

import java.util.Arrays;
import java.util.stream.Stream;

public class Total {

	public int all(Integer[] list) {	
		return Arrays.asList(list).stream().reduce(0, (a,b) -> a+b);
	}
	public int countEven(Integer[] list){
		return Arrays.asList(list).stream().reduce(0, (a,b) ->a= (b+1)%2);
	}

}
