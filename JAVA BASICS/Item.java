import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.*;
class Item{
    String name;
    double price;
    double gst;
    double qty;//in percentage
    double prodGst;//for this gst we have to do gst/100 * price
    double finalPrice;//prodgst+price
    Item(String na,double price,double gst,double qty){
        this.name=na;//to 1st line 
        this.price=price;
        this.gst=gst;
        this.qty=qty;
        this.prodGst=(gst/100)*price;
        this.finalPrice=price+prodGst;
    }
}
public class ShoppingCart {
    public static void main(String[] args) {//main
        List<Item> pInfo=new ArrayList<Item>();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter 1 to printbill \n enter 0 to add item");
        int ch=sc.nextInt();
        do{
            System.out.println("ENetr name");
            String name=sc.next();
            System.out.println("Enter price");
            double price=sc.nextDouble();
            System.out.println("Enetr gst");
            double gst=sc.nextDouble();
            System.out.println("Enter quantity");
            double qty=sc.nextDouble();
            Item prod=new Item(name, price, gst, qty);
            pInfo.add(prod);
            System.out.println("MRP price of product");
            ch=sc.nextInt();
            System.out.println("ENter 1 to printbill \n enter 0 to add item");
            ch=sc.nextInt();
    
        }while(ch != 1);
        sc.close();
        invoice(pInfo);

    }

    public static void invoice(List<Item> plst ){//printbill function
        System.out.println("THANK YOU FOR SHOPPING");
        double total=0;
        double maxgst=0;
        double discount=0;
        double hastopay=0;
        String maxpiadgstname="";
        double mrpprice=0;

        for(Item i:plst){
            total += i.finalPrice*i.qty;
           // System.out.println(i.finalPrice);
            maxgst=Math.max(maxgst,(i.prodGst)*i.qty); 
            if(maxgst==(i.prodGst)*i.qty){
                maxpiadgstname=i.name;
            } 
        }
        if(total>500){
            discount=0.05*total;
        }
        hastopay=total-discount;
         System.out.println("Total amount = "+total);
         System.out.println("discount = "+discount);
         System.out.println("FINAL BILL AMOUNT = "+hastopay);
         System.out.println("MAX GST PAID FOR AN ITEM "+maxgst);
         System.out.println("name of prood max gst paid by us "+maxpiadgstname);

        //PRODUCT NAME = ABC AND PRODUCT MRP = 1000

        
    }
}