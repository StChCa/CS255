//----------------------------------------------------------------------------
// DLLNode.java              by Dale/Joyce/Weems                     Chapter 7
//
// Implements <T> nodes for a doubly linked list.
//----------------------------------------------------------------------------

package support;

public class DLLNode<T> extends LLNode<T> {
	private DLLNode<T> prevNode;

	public DLLNode(T info) {
		super(info);
		prevNode = null;
	}

	public void setPrevNode(DLLNode<T> back)
	// Sets back link of this DLLNode.
	{
		this.prevNode = back;
	}

	public DLLNode<T> getPrevNode()
	// Returns back link of this DLLNode.
	{
		return prevNode;
	}

	public DLLNode<T> getNextNode() {
		return (DLLNode<T>) this.getLink();
	}

	public void reset() {
		// TODO Auto-generated method stub
		
	}
}
