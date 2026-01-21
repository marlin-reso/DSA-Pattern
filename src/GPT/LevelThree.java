package GPT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LevelThree {

	public static void main(String[] args) {
		int arr[] = {2,3,4,4,5,2,0,2,0,1};
		int arr2[] = { 2,3,9,11};
		LevelThree lt = new LevelThree();
		Set<Integer> set = new HashSet<>();
//		lt.findDuplicateInArray(arr);
//		lt.countFrequency(arr);
//		 lt.firstRepeat(arr);
//		lt.checkUniqueElements(arr);
//		lt.findIntersectionOfTwoArray(arr, arr2);
		lt.findUniun(arr, arr2);
				
	}
	//find the uniun of the array
	public void  findUniun(int arr1[], int arr2[]) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int num : arr1) {
			set.add(num);
		}
		for(int num : arr2) {
			set.add(num);
		}
		System.out.println(set);
		
		
	}
	//Find intersection of two arrays
	public void findIntersectionOfTwoArray(int arr1[], int arr2[]) {
		Set<Integer> set = new HashSet<>();
		List<Integer>list = new LinkedList<>();
		for(int num : arr1) {
			set.add(num);
		}
		for(int num : arr2) {
			if(set.contains(num)) {
				list.add(num);
			}
		}
		System.out.println(list);
		
	}
	//Check if array elements are unique
	public void checkUniqueElements(int arr[]) {
		Map<Integer, Integer>map = new HashMap<>();
		List<Integer> list = new LinkedList<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				list.add(entry.getKey());
			}
		}
		System.out.println(list);
	}
	//find first repeating element
	public void firstRepeat(int arr[]) {
		Map<Integer,Integer>  map = new LinkedHashMap<>();
		Set<Integer> set = new LinkedHashSet<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	//count frequency of element
	public void countFrequency(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
	}
	//find duplicate element in array
	public void findDuplicateInArray(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		Set <Integer> set = new LinkedHashSet<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()> 1) {
				set.add(entry.getKey());
				
			}
		}
		System.out.println(set);
		
	}
}

