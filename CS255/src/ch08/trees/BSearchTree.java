package ch08.trees;

import support.BSTNode;

public class BSearchTree<T> implements BSTInterface {

	protected BSTNode<T> root;
	
	public BSTNode<T> getRoot() {
		return root;
		
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Comparable element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Comparable element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comparable get(Comparable element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Comparable element) {
		BSTNode<T> newNode = new BSTNode(element);
		BSTNode<T> prevNode, currNode;
		
		currNode = root;
		prevNode = root;
		if(root == null) {
			root = newNode;
		} else {
			while(currNode != null) {
				if(element.compareTo(currNode.getInfo()) <= 0) {
					prevNode = currNode;
					currNode = currNode.getLeft();
				} else {
					prevNode = currNode;
					currNode = currNode.getRight();
				}
			}
			
			if(element.compareTo(prevNode.getInfo()) <= 0) {
				prevNode.setLeft(newNode);
			} else {
				prevNode.setRight(newNode);
			}
		}
		
		System.out.println("Root " + root.getInfo());
	}

	@Override
	public int reset(int orderType) {
		// TODO Auto-generated method stub
		return 0;
	}  

	@Override
	public Comparable getNext(int orderType) {
		// TODO Auto-generated method stub
		return null;
	}

}
