import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.*;
class Item{
    String Studentname;
    int rollno;
    double marks1;
    double marks2;
    double totalmarks;
    double percantage;
    Item(String Studentname,int rollno,double marks1,double marks2,double percantage,double totalmarks)
    {
        this.Studentname=Studentname;//to 1st line 
        this.rollno=rollno;
        this.marks1=marks1;
        this.marks2=marks2;
        this.percantage=percantage;
        
    }
}
public class SStudent {
    public static void main(String[] args) {//main
        List<Item> pInfo=new ArrayList<Item>();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter The Student Details");
        int ch=sc.nextInt();
        do{
            System.out.println("Enter the  name");
            String Studentname=sc.next();
            System.out.println("Enter the student rollno");
            double rollno=sc.nextDouble();
            System.out.println("Enetr the marks 1 ");
            double marks1=sc.nextDouble();
            System.out.println("Enter enter the marks 2");
            double marks2=sc.nextDouble();
            System.out.println("Enter the total marks");
            double totalmarks =sc.nextDouble();
            System.out.println("Enter the percantage");
            double percantage=sc.nextDouble();
            Item prod=new Item(Studentname, rollno, marks1, marks2,percantage);
            pInfo.add(prod);
            System.out.println("Enter the Student Details");
            ch=sc.nextInt();
    
        }while(ch != 0);
        sc.close();
        invoice(pInfo);

    }

    public static void invoice(List<Item> plst ){//printbill function
        System.out.println("Student report card");
        String Studentname;
        int rollno;
        double mark=0;
        double maxgst=0;
        double discount=0;
       
        ;

        for(Item i:plst){
            Studentname += ;
            System.out.println(i.total);
           percantage=total/
        }
        if(total>500){
            discount=0.05*total;
        }
         System.out.println("Total amount = "+total);
         System.out.println("discount = "+discount);
         System.out.println("FINAL BILL AMOUNT = "+hastopay);
         System.out.println("MAX GST PAID FOR AN ITEM "+maxgst);
         System.out.println("name of prood max gst paid by us "+maxpiadgstname);
         

        //PRODUCT NAME = ABC AND PRODUCT MRP = 1000

        
    }
}