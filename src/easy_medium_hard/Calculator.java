package easy_medium_hard;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		printTable(3);
	}
	
	public static void factorial(int a) {
		
		
		for(int i=a; i==0; i--) {
			
			System.out.println();
		}
	}
	
	
	
	public static void printTable(int a) {
		
		
		for(int i = 1; i<=10 ; i++) {
			
			System.out.println(a +" * "+ i +" = " + a*i );
		}
	}
	
	
	
	public static float add(float a, float b) {
		float result = a+b;
		return result;
		
	}
	public static float add(float a, float b, float c) {
		
		float result = a+b+c;
		return result;
		
	}
	
	public static float add( float a, float b, float c, float d) {
		
		float result = a+b+c+d;
		return result;
		
		
	}
	
	public static float multi(float a, float b) {
		float result = a*b;
		return result;
		
	}
	public static float multi(float a, float b, float c) {
		
		float result = a*b*c;
		return result;
		
	}
	
	public static float multi( float a, float b, float c, float d) {
		
		float result = a*b*c*d;
		return result;
		
		
	}

}
