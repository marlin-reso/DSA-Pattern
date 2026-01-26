package GPT;

import java.util.Arrays;


public class ArrayBased {

	public static void main(String[] args) {
		ArrayBased one = new ArrayBased();
		one.findMaxAndMin();
		one.sumOfArrayElement();
		one.sumOfArray();
		one.findMissingNumber();
		int arr[] = {1,0,2,0,0,3,4,5,45,66,70,86};
		one.reverseArrayInPlace(arr);
		for(int num : arr) {
			System.out.println(num);
		}

		System.out.println(one.checkSortedArray(arr));

		one.moveZero(arr);
		for(int value : arr) {
			System.out.println(value);
		}

		one.countEvenAndOdd(arr);


	}
	//Rotate array by K positions
	public void rotateArrayByKPosition(int arr[]) {

	}
	//count even and odd numbers
	public void countEvenAndOdd(int arr[]) {
		int countEven = 0;
		int countOdd = 0;
		for(int value : arr) {
			if(value%2 == 0) {
				countEven++;
			}else {
				countOdd++;
			}
		}
		System.out.println(countEven);
		System.out.println(countOdd);

	}
	//Move all zeros to end
	public void moveZero(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}

	//Check if array is sorted
	public boolean checkSortedArray(int arr[]) {

		for(int i=0; i<arr.length-1;i++) {
			if(arr[i]> arr[i+1]) {
				return false;
			}
		}
		return true;

	}
	//Reverse an array in-place
	public void reverseArrayInPlace(int arr[]) {

		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

	}
	//Find missing number in 1…N
	public void findMissingNumber() {
		int arr[] = {1,2,3,5,6,7,8};
		int num= 8;
		int sumOfNaturalNumber = num*(num+1)/2;
		int total = 0;
		for(int value : arr) {
			total+=value;
		}

		int missingNumber = sumOfNaturalNumber - total;
		System.out.println(missingNumber);
	}
	//Sum of array elements
	public void sumOfArray() {
		int arr[] = {1,2,3,4,5,6};
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		System.out.println(total);
	}
	//Find the sum of Array Elements
	public int sumOfArrayElement() {
		int total = 0;
		int arr[] =  { 1,3,5,3,8,6,4};
		if(arr.length == 0) return 0;
		for(int i=0; i<=arr.length-1; i++) {
			total = total + arr[i];
		}
		return total;
	}

	//Find the maximum and minimum in an array
	public void findMaxAndMin() {
		int arr[] = {1,3,6,3,9,1,0};
		Arrays.sort(arr);
		System.out.println("maximum number " + arr[arr.length-1]);
		System.out.println("minimum number " + arr[0]);

	}


}
