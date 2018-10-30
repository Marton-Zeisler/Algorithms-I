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
	private String elements[];
	private int size = 0;
	
	public Stack(){
		elements = new String[1];
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void push(String item){
		if (size == elements.length){
			resize(2 * elements.length);
		}
		
		elements[size++] = item;
	}
	
	private void resize(int capacity){
		String copy[] = new String[capacity];
		for (int i=0; i<size; i++){
			copy[i] = elements[i];
		}
		
		elements = copy;
	}
	
	public String pop(){
		return elements[--size];
	}
}
