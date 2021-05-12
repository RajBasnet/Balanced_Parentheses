package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This class checks for the balanced parentheses using the stack to store each parentheses as its items.
 * Implements IParenthesesChecker to use its methods
 * Creates a new object stack using Stack class to store the items
 */
public class StackParenthesesChecker implements IParenthesesChecker {

	private IStack<String> stack = new Stack<String>();

	/**
	 * This method checks if the parentheses is balanced or not
	 * @param s String represents the parentheses to be checked
	 * @return Returns the truth of whether the string s has balanced parentheses
	 */
	@Override
	public boolean isBalanced(String s) {

		for(int i = 0; i < s.length(); i++) {

			/*
			 * If character in string matches the parentheses '(', then uses stack to push it into the top of the stack
			 */
			if(s.charAt(i) == '(') {
				stack.push(Character.toString(s.charAt(i)));
				continue;
			}

			//Returns false for balanced parentheses if the stack is empty
			if(stack.getList().isEmpty()) {
				return false;

				/*
				 * If character in string matches ')', then uses stack to pop the item from top of stack
				 */
			} else if(s.charAt(i) == ')') {
				String string = stack.getTop().getData();
				stack.pop();

				//If popped item is parentheses ')', returns false for balanced parentheses
				if(string == ")") {
					return false;
				}
			} 
		}
		/* 
		 * Returns true for the balanced parentheses if the stack is empty else returns false
		 * Uses push and pop for the parentheses for balance. If any parentheses is remaining, then it is unbalanced
		 * After all the above procedures of push and pop, if no parentheses is remaining, then it is balanced
		 */
		return stack.getList().isEmpty();
	}

}
