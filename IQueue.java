package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This interface is implemented by Queue class to use all the methods defined in it.
 * @param <T>It represents the generic nature of the interface.
 */
public interface IQueue<T> {

	/**
	 * Sets the pointer to the front node of the queue
	 * @param front INode represents the front node of the queue
	 */
	void setFront(INode<T> front);

	/**
	 * @return Returns the pointer to the front node of the queue
	 */
	INode<T> getFront();

	/**
	 * Sets the pointer to the rear node of the queue
	 * @param rear INode represents the rear node of the queue
	 */
	void setRear(INode<T> rear);

	/**
	 * @return Returns the pointer to the rear node of the queue
	 */
	INode<T> getRear();

	/**
	 * Adds new item x to the queue
	 * @param x T(generic) represents the new item to be added to the queue
	 * @return Returns whether the new item is added in the queue or not
	 */
	boolean enqueue(T x);

	/**
	 * Removes an item from the queue
	 * @return Returns an item to be removed from the queue
	 */
	T dequeue();

	/**
	 * Sets the pointer to the list used as the queue
	 * @param list IList represents the linked list used for queue
	 */
	void setList(IList<T> list);

	/**
	 * @return Returns the pointer to the list used as the queue
	 */
	IList<T> getList();

	/**
	 * Clears all items from the queue
	 */
	void clear();

	/**
	 * Looks at the item at the rear of the queue without removal
	 * @return Returns the item at the rear of the queue without removal
	 */
	T poll();

}
