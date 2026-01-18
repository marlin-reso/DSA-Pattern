package array;

public class Funcational {

	public static void main(String[] args) {
		
		//declaration
		
		int arr[] = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		arr[5] = 99;
		System.out.println("********");
		int num[] = {1,2,3,4,5,6};
		System.out.println(num.length);
		System.out.println("******");
		
		//traversal
		
		for(int i=0;i<= arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("************");
		for(int value : num) {
			
			System.out.println(value);
		}
		
		Funcational fs = new Funcational();
		int newArr[]=fs.insertionAtIndex(arr, 6, 89);
		for(int val : newArr) {
			System.out.println(val);
		}
		
		

	}
	
	public int[] insertionAtIndex(int arr[], int index, int value) {
		int newArr[] = new int[arr.length+1];
		for(int i=0, j=0; i<newArr.length;i++) {
			if(i == index) {
				newArr[i] = value;
			}else {
				newArr[i] = j++;
			}
		}
		
		
		
		
		return newArr;
	}
	
	
	

}
