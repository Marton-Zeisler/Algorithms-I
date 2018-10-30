class Test {
	public static void main(String[] args) {
		
		Stack test = new Stack();
		test.push("A");
		test.push("B");
		test.push("C");
		test.push("D");
		
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.isEmpty());
		
		
	}
}


class Stack{
	private class Node{
		String item;
		Node next;
	}
	
	Node head;
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void push(String item){
		Node oldHead = head;
		head = new Node();
		head.item = item;
		head.next = oldHead ;	
	}
	
	public String pop(){
		String item = head.item;
		head = head.next;
		return item;
	}
	
}