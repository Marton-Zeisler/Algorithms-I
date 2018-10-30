class Test {
	public static void main(String[] args) {
		
		int numbers[] = {4,6,1,2,222,121312,12,12,2,21,12,321,3};
		sort(numbers);
		for (int each: numbers){
			System.out.print(each + " ");
		}
		
		
	}
	
	public static void sort(int numbers[]){
		
		for (int i=0; i < numbers.length; i++){
			int min = i;
			
			for (int j=i+1; j < numbers.length; j++){
				if (numbers[j] < numbers[min]) {
					min = j;
				}
			}
			
			// Swapping the minimum with i
			int tmp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = tmp;
		}
		
		
	}
	
}