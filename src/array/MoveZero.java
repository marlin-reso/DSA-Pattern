package array;

public class MoveZero {

	public static void main(String[] args) {
		
		int arr[] = {1,0,3,4,0,5,0,6};
		
		moveZero(arr);
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		

	}
	
	public static void moveZero(int arr[]) {
		
		int j=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] !=0) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
			}
		}
	}

}
