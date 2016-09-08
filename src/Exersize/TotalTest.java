package Exersize;

import static org.junit.Assert.*;

import org.junit.Test;

public class TotalTest {
	Total total = new Total();
	Integer[] list = {1,1,2,4,8,16,32};
	
@Test
public void testTotal(){
	assertTrue(total.all(list) == 64);
}
}
