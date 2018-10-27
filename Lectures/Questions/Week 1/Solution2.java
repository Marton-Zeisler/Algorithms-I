public class Solution2 {
	public static void main(String[] args) {
		QuickUnion test = new QuickUnion(10);
		test.union(1, 2);
		test.union(2, 6);
		test.union(6, 9);
		System.out.println(test.findMax(9));
		
	}
}


class QuickUnion{
	private int id[];
	private int rootLargest[];
	
	public QuickUnion(int n){
		id = new int[n];
		rootLargest = new int[n];
		
		for (int i=0; i<n; i++){
			id[i] = i;
			rootLargest[i] = i;
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
		
		if (rootLargest[i] >= rootLargest[j]) {
			rootLargest[j] = rootLargest[i];
		}
		
		id[i] = j; 
	}
	
	public int findMax(int index){
		return rootLargest[root(index)];
	}
	
}