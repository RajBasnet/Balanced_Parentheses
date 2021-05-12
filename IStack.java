package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This interface is implemented by Stack class to use all the methods defined in it.
 * @param <T> It represents the generic nature of the interface.
 */
public interface IStack<T> {

	/**
	 * Sets the pointer to the top node of the stack
	 * @param top INode represents the top node of stack
	 */
	void setTop(INode<T> top);

	/**
	 * @return Returns the pointer to the head(top) node of the stack
	 */
	INode<T> getTop();

	/**
	 * Adds new item x to the top of the stack
	 * @param x T(generic) represents an item of the stack
	 * @return Returns the truth of whether an item is added in the stack or not
	 */
	boolean push(T x);

	/**
	 * Remove an item from the top of the stack
	 * @return Returns the item removed from the top of the stack
	 */
	T pop();

	/**
	 * Sets the pointer to the list used as the stack
	 * @param list IList represents the linked list used for stack
	 */
	void setList(IList<T> list);

	/**
	 * @return Returns the pointer to the list used as the stack
	 */
	IList<T> getList();

	/**
	 * Clears all the items from the stack
	 */
	void clear();

	/**
	 * Looks at the item at the top of the stack without removal
	 * @return Returns the item at the top of the stack without removal
	 */
	T peek();

}
