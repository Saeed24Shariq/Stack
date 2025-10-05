public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(10);	// stack ka object ban rha hai oor us ma stack ki limit 10 fix hoo rhi hai
		stack.push("Ali");	// value push hoo rhi hai
		stack.push("Hassan");	// value push hoo rhi hai
		stack.push("Khan");		// value push hoo rhi hai
		stack.push("Bilal");	// value push hoo rhi hai
		Node temp = stack.peek();	// value ko peek kar ka temp ma store kar sakin ta ka stack treverse kar sakin
		while(temp != null) {	// loop chala ga jab tak temp ma null ni aata
			System.out.println(temp.data);	// jo data nodes ma store hai wo print hoo rha hai
			temp = temp.next;	// temp ma us sa agla node store hoo rha hai tak ka next time next wala node aai
		}
		System.out.println(stack.pop().data);	// value ko matlab delete kar rha hain oor us value ko sath hi print bhi karwa rha hain
		System.out.println(stack.peek().data);	// value ko peek kar ko print kar rha hain
	}
}