package com.greatlearning.iitr.lab;

import java.util.Stack;

public class BalancedParenthesis {
	
	    public static void main(String[] args) {
		
		String input = "({})[][{}][]{}";
		
		boolean result = isParenthesisBalanced(input);
		
		if(result) {
			
			System.out.println("The entered string has balanced brackets");
		} else {
			
			System.out.println("The entered string do not contain balanced brackets");
		}
				
	}

	   private static boolean isParenthesisBalanced(String input) {
		
	   Stack<Character> stack = new Stack<Character>();
		
	   char[]  inputArray = input.toCharArray();
		
	   for(int i=0 ; i<inputArray.length;i++) {
			
			if(inputArray[i] == '('  ||  inputArray[i] == '{'  || inputArray[i] == '[') {
				
				stack.push(inputArray[i]);
				continue;
				}
			
			if(stack.isEmpty()) {
				
				return false;
			}
			
			char c;
			switch(inputArray[i]) {
			
			case ')':
				c=stack.pop();
				if(c =='}'  || c ==']') {
					return false;
			} 
				
			break;
			case ']':
				c=stack.pop();
				if(c =='}'  || c ==')') {
					return false;
			} 
				
			break;
			case '}':
			
				c=stack.pop();
				if(c ==')'  || c ==']') {
					return false;
			} 
				
			break;
			
				}
						
		}
		
		if(stack.isEmpty()) {
			
			return true;
	
		}else {
			
		return false;	
		
		}
		
	}

}
