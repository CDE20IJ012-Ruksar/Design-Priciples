package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Welcome to our site. Would you like to order or repair?");
		Scanner scanner=new Scanner(System.in);
		String choice=scanner.next();
		switch(choice) {
		case "order":System.out.println("Enter the phone model name");
					 String orderName=scanner.next();
					 Ordering order=new Ordering();
					 order.ProcessOrder(orderName);
					 break;
		case "repair":System.out.println("Is it phone or the accessory that you want to be repaired");
		 			  String productType=scanner.next();
		 			  if(productType.equals("phone")) {
		 				 System.out.println("Please provide the phone model name");
						 String modelName=scanner.next();
						 PhoneRepairing phone=new PhoneRepairing();
						 phone.ProcessPhoneRepair(modelName);
		 			  }
		 			  else {
		 				 System.out.println("Please provide the accessory detail, like headphone,tempered glass");
						 String accessoryType=scanner.next();
						 AccessoryRepairing phone=new AccessoryRepairing();
						 phone.ProcessAccesingRepair(accessoryType);
		 			  }
		 			  break;
		default:break;
		}
	}
}
