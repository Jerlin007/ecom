package com.wip.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.wip.controller.ProductController;
import com.wip.controller.ProductInterface;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Welcome to Ecom - App !!");
		ProductInterface pc = new ProductController();
		Scanner sc = new Scanner(System.in);

        
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		BiPredicate<String, String> pr = (un, pwd) -> {
			try {
				System.out.println("Enter your username: ");
				un = br.readLine();
				System.out.println("Enter your password: ");
				pwd = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return un.equals("user123") && pwd.equals("user123");
		};
		System.out.println("Enter your details");
		//System.out.println(pr.test("user123", "user123"));
		
        if(pr.test(null, null)) {
        	System.out.println("Invalid Credentials");
        } while (!pr.test(null, null));
        	
    		String continueChoice=null;
    				do {
    					System.out.println("Enter your choice:");
    					System.out.println("1. Add Product");
    					System.out.println("2. View Product");
    					System.out.println("3. Add Elec. Product");
    					System.out.println("4. View Elec. Product");
    					System.out.println("5. Update Product");
    					System.out.println("6. Delete Product");
    					int choice = sc.nextInt();
    					switch (choice) {
    					case 1: {
    						pc.addProduct();
    						break;
    					}
    					case 2: {

    						pc.viewProduct();
    						break;
    					}
    					case 3: {

    						pc.viewProduct();
    						break;
    					}
    					case 4: {

    						pc.viewProduct();
    						break;
    					}
    					case 5: {

    						pc.updateProduct();
    						break;
    					}
    					case 6: {

    						pc.deleteProduct();
    						break;
    					}
    					default: {
    						System.out.println("Choose the right choice ....");
    					}
    					}
    					System.out.println("Do u wanna to continue? Y or y");
    					continueChoice = sc.next();
    				} while (continueChoice.equals("Y") || continueChoice.equals("y"));
    				
    				System.out.println("Thanks for using the system...");
    				sc.close();

       
		
	}

}


