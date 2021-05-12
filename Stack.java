package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This class represents the stack created for the program.
 * It is used to create stack of items to check for the balanced parentheses
 * Implements the interface IStack and utilizes all its methods to perform specified functions
 * Initializes the variables LinkedList list to create a new linked list and Node top
 * @param <T> represents the generic nature of the class
 */
public class Stack<T> implements IStack<T> {

	private LinkedList<T> list = new LinkedList<T>();
	private Node<T> top;

	/**
	 * Sets the pointer to the top node of the stack
	 * @param top INode represents the top node of stack
	 */
	@Override
	public void setTop(INode<T> top) {

		this.top = (Node<T>) top;
	}

	/**
	 * @return Returns the pointer to the head(top) node of the stack
	 */
	@Override
	public INode<T> getTop() {

		return top;
	}

	/**
	 * Adds new item x to the top of the stack using the linked list by setting specified capacity
	 * @param x T(generic) represents an item of the stack
	 * @return Returns the truth of whether an item is added in the stack or not
	 */
	@Override
	public boolean push(T x) {

		list.setCapacity(100);

		/*
		 * An item is added on the top of the stack using linked list.
		 * Newly added item is set as top node of the stack
		 */
		for (int i = 0; i <= list.getSize(); i++) {

			//Sets the new position as the top using i = size
			if(i == list.getSize()) {
				list.add(i, x);
				this.setTop(list.getTail());
				break;
			}
		}

		return true;
	}

	/**
	 * Removes an item from the top of the stack using linked list
	 * @return Returns the item removed from the top of the stack
	 */
	@Override
	public T pop() {

		//Removes an item from top of stack and the preceding item from removed one is set as top node
		T data = list.getTail().getData();
		list.remove(list.getSize()-1);
		this.setTop(list.getTail());

		return data;
	}

	/**
	 * Sets the pointer to the linked list used as the stack
	 * @param list IList represents the linked list used for stack
	 */
	@Override
	public void setList(IList<T> list) {

		this.list = (LinkedList<T>) list;
	}

	/**
	 * @return Returns the pointer to the list used as the stack
	 */
	@Override
	public IList<T> getList() {

		return list;
	}

	/**
	 * Clears all the items from the stack
	 */
	@Override
	public void clear() {

		//Clears all the item from the list starting from the top item of the list until list is empty
		int i = list.getSize()-1;
		while(i > -1) {
			list.remove(i);
			i--;
		}
	}

	/**
	 * Looks at the item at the top of the stack without removal
	 * @return Returns the item at the top of the stack without removal
	 */
	@Override
	public T peek() {

		//If the stack is empty, print the stack is empty
		if(list.isEmpty()) {
			System.out.println("Stack Empty");
			return null;

			//Returns the top item of the stack
		} else {
			return list.getTail().getData();
		}
	}

}
