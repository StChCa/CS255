//----------------------------------------------------------------
// ArrayStack.java       by Dale/Joyce/Weems             Chapter 3
//
// Implements BoundedStackInterface using an array to hold the 
// stack elements.
//
// Two constructors are provided: one that creates an array of a 
// default size and one that allows the calling program to 
// specify the size.
//----------------------------------------------------------------

package ch03.stacks;

public class ArrayStack<T> implements BoundedStackInterface<T> {
	
	protected final int DEFCAP = 100; // default capacity
	protected T[] stack;              // holds stack elements
	protected int topIndex = -1;      // index of top element in stack

	public ArrayStack() 
	{
		stack = (T[]) new Object[DEFCAP];
	}

	public ArrayStack(int maxSize) 
	{
		stack = (T[]) new Object[maxSize];
	}

	
	public int getTopIndex() {
		return topIndex;
	}

	public void push(T element)
	// Throws StackOverflowException if this stack is full,
	// otherwise places element at the top of this stack.
	{      
		if (!isFull())
		{
			topIndex++;
			stack[topIndex] = element;
		}
		else
			throw new StackOverflowException("Push attempted on a full stack.");
	}

	public void pop()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise removes top element from this stack.
	{                  
		if (!isEmpty())
		{
			stack[topIndex] = null;
			topIndex--;
		}
		else
			throw new StackUnderflowException("Pop attempted on an empty stack.");
	}

	public T top()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise returns top element from this stack.
	{                 
		T topOfStack = null;
		if (!isEmpty())
			topOfStack = stack[topIndex];
		else
			throw new StackUnderflowException("Top attempted on an empty stack.");
		return topOfStack;
	}

	public boolean isEmpty()
	// Returns true if this stack is empty, otherwise returns false.
	{              
		if (topIndex == -1) 
			return true;
		else
			return false;
	}

	public boolean isFull()
	// Returns true if this stack is full, otherwise returns false.
	{              
		if (topIndex == (stack.length - 1)) 
			return true;
		else
			return false;
	}
  
	public T inspector(int index){
	  
		T topOfStack = null;
		T indexElement = null;
		ArrayStack<T> tempStack = new ArrayStack<T>();
	  
			if(index-1 > topIndex){
				return null;
			}
				// if arrayStack is not empty take top x number of T elements into tempstack
				// and pop them off this stack.
				for (int x = 1 ; x <= index ; x++){
					topOfStack = stack[topIndex];
					pop();
					
					tempStack.push(topOfStack);
				  
				}
			  // set the indexElement (our return) to equal the arraystack[index] the user requested
				indexElement = topOfStack;
			  
				for(int x = 1 ; x <= index ; x++){
					// Put the items we took off back on our array stack and remove from tempstack
					T addBack = tempStack.top();
					push(addBack);
					tempStack.pop();
				}
			
				return indexElement;
	}
  
	public void popSome(int numToPop) {
		
		// pop the number of items the user wants to pop. Throw exception if they try to pop too many.
		if (numToPop <= topIndex + 1) {
			for ( int x = 0 ; x < numToPop ; x++) {
				pop();
			}
		}
		else {
			throw new StackUnderflowException("Tried to pop more elements than in ArrayStack");
		}
	}
	
	public String toString() {
		
		// Concatenate all elements to one string and return that string.
		String sendString = "";
		for (int x = 0 ; x <= topIndex ; x++) {
			sendString += stack[x].toString();
			sendString += ", ";
		}
		return sendString;
	}
  
}