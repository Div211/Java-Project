package edu.jasp.store.view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edu.jasp.store.controller.controller;
import edu.jasp.store.model.Product;
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
		System.out.println("1.Display store information\n2.Add product\n3.Display all product\n4.Remove product\n5.Remove Product\n6.Add products\n0.Exit");
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
			controller.addProduct(getProductDetails());
			System.out.println(store.getProducts());
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			if(store.getProducts() != null) 
				controller.addProducts(addProducts());
			else
			controller.addProducts(addProducts());
			System.out.println(store.getProducts());
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}while(true);
	
	}
	public static Product getProductDetails() {
		System.out.println("Enter id: ");
		int productId = myInput.nextInt();
		myInput.nextLine();
		System.out.println("Enter name: ");
		String productName = myInput.nextLine();
		System.out.println("Enter price: ");
		double productPrice = myInput.nextInt();
		myInput.nextLine();
		System.out.println("Enter Quantity: ");
		int productQuantity = myInput.nextInt();
		myInput.nextLine();
		boolean productAvailibility = true;
		if(productQuantity<=0) {
			productAvailibility = false;
		}
		return new Product(productId, productName, productPrice, productQuantity, productAvailibility);
	}
	
	public static List<Product> addProducts() {
		ArrayList<Product> newProductList = new ArrayList<Product>();
		boolean toContinue = true;
		do {
			newProductList.add(getProductDetails());
			System.out.println("Continue adding products ? y/n: ");
			if(myInput.next().charAt(0)=='n') 
				toContinue = false;
			}while(toContinue);
			return newProductList;
		}
}
