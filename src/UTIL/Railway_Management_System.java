package UTIL;

import java.util.*;

public class Railway_Management_System {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Age");
		int age=sc.nextInt();
		System.out.println("Enter The Gender");
		String Gender=sc.next();
		System.out.println("Enter The Ticket_Price");
		int Ticket_Price=sc.nextInt();
		double discount;
		if(age<5)
		{
			System.out.println("The Ticket is Free");
			}
		else if(age>=60) {
			discount=Ticket_Price*0.40;
			System.out.println("Discount is: "+discount);}
		else if(Gender.equals("Female")) {
			discount=Ticket_Price*0.25;
			System.out.println("Discount is: "+discount);}
		
		else if(Gender=="Male") {System.out.println("No Discount"); 
		}
		else
		{System.out.println(" NO Discount ");}
			
			
	}

}
