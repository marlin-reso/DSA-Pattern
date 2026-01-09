package easy_medium_hard;

import java.util.Scanner;

public class LoopControl {

	public static void main(String[] args) {
	//	printNumbers();
	//	printWhenLastDigitIsSeven();
	//	dividedByTwelveAndFifteen();
		factorOfNumber();

	}
	
	public static void factorOfNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int value =1;
		
		
		
		
	}
	
	public static void dividedByTwelveAndFifteen() {
		int num = 1;
		
		while(num<=1000) {
			if(num%12 == 0 && num%15 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
	
	public static void printWhenLastDigitIsSeven() {
		int num =1;
		
		while(num <= 100) {
			
			if(num%10 ==7) {
				System.out.println(num);
			}
			num++;
		}
		System.out.println("******************");
		
		num = 1;
		
		while(num <=100) {
			if(num%7 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
	
	public static void printNumbers() {
		int num = 1;
		while(num <=10) {
			
			System.out.println(num);
			num++;
			
		}
		
	}

}
