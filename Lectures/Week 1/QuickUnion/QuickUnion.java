class Test {
	public static void main(String[] args) {
		
		QuickUnion test = new QuickUnion(10);
		test.union(5, 6);
		test.union(2, 9);
		test.union(4, 9);
		test.union(3, 4);
		
		System.out.println(test.connected(3, 4));
		
	}
}

public class QuickUnion{
	private int id[];
	
	public QuickUnion(int n){
		id = new int[n];
		
		for (int i=0; i<n; i++){
			id[i] = i;
		}
		
	}
	
	private int root(int i){
		while (i != id[i]){
			i = id[i];
		}
		
		return i;
	}
	
	public boolean connected(int p, int q){
		return root(p) == root(q);
	}
	
	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		
		id[i] = j; 
	}
	
}