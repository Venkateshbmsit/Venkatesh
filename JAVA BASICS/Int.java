import java.util.*;

interface Rectangle{
    int l=3,b=2,w=5;
    public void compute();
	public void calc();
    
}

public class Formula{
    public void show(){
        System.out.println("The below are the stats of a rectangle");
    }
}

class H extends Formula implements Rectangle {
    public void compute(){
        System.out.println("area is "+(l*b));
    }
    public void calc(){
        System.out.println("perimeter is :"+(2*(l+w)));
    }
}
class Int{
    public static void main(String []args){
        H h= new H();
        h.compute();
        h.calc();
        h.show();
        
    }
}

