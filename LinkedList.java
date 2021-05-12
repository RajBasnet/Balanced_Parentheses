package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This class represents the linked list created for the program.
 * It is used to create stacks and queues to check the balanced parentheses
 * Implements the interface IList and utilizes all its methods to perform specified functions
 * Initializes the variables Node head, tail and integers size and capacity
 * @param <T> represents the generic nature of the class
 */

public class LinkedList<T> implements IList<T>{

	private Node<T> head, tail;
	private int size, capacity;

	/**
	 * Sets the pointer to the head node of the list
	 * @param head head represents the head node of the list
	 */
	@Override
	public void setHead(INode<T> head) {

		this.head = (Node<T>) head;
	}

	/**
	 * @return Returns the pointer to the head node of the list
	 */
	@Override
	public INode<T> getHead() {

		return head;
	}

	/**
	 * Sets the pointer to the tail node of the list
	 * @param tail tail represents the tail node of the list
	 */
	@Override
	public void setTail(INode<T> tail) {

		this.tail = (Node<T>) tail;
	}

	/**
	 * @return Returns the pointer to the tail node of the list
	 */
	@Override
	public INode<T> getTail() {

		return tail;
	}

	/**
	 * Sets the number of items in the list
	 * @param size Integer represents the size of the list
	 */
	@Override
	public void setSize(int size) {

		this.size = size;
	}

	/**
	 * @return Returns the number of items in the list
	 */
	@Override
	public int getSize() {

		return size;
	}

	/**
	 * Sets the maximum number of items the list can hold
	 * @param capacity Integer represents the capacity of the list
	 */
	@Override
	public void setCapacity(int capacity) {

		this.capacity = capacity;
	}

	/**
	 * @return Returns the maximum number of items the list can hold
	 */
	@Override
	public int getCapacity() {

		return capacity;
	}

	/**
	 * If the size of the list equals the capacity of list, then this method returns true
	 * @return Returns the truth of whether the list is full
	 */
	@Override
	public boolean isFull() {

		return this.getSize() == this.getCapacity();
	}

	/**
	 * If the size of the list equals 0, then this method returns true
	 * @return Returns the truth of whether the list is empty
	 */
	@Override
	public boolean isEmpty() {

		return this.getSize() == 0;
	}

	/**
	 * This method removes an item from the specific position of the list.
	 * @param i Integer represents the index (position) of an item in the list
	 * @return Returns the item removed from the list.
	 */
	@Override
	public T remove(int i) {


		//If the index is negative or greater than size, it is invalid range
		if(i < 0 || i > size) {
			System.out.println("Invalid range");
			return null;
		}

		//If there is only one item, then the item is removed and both head and tail are set to null
		if(size == 1) {

			Node<T> temp = (Node<T>) this.getHead();
			head = null;
			tail = null;
			size--;
			return temp.getData();

			//Removes an item from index 0 of the linked list decreasing size
		} else if(i == 0) {

			Node<T> headNode = (Node<T>) this.getHead();
			this.setHead(headNode.getSucc());
			size--;
			//System.out.println(headNode.getData());
			return headNode.getData();

			//Removes an item from last index of the linked list decreasing size
		}else if(i == size-1) {

			Node<T> tailNode = (Node<T>) this.getTail();
			this.setTail(tailNode.getPred());
			size--;
			//System.out.println(tailNode.getData());
			return tailNode.getData();

			//Removes an item from any position (between first and last) of the list
		}else {

			Node<T> headNode = (Node<T>) this.getHead();

			//Search for the item of the list to be removed
			for(int k = 0; k < this.getSize(); k++) {

				/* If the respective index matches, then only the item is removed from the linked list.
				 * The item  succeeding and preceding to the removed list are connected to each other in the linked list.
				 * And the size of the list is reduced. 
				 */
				if(k == i) {
					Node<T> temp1 = (Node<T>) headNode.getPred();

					Node<T> temp2 = (Node<T>) headNode.getSucc();

					temp1.setSucc(headNode.getSucc());
					temp2.setPred(headNode.getPred());
					size--;
					break;

				}

				headNode = (Node<T>) headNode.getSucc();
			}

			return headNode.getData();
		}
	}

	/**
	 * This method adds an item x to the linked list at a specific position denoted by index i
	 * @param i Integer represents the index (position) of an item in the list
	 * @param x T (generic) represents the item of the list
	 * @return Returns truth of whether an item is added in the list or not
	 */
	@Override
	public boolean add(int i, T x) {

		//Creates a new node (item) to be added to the list
		Node<T> addNode = new Node<T>();
		addNode.setData(x);
		//System.out.println(i + "..");

		//If the index is negative, greater than the size or capacity, it is invalid range
		if(i < 0 || i >= capacity || i > size) {
			System.out.println("Invalid range");

		} 

		/* If there is no item in the list, then it adds the new item as both head node and tail node of the list
		 * Increases the size of the linked list
		 */
		if(size == 0) {

			this.setHead(addNode);
			this.setTail(this.getHead());
			size++;

			/*
			 * Adds an item at index 0 of the linked list and sets the added item (node) as head node of linked list
			 * The item which was previously a head node succeeds the new head node of the linked list
			 * Increases the size of the linked list
			 */
		} else if(i == 0) {

			Node<T> headNode = (Node<T>) this.getHead();
			headNode.setPred(addNode);
			addNode.setSucc(headNode);
			this.setHead(addNode);
			size++;

			/*
			 * Adds an item at last index of the linked list and sets the added item (node) as tail node of the linked list
			 * The item which was previously a tail node precedes the new tail node of the linked list
			 * Increases the size of the linked list
			 */
		} else if(i == size) {

			Node<T> tailNode = (Node<T>) this.getTail();
			tailNode.setSucc(addNode);
			addNode.setPred(tailNode);
			this.setTail(addNode);
			size++;

			//Adds an item at any position (between first and last) of the linked list
		} else {
			Node<T> headNode = (Node<T>) this.getHead();

			//Search for the position where the new item is to be added
			for(int k = 0; k < this.getSize(); k++) {

				/*
				 * If the respective index matches, the item is added in the list at that position
				 * The items preceding and succeeding that position are connected to the new item added
				 * Increases the size of the linked list
				 */
				if(k == i) {

					Node<T> temp = headNode;
					addNode.setPred(temp.getPred());
					addNode.setSucc(temp);
					temp.getPred().setSucc(addNode);
					temp.setPred(addNode);
					size++;
					break;
				}
				headNode = (Node<T>) headNode.getSucc();

			}

		}
		return true;
	}


}
