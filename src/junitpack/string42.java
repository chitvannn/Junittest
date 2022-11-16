package junitpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class string42 {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
package JUnitTestPackage;
//devBhardwaj_E21CSEU0275

import static org.junit.Assert.*;

import org.junit.Test;

public class string42 {

	@Test
	public void test() {
			Junitadd obj = new Junitadd();
	        String first = "haww";
	        String second = "yoyo";
	        assertEquals("hawwyoyo",obj.add_str(first,second));
	        
	}
	@Test
	public void test1() {
			Junitadd obj = new Junitadd();
	        String first = "yoyo";
	        String second = "haww";
	       
	        assertEquals("yummfjs",obj.add_str(first,second));
	}

}
