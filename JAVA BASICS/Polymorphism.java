import java.util.*;

class Figures{
	void area(double l, int b){
		System.out.println("area of rectangle is : "+(l*b));
	}
	void area(int x){
		System.out.println("area of square is :"+(x*x));
	}
	void area(int b,int h){
		System.out.println("area of triangle is :"+(0.5*b*h));
	}
}

class Polymorphism{
	public static void main(String [] args){
		Figures f = new Figures();
		f.area(10.0,20);
		f.area(5);
		f.area(4,6);
	}
}