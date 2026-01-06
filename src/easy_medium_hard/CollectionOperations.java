package easy_medium_hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionOperations {

	public static void main(String[] args) {
		CollectionOperations co = new CollectionOperations();
		
		co.list();
		

	}
	
	
	public void list() {
		
		List list = new LinkedList();
		
		list.add("Kumar");
		list.add("Sekh");
		list.add("Malik");
		list.add(23.56);
		
		
		System.out.println(list.contains("Kumar"));
		System.out.println(list);
		
		System.out.println(list.remove("Sekh"));
		System.out.println(list);
		
		
		
		
		List arrayList = new ArrayList();
		
		arrayList.add(list);
		
		
		
	}
	
	

}
