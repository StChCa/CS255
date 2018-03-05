//----------------------------------------------------------------------
// LinkedStack.java         by Dale/Joyce/Weems                Chapter 3
//
// Implements UnboundedStackInterface using a linked list 
// to hold the stack elements.
//-----------------------------------------------------------------------

package ch03.stacks;

import support.LLNode;

public class LinkedStack<T> implements UnboundedStackInterface<T>
{
  protected LLNode<T> top;   // reference to the top of this stack

  public LinkedStack()
  {
    top = null;
  }

  public void push(T element)
  // Places element at the top of this stack.
  { 
    LLNode<T> newNode = new LLNode<T>(element);
    newNode.setLink(top);
    top = newNode;
  }     

  public void pop()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise removes top element from this stack.
  {                  
    if (!isEmpty())
    {
      top = top.getLink();
    }
    else
      throw new StackUnderflowException("Pop attempted on an empty stack.");
  }

  public T top()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise returns top element from this stack.
  {                 
    if (!isEmpty())
      return top.getInfo();
    else
      throw new StackUnderflowException("Top attempted on an empty stack.");
  }

  public boolean isEmpty()
  // Returns true if this stack is empty, otherwise returns false.
  {              
    if (top == null) 
      return true;
    else
      return false;
  }
  
	public T inspector(int index){

		LLNode<T> current = top;
		for (int x = 0 ; x < index-1 ; x++) {
			
			if (current.getLink() != null)
				current = current.getLink();
			else
				return null;
		}
		
		return current.getInfo();
	}
	
	public void popSome(int numToPop) {
	// pop the number of items the user wants to pop. Throw exception if they try to pop too many.
	
		for ( int x = 0 ; x < numToPop ; x++) {
			if (!isEmpty()) {
			pop();
			}else {
				throw new StackUnderflowException("Tried to pop more elements than in LinkedStack");
			}
	
		}
	}
	
	public String toString() {
		
		// Concatenate all elements to one string and return that string.
		String sendString = "";
		LLNode<T> thisOne = top;
		
		while (thisOne != null) {
			sendString += thisOne.getInfo();
			sendString += ", ";
			
			thisOne = thisOne.getLink();
			
		}
		return sendString;
	}
	
	public int sizer() {
		return recursiveSize(top);
	}

	private int recursiveSize(LLNode<T> link) {
		
		if (link == null)
			return 0;
		
		return recursiveSize(link.getLink())+1;
		
		
	}
  
}