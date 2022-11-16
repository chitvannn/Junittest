package junitpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class int42 {

	@Test
	public void test() {
	        Junitadd obj = new Junitadd();
	        int a = 10;
	        int b = 10;
	        assertEquals(20,obj.add_num(a,b));

}
	@Test
	public void test2() {
	        Junitadd obj = new Junitadd();
	        int a = 10;
	        int b = 10;
	        assertEquals(10,obj.add_num(a, b));

}
}
