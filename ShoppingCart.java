package cs141.mxchida;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ShoppingCart {

	   String name;
	   String date;
	   ArrayList<Item> cart;
	  
	   public ShoppingCart(){}
	   public ShoppingCart(String n)
	   {
	       name=n;
	       LocalDate localDate = LocalDate.now();
	       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	       date=dtf.format(localDate);
	       cart = new ArrayList();
	   }
	   public void addItem(Item item)
	   {
	       cart.add(item);
	       item.showTotal();
	   }
	   public void removeItem(int id)
	   {
	       cart.remove(id-1);
	   }
	   public void changeQty(int id,int qty)
	   {
	   Item item = cart.get(id-1);
	       cart.get(id-1).qty = qty;
	       item.showTotal();
	   }
	   public void displayCart()
	   {
	       System.out.println(name);
	       System.out.println(date);
	       for(int i=0;i<cart.size();i++)
	       {
	           System.out.println(i+1);
	           Item item = cart.get(i);
	           item.displayItem();
	           item.showTotal();
	       }
	   }
}
