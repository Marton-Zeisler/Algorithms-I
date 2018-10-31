class Test {
	public static void main(String[] args) {
		
		int numbers[] = {929,192,1948,292,192,1,34,3,5,7,854,4323,345,233,64,14,46};
		sort(numbers);
		
		for (int each: numbers){
			System.out.println(each);
		}
		
	}
	
	public static void sort(int array[]){
		int aux[] = new int[array.length];
		sort(array, aux, 0, array.length-1);
	}
	
	public static void sort(int array[], int aux[], int low, int high){
		if (high <= low){
			return;
		}
		int mid = low + (high-low)/2;
		sort(array, aux, low, mid);
		sort(array, aux, mid+1, high);
		
		if (array[mid+1] > array[mid]){
			return;
		}
		
		merge(array, aux, low, mid, high);
	}
	
	public static void merge(int array[], int aux[], int low, int mid, int high){
		// copy array into aux
		for(int i=low; i<=high; i++){
			aux[i] = array[i];
		}
		
		int leftIndex = low; // left index starts at the lowest point and goes up the mid index
		int rightIndex = mid+1; // right index starts at the mid+1 index and goes up to the high index
		
		// checking which half of the aux array's index needs to go to the array
		for(int i=low; i<=high; i++){
			if (leftIndex>mid){
				array[i] = aux[rightIndex++];
			}else if (rightIndex>high){
				array[i] = aux[leftIndex++];
			}else if (aux[leftIndex] < aux[rightIndex]){
				array[i] = aux[leftIndex++];
			}else{
				array[i] = aux[rightIndex++];
			}
		}
	}
	
}