import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		shuffle(numbers);
		
		for(int each: numbers){
			System.out.println(each);
		}
		
	}
	
	public static void shuffle(int numbers[]){
		Random random = new Random();
		for (int i=0; i<numbers.length; i++){
			int randomIndex = random.nextInt(i+1);
			int tmp = numbers[i];
			numbers[i] = numbers[randomIndex];
			numbers[randomIndex] = tmp;
		}
	}
	
}