package bpv.corejava.parser;

import java.util.Stack;

public class BalancedParanthesisAndBrackets {
	
	/**
	 * Valid - {(a+[b-c])}
	 * Invalid - ([)] - No interleaving, )( - Not balanced
	 * 
	 * If start char ( or [ or { push into stack
	 * If end char ) or ] or } verify that top of stack is matching start char ( or [ or {
	 *     Pop the top char
	 * Else
	 * 	  Not balanced return false
	 * 
	 * After scanning all chars if stack is not Empty return false
	 * 
	 * @param input
	 * @return
	 */
	public boolean isValid(String input) {
		if(input == null) return false;
		if(input.isEmpty()) return true;
		Stack<Character> charStack = new Stack<Character>();
		for(char ch : input.toCharArray()){
			switch(ch){
			case '(':
			case '[':
			case '{':
				charStack.push(ch);
				break;
			case ')':
			case ']':
			case '}':
				if(charStack.isEmpty()) return false;
				char stackTop = (char) charStack.peek();
				switch(stackTop){
				case '(':
					if(ch != ')') return false;
					break;
				case '[':
					if(ch != ']') return false;
					break;
				case '{':
					if(ch != '}') return false;
					break;
				default:
					break;
				}
				charStack.pop();
			}
		}
		return charStack.isEmpty();
	}
}
