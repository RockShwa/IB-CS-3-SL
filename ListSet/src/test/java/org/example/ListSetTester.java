package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class ListSetTester
{
	ListSet<String> set;

	@BeforeEach
	public void setUp() {
		set = new ListSet<String>();
		set.add(0, "HELLO");
		set.add(1, "BYEBYE");
		set.add(2, "WHOA");
	}

	// likely methods
	// get
	// indexOf**
	// set**
	// add**
	// remove**
	// toString**
	// allItemsMatch**
	// containsAll
	// addAll**
	// retainAll**
	// subList**
	
	@Test
	// get Node data at index i
	public void testGet() {
		// should return HELLO
		Object data = set.get(0);
		assertEquals(data, "HELLO");
	}

	@Test
	// indexOf returns index value of Object in question
	public void testIndexOf() {
		int index = set.indexOf("BYEBYE");
		assertEquals(1, index);
	}

	@Test
	public void testSet() {
		String expectedReplacedData = "WHOA";
		String replacedData = set.set(2, "WHOAAAAA");
		assertEquals(expectedReplacedData, replacedData);
	}

	@Test
	public void testToString() {
		String expected = "[HELLO, BYEBYE, WHOA]";
		String actual = set.toString();
		System.out.println(actual);
		assertEquals(expected, actual);
	}
}		
