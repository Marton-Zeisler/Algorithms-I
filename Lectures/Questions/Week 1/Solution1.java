public class Solution1 {
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
	
	public int findMax(int index){
		int maximum = Integer.MIN_VALUE; // we give maximum a default value
		int currentRoot = root(index); // we get the root of the given item
		
		for (int i=0; i< id.length; i++){ // we loop through the array, looking for items which have the same root(same connected components) and larger than max
			if(root(i) == currentRoot && i >= maximum){
				maximum = id[i];
			}
		}
		
		return maximum;
	}
	
}