package support;

public class NodeTester {

	public static void main(String[] args) {
		
		LLNode<String> node1 = new LLNode<String>("First");
		LLNode<String> node2 = new LLNode<String>("Second");
		LLNode<String> node3 = new LLNode<String>("Third");
		
//		System.out.println(node1.getInfo());
//		System.out.println(node2.getInfo());
		
		node1.setLink(node2);
		
//		System.out.println(node1.getLink());
//		
//		System.out.println(node1.getLink().getInfo());
		
		node2.setLink(node3);
		
//		System.out.println(node2.getLink());
//		
//		System.out.println(node2.getLink().getInfo());
		
		node3.setLink(new LLNode<String>("Fourth"));
//		
//		System.out.println(node3.getLink());
//		
//		System.out.println(node3.getLink().getInfo());
		
		LLNode<String> current = node1;
		while(current.getLink() != null) {
//			System.out.println(current.getLink().getInfo());
			// this gets us the last link. maybe use do while.
			current = current.getLink();
		};
		
		
	}
}
