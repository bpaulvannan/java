package bpv.corejava.parser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BalancedParanthesisTest {
	private BalancedParanthesis validator;
	@Before
	public void setUp(){
		this.validator = new BalancedParanthesis();
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
		assertEquals(true, validator.isValid("(a+b)*(c/d)-(f%g)"));
	}
	@Test
	public void testValidNestedPairs(){
		assertEquals(true, validator.isValid("(a+(b*c))-((d/f)%g)"));
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
}
