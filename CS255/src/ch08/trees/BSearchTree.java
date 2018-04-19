package ch08.trees;

import support.BSTNode;

public class BSearchTree<T> implements BSTInterface {

	boolean found = false;;
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
		return recSize(root);
	}
	
	private int recSize(BSTNode<T> tree) {
		if (tree == null)
			return 0;
		else
			return recSize(tree.getLeft()) + recSize(tree.getRight()) + 1;
	}

	@Override
	public boolean contains(Comparable element) {
		// TODO Auto-generated method stub
		BSTNode<T> checkNode = root;
		
		while (checkNode != null) {
			if(checkNode.getInfo() == element)
				return true;
			
			if(element.compareTo(checkNode.getInfo()) < 0) {
				checkNode = checkNode.getLeft();
			}
			if(element.compareTo(checkNode.getInfo()) > 0) {
				checkNode = checkNode.getRight();
			}
		}
		
		return false;
	}

	@Override
	public boolean remove(Comparable element) {
		return recRemove(root, element);
	}
	
	private BSTNode<T> recRemove(BSTNode<T> tree, Comparable element) {
		if(tree == null)
			found = false;
		if(element.compareTo(tree.getInfo()) < 0) {
			tree.setLeft(recRemove(tree.getLeft(), element));
		}
		else if (element.compareTo(tree.getInfo()) > 0) {
			tree.setRight(recRemove(tree.getLeft(), element));
		} else {
			removeNode(tree);
			found = true;;
		}
	}
	
	private void removeNode(BSTNode<T> tree) {
		
	}

	@Override
	public Comparable get(Comparable element) {
		// TODO Auto-generated method stub
		BSTNode<T> checkNode = root;
		
		while (checkNode != null) {
			if(checkNode.getInfo() == element)
				return (Comparable) checkNode.getInfo();
			
			if(element.compareTo(checkNode.getInfo()) < 0) {
				checkNode = checkNode.getLeft();
			}
			if(element.compareTo(checkNode.getInfo()) > 0) {
				checkNode = checkNode.getRight();
			}
		}
		
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
