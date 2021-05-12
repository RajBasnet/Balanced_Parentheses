package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This interface is implemented by LinkedList class to use all the methods defined in it.
 * @param <T> It represents the generic nature of the interface.
 */
public interface IList<T> {

	/**
	 * Sets the pointer to the head node of the list
	 * @param head head represents the head node of the list
	 */
	// 
	void setHead(INode<T> head);

	/**
	 * @return Returns the pointer to the head node of the list
	 */
	INode<T> getHead();

	/**
	 * Sets the pointer to the tail node of the list
	 * @param tail tail represents the tail node of the list
	 */
	void setTail(INode<T> tail);

	/**
	 * @return Returns the pointer to the tail node of the list
	 */
	INode<T> getTail();

	/**
	 * Sets the number of items in the list
	 * @param size Integer represents the size of the list
	 */
	// 
	void setSize(int size);

	/**
	 * @return Returns the number of items in the list
	 */
	int getSize();

	/**
	 * Sets the maximum number of items the list can hold
	 * @param capacity Integer represents the capacity of the list
	 */
	void setCapacity(int capacity);

	/**
	 * 
	 * @return Returns the maximum number of items the list can hold
	 */
	int getCapacity();

	/**
	 * @return Returns the truth of whether the list is full
	 */
	boolean isFull();

	/**
	 * @return Returns the truth of whether the list is empty
	 */
	// 
	boolean isEmpty();

	/**
	 * Removes an item at index i from the list
	 * @param i Integer represents the index (position) of an item in the list
	 * @return Returns the item removed from the list.
	 */
	T remove(int i);

	/**
	 * Adds an item x to the list at index i
	 * @param i Integer represents the index (position) of an item in the list
	 * @param x T (generic) represents the item of the list
	 * @return Returns truth of whether an item is added in the list or not
	 */
	// 
	boolean add(int i, T x);

}
