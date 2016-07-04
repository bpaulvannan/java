package com.interview.randomgen;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomNumberListGenerator {
	/**
	 * Return N numbers in random order  from 0 to N-1
	 * @param count
	 * @return
	 */
	public List<Integer> generateRandomNumberSet(int countOfNumbers){
		
		if(countOfNumbers < 1){
			return new ArrayList<Integer>(0);
		}
		Set<Integer> randomNumberSet = new HashSet<Integer>();
		List<Integer> randomNumberList = new ArrayList<Integer>(countOfNumbers);
		Random randomGenerator = new SecureRandom();
		while(randomNumberSet.size() < countOfNumbers){
			Integer curNum = randomGenerator.nextInt(countOfNumbers);
			if(randomNumberSet.add(curNum)){
				randomNumberList.add(curNum);
			}
		}
		
		return randomNumberList;
	}
}
