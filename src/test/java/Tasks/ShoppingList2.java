package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList2 {
public static void main(String[] args) {
	/*
	In this assignment, you will write a program that 
	will generate a shopping list. It's more advanced 
	version of assignment #22 (Shopping list I).

	Your program should ask use to enter items 
	followed by its price. After adding item,  
	ask user if he wants to add one more item. 
	If so, repeat previous steps again. If no, 
	print shopping list report and total price 
	as show in examples. Your program should accept 
	up to 10 items. 
	}
	 */
	
	
	 Scanner scan = new Scanner(System.in);
	
	 double totalPrice = 0;
	 int count = 1;
	 String shoppingListReport = "";
	 String countinue = "";
	 String item = "";
	 double price = 0;
	 
	 do  {
		
		 System.out.println("Enter Item" + count + " and its price:");
         item=scan.next();
         price= scan.nextDouble();
          totalPrice +=price;
          shoppingListReport+="Item"+count+": "+item+" Price: "+price;
          System.out.println("Add one more item?");
          countinue=scan.next();
           count++;
           if (countinue.equals("yes")&& count<11) {
               shoppingListReport+=", ";
           }else {
               break;
           }
     } while (countinue.equals("yes"));
     System.out.println(shoppingListReport);
     System.out.println("Total price: "+totalPrice);

	 
	
}
}
