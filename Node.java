package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This class contains all the information for the node utilized to create linked lists.
 * Implements the INode interface to use all its methods fro performing specified functions
 * Initializes variables Node pred, succ and T data 
 * @param <T> It represents the generic nature of the class
 */
public class Node<T> implements INode<T> {

	private Node<T> pred;
	private Node<T> succ;
	private T data;

	/**
	 * Sets the data item for the node
	 * @param data data represents the object T of generic nature
	 */
	public void setData(T data) {

		this.data = data;
	}

	/**
	 * @return Returns the data item reference stored in the node
	 */
	public T getData() {

		return data;
	}

	/**
	 * Sets the pointer to the next linked node to this one
	 * @param pred pred represents the INode object for interface
	 */
	public void setPred(INode<T> pred) {

		this.pred = (Node<T>) pred; 
	}

	/**
	 * @return Returns the pointer to the next linked node to this one
	 */
	public INode<T> getPred(){

		return pred;
	}

	/**
	 * Sets the pointer to the previous linked node from present one
	 * @param succ succ represents the INode object for interface
	 */
	public void setSucc(INode<T> succ) {

		this.succ = (Node<T>) succ;
	}

	/**
	 * @return Returns the pointer to the previous linked node from the present one
	 */
	public INode<T> getSucc() {

		return succ;
	}

}
