package cs141.mxchida;

public class Item {
	String name;
	   String desc;
	   double price;
	   int qty;
	  
	   public Item(){}
	   public Item(String n,String d,double p)
	   {
	       name=n;
	       desc=d;
	       price=p;
	       qty=0;
	   }
	   public Item(String n,String d,double p,int q)
	   {
	       name=n;
	       desc=d;
	       price=p;
	       qty=q;
	   }
	   public void showTotal()
	   {
	       double total = qty*price;
	       System.out.println("Quantity: "+qty);
	       System.out.println("Total: "+total);
	   }
	   public void displayItem()
	   {
	       System.out.println("Name: "+name);
	       System.out.println("Description: "+desc);
	       System.out.println("Price: "+price);
	   }
	
}
