package two_Pointer;

public class TwoPointerProblems {

	public static void main(String[] args) {
		TwoPointerProblems tp = new TwoPointerProblems();
		int arr[]= { 1,2,3,4,5,6};
	//	tp.reverseArray(arr);
		boolean result = tp.checkPalindrome("abbaa");
		System.out.println(result);

	}
	//pair with given sum
	public void pairWithGivenSum(int arr[]) {
		
	}
	//check palindrome String
	public boolean checkPalindrome(String str) {
		String reverse= new StringBuilder(str).reverse().toString();
		if(str.equals(reverse)) return true;
		else return false;
	}
	//reverse Array
	public void reverseArray(int arr[]) {

		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		for(int a : arr) {
			System.out.print(a+",");
		}

	}

}
