package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This interface is implemented by StackParenthesesChecker and QueueParentheses class to use its methods.
 */
public interface IParenthesesChecker {

	/**
	 * Checks whether the parentheses is balanced or not
	 * @param s String represents the parentheses to be checked
	 * @return Returns truth of whether the string s has balanced parentheses
	 */
	boolean isBalanced(String s);


}
