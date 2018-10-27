class Test {
	public static void main(String[] args) {
		QuickFind test = new QuickFind(9);
		test.union(2, 3);
		test.union(2, 5);
		System.out.println(test.connected(3, 5));
	}
}


public class QuickFind{
	private int id[]; // Stores the IDs
	
	public QuickFind(int n){
		id = new int[n];
		
		for (int i=0; i<n; i++){ // At init, we load the array with numbers 0 - N
			id[i] = i;
		}
		
	}
	
	public boolean connected(int p, int q){
		return id[p] == id[q]; // Connected if their IDs match
	}
	
	public void union(int p, int q){
		int pID = id[p]; // First given number's ID
		int qID = id[q]; // Second give number's ID
		
		for (int i=0; i < id.length; i++){ // Looking for numbers whose ID is same as first number ID so we can set that ID equal to the second given number's 
			if (id[i] == pID){
				id[i] = qID;
			}
		}
	}
	
}