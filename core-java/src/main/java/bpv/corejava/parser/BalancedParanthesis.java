package bpv.corejava.parser;

public class BalancedParanthesis {
	/**
	 * Increment start count for each starting paranthesis
	 * Decrement end count for each ending paranthesis, if start count >= end count
	 * 
	 *    - End Paranthesis can come only after Start paranthesis
	 *    - Otherwise the paranthesis are not balanced
	 *    
	 * After parsing if both start and end count are zero, its balanced
	 * @param input
	 * @return
	 */
	public boolean isValid(String input){
		if(input == null) return false;
		if(input.isEmpty()) return true;
		
		int startParanthesisCount = 0;
		int endParanthesisCount = 0;
		for(char ch : input.toCharArray()){
			switch(ch){
			case '(':
				startParanthesisCount = startParanthesisCount + 1;
				break;
			case ')':
				endParanthesisCount = endParanthesisCount + 1;
				if(startParanthesisCount >= endParanthesisCount){
					startParanthesisCount = startParanthesisCount - 1;
					endParanthesisCount = endParanthesisCount - 1;
				}else{
					return false;
				}
				break;
			default:
				continue;
			}
		}
		
		return startParanthesisCount == 0 && endParanthesisCount == 0;
	}
}
