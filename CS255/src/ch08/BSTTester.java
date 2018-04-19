package ch08;

import ch08.trees.BSearchTree;

public class BSTTester {

	public static void main(String[] args) {
		
		BSearchTree<String> bst = new BSearchTree();
		
		bst.add("h");
		bst.add("e");
		bst.add("g");
		
		System.out.println(bst.size());
		
		System.out.println(bst.contains("i"));
		System.out.println(bst.contains("g"));
		
		System.out.println(bst.get("h"));
		
	}

}
