package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This class checks for the balanced parentheses using the queue to store each parentheses as its items.
 * Implements IParenthesesChecker to use its methods
 * Creates a new object queue using Queue class to store the items
 */
public class QueueParenthesesChecker implements IParenthesesChecker {

	IQueue<String> queue = new Queue<String>();

	/**
	 * This method checks if the parentheses is balanced or not
	 * @param s String represents the parentheses to be checked
	 * @return Returns the truth of whether the string s has balanced parentheses
	 */
	@Override
	public boolean isBalanced(String s) {

		for(int i = s.length() - 1; i > -1; i--) {

			/*
			 * For the queue, the characters of the string are sent in a different way to queue
			 * The last character in the string is sent to the queue to add the item in queue
			 * Then, if that character matches the parentheses ')', then it adds item to the queue
			 */
			if(s.charAt(i) == ')') {
				queue.enqueue(Character.toString(s.charAt(i)));
				continue;
			}

			//Returns false for balanced parentheses if the queue is empty
			if(queue.getList().isEmpty()) {
				return false;

				//If character in string matches '(', then uses queue to remove the item from the front of the queue
			} else if(s.charAt(i) == '(') {
				String string = queue.getFront().getData();
				queue.dequeue();

				//If removed item is parentheses '(', returns false for balanced parentheses
				if(string == "(") {
					return false;
				}
			} 

		}

		/*
		 * Returns true for the balanced parentheses if the queue is empty else returns false
		 * Uses enqueue and dequeue for parentheses for balance. If any parentheses is remaining, then it is unbalanced
		 * After all the above procedures of enqueue and dequeue, if no parentheses is remaining, then it is balanced
		 */
		return queue.getList().isEmpty();
	}

}
