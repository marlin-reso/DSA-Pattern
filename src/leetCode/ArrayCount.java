package leetCode;

import java.util.LinkedList;
import java.util.List;

public class ArrayCount {
	public static void main(String[] args) {
		ArrayCount ac = new ArrayCount();
		List <Integer> startList = new LinkedList<>();
		List<Integer> endList = new LinkedList<>();
		List<Integer> list = new LinkedList<>();
		
		int arr[] = { 1,1,0,0,1,1,1,0};
		int arr1[] = {0,1,1,0,1,1,1,0};
		
	//	int count = ac.countGroupOfOneS(arr);
	//	System.out.println(count);
//		startList = ac.findIndices(arr1);
//		System.out.println(startList);
//		
//		endList = ac.findEndIndices(arr1);
//		System.out.println(endList);
		
		int length = ac.findStartAndEndIndicesOfOne(arr1);
		System.out.println(length);
		
	}
	public int findStartAndEndIndicesOfOne(int arr[]){
		List<Integer> startList = new LinkedList<>();
		List<Integer> endList = new LinkedList<>();
		for(int i=0; i<arr.length ; i++) {
			if(arr[i]==1 && (i==0 || arr[i-1]==0)) {
				startList.add(i);
			}
			if(arr[i]==1 && (i==arr.length-1 || arr[i+1]==0)) {
				endList.add(i);
			}
		}
		int length =0;
		int start=0;
		int end =0;
		for(int i=0; i<startList.size();i++) {
			start = startList.get(i);
			end = endList.get(i);
			length = end - start +1;
		}
		return length;

	}
	public List<Integer> findEndIndices(int arr[]){
		List<Integer> endList = new LinkedList<>();
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] == 1 && (i==arr.length-1 || arr[i+1] ==0)) {
				endList.add(i);
			}
		}
		return endList;
	}
	public List<Integer> findIndices(int arr[]) {
		List<Integer> startList = new LinkedList<>();
		for(int i=0; i<= arr.length-1;i++) {
			if(arr[i] ==1 && (i==0 || arr[i-1] ==0)) {
				startList.add(i);
			}
		}
		return  startList;
	}
	
	public int countGroupOfOneS(int arr[]) {
		int count =0;
		for(int i=0; i<= arr.length-1; i++) {
			if(arr[i]==1 && (i==0 || arr[i-1]==0)) {
				count++;
			}
		}
		
		return count;
	}

}
