package prifix_sum;

public class PrefixSum {
	//find the sum of elements in subArray
	
	public static void main(String[] args) {
		
	
	
	int arr[]= {1,2,3,4,5,6};
	int prefix [] = new int [arr.length];  //pointer 1 : create new array of same length of old arr.
	
	prefix[0]= arr[0];
	
	  for(int i =1; i<arr.length; i++) {
		  prefix[i] = prefix[i-1] + arr[i];
	  }
		  
		  
	  for(int num: prefix) {
		  System.out.println(num + " ");
	  }

}
}
