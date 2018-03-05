package ch03;

public interface BoundedStackInterface <T> extends StackInterface {

	public void push(T elemnet) throws StackOverflowException;
	
	public boolean ifFull();
}
