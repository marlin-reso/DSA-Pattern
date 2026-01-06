package easy_medium_hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClassNotes {

	public static void main(String[] args) {
		
		ClassNotes cn = new ClassNotes();
	
		
		
	//	cn.checkGrade();
		cn.studentList();
		

	}
	
	public void studentList() {
		List <String>list = new LinkedList<>();
		list.add("Rahul");
		list.add("Mohan");
		list.add("Anuj");
		list.add("Suraj");
		list.add("Nitin");
		list.add("Asish");
		list.add("Rani");
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		Collections.sort(list);
		
		ClassNotes cn = new ClassNotes();
		
		for(String str : list) {
			
		}
		
		
		
		
		
		System.out.println(list);
	}
	
	
	
	
	
	public void checkGrade() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***** THIS IS AUTOMATED GRADING SYSTEM *******");
		
		System.out.print("Physics Marks : " );
		float physics = sc.nextFloat();
		
		System.out.print("Chemistry Marks : ");
		float chemistry = sc.nextFloat();
		
		System.out.print("Biology Marks : ");
		float biology = sc.nextFloat();
		
		System.out.print("Math Marks : ");
		float math = sc.nextFloat();
		
		System.out.print("English Marks : ");
		float english = sc.nextFloat();
		
		float totalMarks = ((physics + chemistry + biology + math + english)/500) * 100;
		System.out.println("Marks are " +totalMarks + "% and Grade is : ");
		
		

		if(totalMarks >= 90 ) {
			System.out.println("A++");
		}else if(totalMarks >= 80 && totalMarks <90) {
			System.out.println("A+");
		}else if(totalMarks >= 70 && totalMarks < 80) {
			System.out.println("A");
		}else if(totalMarks >= 60 && totalMarks < 70) {
			System.out.println("B+");
		}else if (totalMarks >=50 && totalMarks <60) {
			System.out.println("B");
		}else if(totalMarks >=40 && totalMarks <50) {
			System.out.println("C");
		}else {
			System.out.println("Failed");
		}
		
	    
		
	}

}
