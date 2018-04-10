//----------------------------------------------------------------------------
// DLLNode.java              by Weaver                     Chapter 7
//
// Implements <T> nodes for a doubly linked list.
//----------------------------------------------------------------------------

package support;

public class DLLNode<T>
{
	private T info;
	private DLLNode<T> nextNode;
	private DLLNode<T> prevNode;

	public DLLNode(T info)
	{
		this.info = info;
		nextNode = null;
		prevNode = null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public DLLNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(DLLNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	public DLLNode<T> getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(DLLNode<T> prevNode) {
		this.prevNode = prevNode;
	}
	
	public void reset() {
		nextNode = null;
		prevNode = null;
	}


}

