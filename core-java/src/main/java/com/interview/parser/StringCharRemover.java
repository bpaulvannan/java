package com.interview.parser;

/**
 * Remove a character from string using iterative and recursive approach
 */
public class StringCharRemover {
	
	public String usingIteration(String input, char charToRemove){
		if(input == null || input.isEmpty()){
			return input;
		}
		StringBuffer result = new StringBuffer();
		for(char ch : input.toCharArray()){
			if(ch != charToRemove){
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	public String usingRecursion(String input, char charToRemove){
		if(input == null || input.isEmpty()){
			return input;
		}else{
			char currentChar = input.charAt(0); 
			if( currentChar != charToRemove){
				return currentChar + usingRecursion(input.substring(1), charToRemove );
			}else{
				return "" + usingRecursion(input.substring(1), charToRemove );
			}
		}
	}
}
