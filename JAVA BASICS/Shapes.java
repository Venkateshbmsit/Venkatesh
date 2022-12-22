import java.util.*;

class Rectangle{
	void area(double l, int b){
		System.out.println("area of rectangle is : "+(x*b));
	}
}

class Circle{
    void area(int b, int h){
        System.out.println("area of circle is :"+(0.5*x*h));
    }
}

class Shapes{
    public static void main(String []args){
        Rectangle r = new Rectangle();
        Circle c =new Circle();
        r.area(12.0,6);
        c.area(5,4);
    }
}