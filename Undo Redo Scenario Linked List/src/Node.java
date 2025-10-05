public class Node {
	String data;	// data store karna ka liyya variable
	Node next;	// next node ka address store karna ka liyya 
	
	// constructor
	public Node(String data) {
		this.data = data;	// data ki value user parameter ka through set ho rhi hai
		next = null;	// next ki initial value null set ho rhi hai
	}
}
