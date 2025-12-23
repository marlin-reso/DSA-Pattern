package array;

public class BasicsOfArray {

	public static void main(String[] args) {
		
		
		int value[]= {1,2,3,4,5,6,7};
		
		char words[]= {'a','b','c','d','e','f'};
		
		int arr[] = {3,4,5,6};
		System.out.println("test");
		
		for(int numbers : value) {
			
			System.out.println(numbers);
		}
		
		for(char letter: words) {
			
			System.out.println(letter);
		}
		
		BasicsOfArray.arr();

	}
	
	public static void arr() {
		
		int arr[] = {1,2,3,4,5};
		
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	

}
