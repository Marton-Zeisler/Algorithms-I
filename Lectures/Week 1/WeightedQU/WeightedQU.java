class Test {
	public static void main(String[] args) {
		WeightedQU test = new WeightedQU(10);
		test.union(5, 6);
		test.union(2, 9);
		test.union(4, 9);
		test.union(3, 4);
	
		System.out.println(test.connected(3, 4));
	}
}

public class WeightedQU{
	private int id[];
	private int sz[];
	
	public WeightedQU(int n){
		id = new int[n];
		sz = new int[n];
		
		for (int i=0; i<n; i++){
			id[i] = i;
			sz[i] = 1;
		}
		
	}
	
	private int root(int i){
		while (i != id[i]){
			id[i] = id[id[i]]; // this makes our algorithm faster using path compression
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
		
		if (i == j){
			return;
		}
		
		if (sz[i] < sz[j]){
			id[i] = j;
			sz[j] += sz[i];
		}else{
			id[j] = i;
			sz[i] += sz[j];
		}
	}
}