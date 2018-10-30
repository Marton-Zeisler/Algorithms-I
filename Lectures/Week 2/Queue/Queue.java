class Test {
	public static void main(String[] args) {
		
		
		Queue test = new Queue();
		test.enqueue("A");
		test.enqueue("B");
		test.enqueue("C");
		test.enqueue("D");
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		
	}
}


class Queue{
	private class Node{
		String item;
		Node next;
	}
	
	Node first, last;
		
	public boolean isEmpty(){
		return first == null;
	}
	
	public void enqueue(String item){
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		
		if (this.isEmpty()){
			first = last;
		}else{
			oldLast.next = last;
		}
	}
	
	public String dequeue(){
		String item = first.item;
		first = first.next;
		if (isEmpty()){
			last = null;
		}
		
		return item;
	}
	
	
}