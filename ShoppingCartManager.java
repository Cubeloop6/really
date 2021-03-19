package cs141.mxchida;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartManager {
	
	  public static void main (String[] args) 
	   {
	       ArrayList<Item> items = new ArrayList();
	       items.add(new Item("item1", "desc1", 1.0));
	       items.add(new Item("item2","desc2",2.0));
	       items.add(new Item("item3","desc3",3.0));
	       items.add(new Item("item4","desc4",4.0));
	      
	       Scanner obj = new Scanner(System.in);
	       String name;
	       System.out.println("Enter you name: ");
	       name = obj.nextLine();
	      
	       ShoppingCart user=new ShoppingCart(name);
	      
	       Character ch='y';
	       while(ch=='y')
	       {
	           System.out.println("Menu: ");
	           System.out.println("1. Add an item");
	           System.out.println("2. Remove an item");
	           System.out.println("3. Change item quantity");
	           System.out.println("4. Display items' names and descriptions");
	           System.out.println("5. Display carts' contents");
	          
	           int choice;
	           choice = obj.nextInt();
	          
	           if(choice==1)
	           {
	               int id,qty;
	               System.out.println("Enter item number: ");
	               id = obj.nextInt();
	               System.out.println("Enter quantity: ");
	               qty = obj.nextInt();
	              
	               Item item=new Item(items.get(id-1).name,items.get(id-1).desc,items.get(id-1).price,qty);
	               user.addItem(item);
	           }
	           else if(choice==2)
	           {
	               int id;
	               System.out.println("Enter cart item number: ");
	               id = obj.nextInt();
	               user.removeItem(id);
	           }
	           else if(choice==3)
	           {
	               int id,qty;
	               System.out.println("Enter cart item number: ");
	               id = obj.nextInt();
	               System.out.println("Enter quantity: ");
	               qty = obj.nextInt();
	               user.changeQty(id,qty);
	           }
	           else if(choice==4)
	           {
	               for(int i=0;i<items.size();i++)
	               {
	                   Item item = items.get(i);
	                   System.out.println(i+1);
	                   item.displayItem();
	               }
	           }
	           else if(choice==5)
	           {
	               user.displayCart();
	           }
	          
	           System.out.println("Want to continue(y/n): ");
	           ch = obj.next().charAt(0);
	       }
	   }
	
	
	
	
}
