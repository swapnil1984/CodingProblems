package com.swapnil.balancedparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesesApp {

	static boolean areParenthesesBalanced(String exp) {
		
		// Using ArrayDeque is faster than stack
		Deque<Character> stack = new ArrayDeque<Character>();
		
		//Traversing the expression
		for(int i = 0;i < exp.length();i++) {
			char x = exp.charAt(i);
			
			if(x == '(' || x == '{' || x == '[' || x == '<') {
				
				// Push the element in the stack
				stack.push(x);
				continue;
			}
			
			// if current character is not opening parentheses that means it should be closing.
			// so stack cannot be empty
			
			if (stack.isEmpty())
				return false;
			
			char check;
			
			check = stack.pop();
			
			switch(x) {
			case ')':
				
				if (check == '{' || check == '[' || check == '<')
					return false;
				break;
				
			case ']':
				
				if (check == '(' || check == '{' || check == '<')
					return false;
				break;
				
			case '}':
				
				if (check == '(' || check == '[' || check == '<')
					return false;
				break;
				
			case '>':
				
				if (check == '(' || check == '{' || check == '[')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
	
	public static void main(String[] args) {
		
		String exp = "([{}])";
		
		if (areParenthesesBalanced(exp))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}
