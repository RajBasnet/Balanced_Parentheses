package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This class represents the queue (items are added or removed using FIFO basis) created for the program.
 * It is used to create queue of items to check for the balanced parentheses
 * Implements the interface IQueue and utilizes all its methods to perform specified functions
 * Initializes the variables LinkedList list to create a new linked list and Node front and rear
 * @param <T> represents the generic nature of the class
 */
public class Queue<T> implements IQueue<T> {

	private Node<T> front, rear;
	private LinkedList<T> list = new LinkedList<T>();

	/**
	 * Sets the pointer to the front node of the queue
	 * @param front INode represents the front node of the queue
	 */
	@Override
	public void setFront(INode<T> front) {

		this.front = (Node<T>) front;
	}

	/**
	 * @return Returns the pointer to the front node of the queue
	 */
	@Override
	public INode<T> getFront() {

		return front;
	}

	/**
	 * Sets the pointer to the rear node of the queue
	 * @param rear INode represents the rear node of the queue
	 */
	@Override
	public void setRear(INode<T> rear) {

		this.rear = (Node<T>) rear;
	}

	/**
	 * @return Returns the pointer to the rear node of the queue
	 */
	@Override
	public INode<T> getRear() {

		return rear;
	}

	/**
	 * Adds new item x to the queue using linked list by setting specified capacity
	 * @param x T(generic) represents the new item to be added to the queue
	 * @return Returns whether the new item is added to the queue or not
	 */
	@Override
	public boolean enqueue(T x) {

		list.setCapacity(100);

		/*
		 * An item is added to the queue using linked list.
		 * Newly added item is set as front node of the queue
		 */
		for (int i = 0; i <= list.getSize(); i++) {

			//Sets the front and rear node of the queue
			if(i == list.getSize()) {
				list.add(i, x);
				this.setFront(list.getHead());
				this.setRear(list.getTail());
				break;
			}
		}
		return true;
	}

	/**
	 * Removes an item from the queue
	 * @return Returns an item to be removed from the queue
	 */
	@Override
	public T dequeue() {

		//Removes an item from the front of the queue and new front node is set 
		T data = list.getHead().getData();
		list.remove(0);
		this.setFront(list.getHead());

		return data;
	}

	/**
	 * Sets the pointer to the list used as the queue
	 * @param list IList represents the linked list used for queue
	 */
	@Override
	public void setList(IList<T> list) {

		this.list = (LinkedList<T>) list;

	}

	/**
	 * @return Returns the pointer to the list used as the queue
	 */
	@Override
	public IList<T> getList() {

		return list;
	}

	/**
	 * Clears all items from the queue
	 */
	@Override
	public void clear() {

		//Clears all the items one by one front he front of the queue
		int size = list.getSize();
		for(int i = 0; i < size; i++) {
			list.remove(0);
		}

	}

	/**
	 * Looks at the item at the rear of the queue without removal
	 * @return Returns the item at the rear of the queue without removal
	 */
	@Override
	public T poll() {

		//If the queue is empty, prints Queue is empty
		if(list.isEmpty()) {
			System.out.println("Queue Empty");
			return null;

			//Returns the rear item of the queue
		} else {

			return list.getTail().getData();
		}
	}

}
