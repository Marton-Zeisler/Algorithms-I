class Tets {
	public static void main(String[] args) {
		
		int numbers[] = {2,3,1,4,2,1,3,44,121,2,42,123,121,134,12,453,2};
		sort(numbers);
		for (int each: numbers) {
			System.out.println(each);
		}
		
		
	}
	
	public  static void sort(int numbers[]){
		for (int i=1; i<numbers.length; i++){
			int key = numbers[i];
			int j = i-1;
			
			while (j>=0 && numbers[j] > key){
				numbers[j+1] = numbers[j];
				j = j-1;
			}
			numbers[j+1] = key;
		}
	}
	
	
}