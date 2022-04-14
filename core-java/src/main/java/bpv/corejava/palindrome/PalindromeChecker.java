package bpv.corejava.palindrome;

import java.util.ArrayList;
import java.util.List;

public class PalindromeChecker {

	/**
	 * Return N number of palindromes
	 * @param numOfPalindromes
	 * @return
	 */
	public List<Integer> getPalindromeList(int numOfPalindromes){
		if(numOfPalindromes < 1){
			return new ArrayList<Integer>(0);
		}
		int lastNumber = 0;
		int count = 0;
		List<Integer> palindromeList = new ArrayList<Integer>(numOfPalindromes);
		while(count < numOfPalindromes){
			if(isPalindromeUsingString(lastNumber)){
				palindromeList.add(lastNumber);
				count = count + 1;
			}
			lastNumber = lastNumber + 1;
		}
		return palindromeList;
	}
	
	/**
	 * Validate if a number is palindrome or not
	 * 
	 * @param palindromeCandidate
	 * @return
	 */
	public boolean isPalindromeUsingString(int palindromeCandidate){ 
		if(palindromeCandidate < 0){
			return false;
		}else{
			String numStr = "" + palindromeCandidate;
			int len = numStr.length();
			for(int pos=0;pos<len/2;pos++){
				int lastPos = len - pos - 1;
				if(numStr.charAt(pos) != numStr.charAt(lastPos)){
					return false;
				}
			}
			return true;
		}
	}
	
	public boolean isPalindromeUsingInt(int palindromeCandidate){
		if(palindromeCandidate < 0){
			return false;
		}else if(palindromeCandidate < 10){
			return true;
		}else{
			int number = palindromeCandidate;
			int reverse = 0;
			while(number != 0){
				int remainder = number % 10;
				reverse = reverse * 10 + remainder;
				number = number / 10;
			}
			return palindromeCandidate == reverse;
		}
	}
}
