package com.interview.randomgen;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class RandomNumberListGeneratorTest {

	@Test
	public void testRandomOrder(){
		int countOfNumbers = 5;
		RandomNumberListGenerator generator = new RandomNumberListGenerator();
		List<Integer> randomNumberList = generator.generateRandomNumberSet(countOfNumbers);
		long sum = 0l;
		for(int i=0; i<countOfNumbers; i++){
			int curNum = randomNumberList.get(i).intValue();
			assertEquals(true, randomNumberList.contains(curNum));
			sum = sum + curNum;
		}
		long expectedSum = (countOfNumbers - 1) * countOfNumbers / 2;
		assertEquals(expectedSum, sum);
	} 
}
