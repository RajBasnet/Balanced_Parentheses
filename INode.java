package edu.wmich.CS3310.PA1.RajBasnet;

/**
 * This interface is implemented by Node class to use all the methods defined in it.
 * 
 * @param <T> It represents the generic nature of the interface.
 */
public interface INode<T> {

	/**
	 * Sets the data item for the node
	 * @param data data represents the object T of generic nature
	 */
	void setData(T data);

	/**
	 * @return Returns the data item reference stored in the node
	 */
	T getData();

	/**
	 * Sets the pointer to the next linked node to this one
	 * @param succ succ represents the INode object for interface
	 */
	void setSucc(INode<T> succ);

	/**
	 * @return Returns the pointer to the next linked node to this one
	 */
	INode<T> getSucc();

	/**
	 * Sets the pointer to the previous linked node from present one
	 * @param pred pred represents the INode object for interface
	 */
	void setPred(INode<T> pred);

	/**
	 * @return Returns the pointer to the previous linked node from the present one
	 */
	INode<T> getPred();

}
