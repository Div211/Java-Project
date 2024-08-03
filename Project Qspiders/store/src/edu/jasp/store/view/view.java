package edu.jasp.store.view;

import java.util.Scanner;

import edu.jasp.store.controller.controller;
import edu.jasp.store.model.Store;

public class view {
	static Scanner myInput = new Scanner(System.in);
	static controller controller = new controller();
	static Store store = controller.getStore();
	static {
		System.out.println("------- Welcome to store --------");
		System.out.println("Enter id");
		store.setId(myInput.nextInt());
		myInput.nextLine();
		System.out.println("Enter name");
		store.setName(myInput.nextLine());
		System.out.println("Enter number");
		store.setContact(myInput.nextLong());
		myInput.nextLine();
		System.out.println("Enter Address");
		store.setAddress(myInput.nextLine());
		System.out.println();
		
	}
	
	public static void main(String[] args) {
	do {
		System.out.println("Select option from below list: ");
		System.out.println("1.Display store information\n2.Add product\n3.Display all product\n4.Remove product\n0.Exit");
		System.out.println("Enter digit respective to desired option: ");
		byte userChoice = myInput.nextByte();
		myInput.nextLine();
		switch(userChoice) {
		case 0: 
			System.out.println("- - - - Exited - - - -");
			System.exit(0);
			break;
		case 1:
			System.out.println("Store: "+store+"\n");
			break;
		case 2:
			System.out.println(store.getProducts());
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}while(true);
	
	}
	
	 
}
