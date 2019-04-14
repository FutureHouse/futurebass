package validparentheses;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		//	2 ms	35.7 MB
		String[] s = {"()[]{}", "()", "(]", "([)]", "{[]}"};
		ValidParentheses vp = new ValidParentheses();
		for(int i = 0; i < s.length; i++) {
			System.out.println(vp.isValid(s[i]));
		}
	}
	public boolean isValid(String s) {

		 //Use a map can easily contain the brackets to form correspondence.
		HashMap<Character, Character> mappings = new HashMap<Character, Character>();
		mappings.put('}', '{');
		mappings.put(']', '[');
		mappings.put(')', '(');
		//Stack can be used to handle the context between brackets.
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			//Char c is the pointer which record the current position of the scan string.
			char c = s.charAt(i);
			if( mappings.containsKey(c) ) {
				//"s" just a mask when right brackets at the beginning, then if != return false.
				char topElement = stack.empty() ? 's' : stack.pop();
				//Just pop it out.
				if( topElement != mappings.get(c) ) {
					
					return false;
					
				}		
			}else {
				// If it was an left bracket, push to the stack.
				stack.push(c);
				
			}
		}
		return stack.isEmpty();
    }
}
