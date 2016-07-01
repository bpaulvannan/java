package com.interview.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCharRemoverTest {
	private StringCharRemover charRemover;
	
	@Before
	public void setUp(){
		charRemover = new StringCharRemover();
	}
	
	@Test
	public void testUsingIterationNoCharToReplace(){
		String input = "paul";
		char charToRemove = '.';
		Assert.assertEquals(input, charRemover.usingIteration(input, charToRemove));
	}
	
	@Test
	public void testUsingIterationOneCharToReplace(){
		String input = ".paul";
		char charToRemove = '.';
		Assert.assertEquals("paul", charRemover.usingIteration(input, charToRemove));
	}
	
	@Test
	public void testUsingIterationManyCharsToReplace(){
		String input = ".p.a.u.l....";
		char charToRemove = '.';
		Assert.assertEquals("paul", charRemover.usingIteration(input, charToRemove));
	}
	
	@Test
	public void testUsingRecursionNoCharToReplace(){
		String input = "paul";
		char charToRemove = '.';
		Assert.assertEquals(input, charRemover.usingRecursion(input, charToRemove));
	}
	
	@Test
	public void testUsingRecursionOneCharToReplace(){
		String input = ".paul";
		char charToRemove = '.';
		Assert.assertEquals("paul", charRemover.usingRecursion(input, charToRemove));
	}
	
	@Test
	public void testUsingRecursionManyCharsToReplace(){
		String input = ".p.a.u.l....";
		char charToRemove = '.';
		Assert.assertEquals("paul", charRemover.usingRecursion(input, charToRemove));
	}
}
