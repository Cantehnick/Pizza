package by.htp.pizza;

import java.util.Scanner;

public class ConsoleInput {

Pizza pizza=new Pizza();
	
	public int readIntTitle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose a Pizza ");

		pizza.title = sc.nextInt();
		return pizza.title;
	}

	public int readIntSize() {
		Scanner in = new Scanner(System.in);

		System.out.println("Choose a size 1 - 15 sm   2 - 32 sm  3 - 45sm");

		pizza.size= in.nextInt();
		return pizza.size;
	}

	public Pizza ForPizza() { // getting properties for delivery

	

		Scanner in = new Scanner(System.in);
		System.out.println("Input street :");
		in = new Scanner(System.in);
		pizza.nameS = in.nextLine();

		System.out.println("Input house :");
		in = new Scanner(System.in);
		pizza.numberH = in.nextInt();

		System.out.println("Input flat :");
		in = new Scanner(System.in);
		pizza.flat = in.nextInt();

		return pizza;
	}

	public void cook(Pizza pizza){
	 			
	 			System.out.println("Cooking " + pizza.NamePizza(pizza.title) + " pizza" + " of " + pizza.SizePizza(pizza.size) + " size");
	 			
	 			System.out.println("Creating pizza stub of " + pizza.SizePizza(pizza.size) + " size");
	 			
	 			System.out.println("Pizza is ready!"); 			
	 			
	}
	
public void deliveryPizza(Pizza pizza){
		
		System.out.println("Delivering pizza at adres " + pizza.nameS + " " + pizza.numberH + ", " + pizza.flat);

}

}