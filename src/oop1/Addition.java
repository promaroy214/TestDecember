package oop1;

public class Addition {
	
	//instance variable always should be private
	//to access to someone use settelers and gettelers
	private int x;
	private int y;
	
	//Poly (many)- morphism
	//1. Method overloading --a. number of parameter is different
	//b. if same number of parameter the data is different types
	//2. method overriding
	
	//return type method name ()
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void add() {
		int sum = x+y; //local variable
		System.out.println(sum);
	} //end add
	
	public int add (int a, int b, int c ) {
		int sum = a+b+c;
		return sum;
	}// end add
	
	protected double add (double a, double b, double c) {
		double sum = a+b+c;
		return sum;
	}//end add
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Addition a1 = new Addition ();
		a1.x=10;
		a1.y=20;
		a1.add();
		int s1 = a1.add(200, 200, 200);
		System.out.println(s1);
		System.out.println(a1.add(200.3, 200.7, 200.9));
		
		Addition a2 = new Addition ();
		a2.x=100;
		a2.y=200;
		a2.add();
		
		Addition a3 = new Addition ();
		a3.x=689;
		a3.y=867;
		a3.add();
		
			
		// TODO Auto-generated method stub

	} //end main

} //end class

