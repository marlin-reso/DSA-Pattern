package array;

public class Traversal {

	public static void main(String[] args) {

		int arr1[] = {1,3,5,7,9, 10, 12, 14,15,21};

		print(arr1);
		sumOfElements(arr1);
		maxAndMin(arr1);
		countEvenOdd(arr1);
		reverseArray(arr1);
		findTheIndexOfGivenElement(arr1, 9);


	}
	//find the index of given element
	public static void findTheIndexOfGivenElement(int arr[],int key) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.println("Index number is "+  i  + "and key is "+ key);
				return;
			}
		}
		System.out.println("Element not found in the array");
	}
	
	//Reverse an array without using another array
	//Two pointers
	public static void reverseArray(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right]  =  temp;
			left++;
			right--;
		}
		Traversal.print(arr);
	}
	
	//Conunt the total number of even and odds in Array
	public static void countEvenOdd(int arr[]) {
		int even = 0;
		int odd = 0;
		for(int value : arr) {
			if(value % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Total number of even is "+even+ "and odds "+odd);
	}
	
	//Print an array
	public static void print(int arr[]) {
		for(int value: arr) {
			System.out.println(value);
		}
	}
	
	//count the sum of an array
	public static void sumOfElements(int arr[]) {
		int sum =0;
		for(int value : arr) {
			sum =value + sum;	
		}
		System.out.println(sum);	
	}
	
	//Find the maximum and minimum numbers of array
	public static void maxAndMin(int arr[]) {
		int max =arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> arr[0]) {
				max = arr[i];
			}
			if(arr[i] < arr[0]) {
				min = arr[i];
			}
		}
		System.out.println("Maximum number of array is : " + max);	
		System.out.println("Minimum number of array is : " + min);
	}
}


