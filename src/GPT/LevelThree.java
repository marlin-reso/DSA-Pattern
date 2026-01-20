package GPT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LevelThree {

	public static void main(String[] args) {
		LevelThree lt = new LevelThree();
		Set<Integer> set = new HashSet<>();
		int arr1[] = new int[2];
	
		int arr[] = {1,2,4,5,8,1,6,1,6};
	//	set = lt.findDuplicateElementInArray(arr);
	//	System.out.println(set);
		
	//	lt.countFrequncy(arr);
		
	//	int a = lt.findFirstRepeatingElement(arr);
	//	System.out.println(a);
	//	boolean value = lt.twoSomeProblem(arr, 10);
	//	System.out.println(value);
		
		arr1 = lt.returnTwoNumbers(arr, 10);
		for(int num : arr1) {
			System.out.println(num);
		}



	}
	//Check if array elements are unique
	public int findUniqueInArray(int arr[]) {
		Map<Character, Integer> map = new HashMap<>();
		for(int a : arr) {
			
		}
		
		return 0;
	}
	//Two some problem Return the two numbers 
	public int[] returnTwoNumbers(int arr[], int target) {
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			int required = target - num;
			if(set.contains(required)) {
				return new  int[] {required, num};
			}
			set.add(num);
		}
		return new int[] {};
	}
	//Two some problem
	public boolean twoSomeProblem(int arr[], int target) {
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			int required = target - num;
			if(set.contains(required)) {
				return true;
			}
			set.add(num);
		}
		System.out.println(set);
		return false;
	}
	//Find first repeating element
	public Integer findFirstRepeatingElement(int arr[]) {
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int a : arr) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				return entry.getKey();
				
			}
		}
		return null;
	}
	//Count frequency of elements
	public void countFrequncy(int arr[]) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
	//Find duplicate elements in an array
	public Set<Integer> findDuplicateElementInArray(int arr[]) {
		Map<Integer,Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		for(int a : arr) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			//System.out.println(entry.getKey()+ " "+entry.getValue());
			if(entry.getValue()>1) {
				set.add(entry.getKey());
			}
		}
		return set;
	}
}

