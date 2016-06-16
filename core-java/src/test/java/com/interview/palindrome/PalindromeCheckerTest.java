package com.interview.palindrome;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PalindromeCheckerTest {
	private PalindromeChecker checker;
	@Before
	public void setUp(){
		checker = new PalindromeChecker();
	}
	@Test
	public void testNotPalindromeNegative(){
		assertEquals(false, checker.isPalindromeUsingString(-10));
	}
	@Test
	public void testNotPalindromePositive(){
		assertEquals(false, checker.isPalindromeUsingString(10));
	}
	@Test
	public void testPalindromePositive(){
		assertEquals(true, checker.isPalindromeUsingString(111));
	}
	
	@Test
	public void testNotPalindromeNegativeUsingInt(){
		assertEquals(false, checker.isPalindromeUsingInt(-10));
	}
	@Test
	public void testNotPalindromePositiveUsingInt(){
		assertEquals(false, checker.isPalindromeUsingInt(10));
	}
	@Test
	public void testPalindromePositiveUsingInt(){
		assertEquals(true, checker.isPalindromeUsingInt(111));
	}
	
	@Test
	public void testPalindromeList(){
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(11);
		expected.add(22);
		expected.add(33);
		assertEquals(expected, checker.getPalindromeList(13));
	}
	
}
