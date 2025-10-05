public class Stack {
	int limit;
	int count;
	Node start;
	
	public Stack(int size) {
		limit = size;
		count = 0;
		start = null;
	}
	
	public void push(char val) {
		if(isFull() == false) {
			Node newNode = new Node(val);
			newNode.next = start;
			start = newNode;
			count++;	
		}
		else {
			System.out.println("Stack is Full....");
		}
	}
	
	public boolean isFull() {
		if(limit == count) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Node pop() {
		if(isEmpty() == false) {
			Node temp = start;
			start = start.next;
			count--;
			return temp;
		}
		else {
			System.out.println("Stack is Empty....");
			return null;
		}
	}
	
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Node top() {
		return start;
	}
	
}
