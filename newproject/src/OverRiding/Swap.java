package OverRiding;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			int x = 20;
			int y =30;
			System.out.println("Numbers before swapping");
			System.out.println(" number x is " + x);
			System.out.println("number y is " +y);
			// Swapping numbers
			x= x+y;// x= 50
			y=x-y; // y= 50-30(=20)
			x=x-y;// x= 50-20(30)
			System.out.println("Numbers after swapping");
			System.out.println("number x is " + x);
			System.out.println("number y is " +y);
			}

	}

}
