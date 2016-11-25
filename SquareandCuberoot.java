package session3;

import java.lang.Math;

class Root{
	
	static double number;
	
	static double Square(double n){
		number = n;
		return Math.sqrt(n);
	}
	
	static double Cube(double nb){
		number = nb;
		return Math.cbrt(nb);
	}
	
}

public class SquareandCuberoot {
	
	public static void main(String[] args) {
		Root root = new Root();
		//root.Square();
		//root.Cube();
		
		System.out.println("Square root : " + root.Square(729));
		
		System.out.println("Cube root : " + root.Cube(125));
		
		
	}
	
}
