package oop1;

public class Subtraction extends Addition {
	
	//oop
	//1. Inheritance
	//2. Polymosphism - 1. overloading 2. overriding
	//3. Encapulation
	//4. Abstraction

	void sub(int a, int b) {
		int s = a-b;
		System.out.println(s);
	}//end sub
	
	public int add(int a, int b, int c){
		int sum = a+b+c+5;
		return sum;
		
	}//end add
	
	//inheritance - establish a parent child relationship 
	
	
	public static void main(String[] args) {
		Subtraction s1 = new Subtraction();
		s1.sub(100, 50);
		
		//100+100+100-75
		
		int sum = s1.add(100, 100, 100)	;
		s1.sub(sum,  75);

	}//end main

}//end class
