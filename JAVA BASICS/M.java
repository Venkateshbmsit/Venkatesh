import java.util.*;

abstract class Rectangle{
    
    abstract void compute();
	public void rectangle(){
		System.out.println("this is a non abstract methos in the abstract class");
    }
}

class H extends Rectangle{
    int l=10,b=3;
    public void compute(){
        System.out.println("answer is "+(l*b));
    }
}

class M{
    public static void main(String []args){
        H h= new H();
        h.compute();
        h.rectangle();
        
    }
}

