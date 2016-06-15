package com.interview.parser;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BalancedParanthesisAndBracketsTest {
	private BalancedParanthesisAndBrackets validator;
	@Before
	public void setUp(){
		validator = new BalancedParanthesisAndBrackets();
	}
	
	@Test
	public void testNullInput(){
		assertEquals(false, validator.isValid(null));
	}
	
	@Test
	public void testEmptyInput(){
		assertEquals(true, validator.isValid(""));
	}
	
	@Test
	public void testValidOnePair(){
		assertEquals(true, validator.isValid("(a+b)"));
	}
	@Test
	public void testValidMultiplePairs(){
		assertEquals(true, validator.isValid("(a+b)*[c/d]-{f%g}"));
	}
	@Test
	public void testValidNestedPairs(){
		assertEquals(true, validator.isValid("(a+[b*c])-{(d/[f+h])%g}"));
	}
	@Test
	public void testInValidOnePair(){
		assertEquals(false, validator.isValid(")a+b("));
	}
	@Test
	public void testInValidMultiplePairs(){
		assertEquals(false, validator.isValid(")((a+b)*(c/d)-(f%g)"));
	}
	@Test
	public void testInValidNestedPairs(){
		assertEquals(false, validator.isValid("(a+()b*c))-(())d/f)%g)"));
	}
	@Test
	public void testInValidInterleave(){
		assertEquals(false, validator.isValid("(a+[b*c)]"));
	}
}
