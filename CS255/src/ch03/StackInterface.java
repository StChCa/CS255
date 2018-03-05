package ch03;

public interface StackInterface<T>{
	
	T pop() throws StackUnderflowException;
	
	T top() throws StackUnderflowException;
	
	boolean isEmptly();
	
}
