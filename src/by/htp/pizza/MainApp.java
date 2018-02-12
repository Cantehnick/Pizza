package by.htp.pizza;



public class MainApp {

	public static void main(String[] args) {

		System.out.println("Hello!");
		String a[] = { "1  Pepperoni   ", "2  Italia  ", "3  4 Seazon   ", "4  Margaritta " };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.println();
		}

		ConsoleInput input = new ConsoleInput();

		Pizza pizza = new Pizza();

	 pizza.title = input.readIntTitle();
	pizza.size = input.readIntSize();
		String NamePizza = pizza.NamePizza(pizza.title);
		int SizePizza=pizza.SizePizza(pizza.size);

		System.out.println("You Choose :  " + NamePizza+"  "+SizePizza+" sm");
		
		ConsoleInput house = new ConsoleInput();
		   house.cook(pizza);
	        pizza = house.ForPizza();
	      house.deliveryPizza(pizza);

	}
}