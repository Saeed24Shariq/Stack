// stack ka yeh code linked list ko use kar ka hai
public class Stack {
	private Node start;	// first node ka address store karna ka liyya.... 
	private int limit;	// stack ki limit ko user sa la kar store karna ka liyya....
	private int count;	// stack ma nodes ko count karna ka liyya....
	
	// Constructor
	public Stack(int size) {
		this.start = null;	// assigning the default value of null to the start
		this.limit = size;	// limit set ho rhi hai user sa la kar
		this.count = 0;	// count ko initial value 0 set ho rhi hai kio ka stack ma koi node ni hai....
	}
	
	// push ka function
	public void push(String data) {
		if(isFull() == false) {		// check kar rha hain ka stack full toh ni hai agr full huwa
							// toh true return kara ga lakin !--> sign usa false kar daa ga
			Node newNode = new Node(data);	// nai node ban rhi hai
			newNode.next = start;	// nai node ka next ma start store hoo rha hai
			start = newNode;	// start ko newNode par point karwa rha hain
			count++;	// node ka count ma increment hoo rha hai
		}
		else {
			System.out.println("Stack is Full");	// agar full huwa toh yeh message print hoo ga
		}
	}
	
	// isFull ka function
	public boolean isFull() {
		if(count == limit) {	// check hoo rha hai k node ka count limit ka equal hai ya ni
			return true;	// agar equal hai toh true return hoo ga matlab k stack full hai
		}
		else {
			return false;	// agar equal ni hai toh false return hoo ga matlab k stack full ni hai 
		}
	}
	
	// pop ka function
	public Node pop() {
		if(isEmpty() == false) {	// check hoo rha hai ka stack empty toh ni hai
			Node temp = start;	// start wala node ko temp ma store kar rha hain ta ka usa return kar saka... 
			start = start.next; // start wala node ma us sa next wala node overwrite hoo rha hai means ka first wala node delete ho gya hai
			count--; // count ma decrement hoo rha hai kio ka aik node delete hoo gya hai
			return temp;	// jo node delete huwi hai usa return karwa rha hain
		}
		else {
			System.out.println("Stack is Empty");	// agar empty huwa toh yeh message print hoo ga
			return null;	// aur null return hoo ga
		}
	}
	
	// isEmpty ka function
	public boolean isEmpty() {
		if(count == 0) {	// check hoo rha hai k node ka count zero ka equal hai ya ni
			return true;	// agar count equal huwa zero ka toh true return hoo ga matlab ka stack khaali hai
		}
		else {
			return false;	// agar count zero ka equal na huwa toh false return hoo ga matlab ka stack khaali ni hai
		}
	}
	
	// top ya peek ka function
	public Node peek() {
		return start;
	}
}
