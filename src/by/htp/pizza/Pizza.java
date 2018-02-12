package by.htp.pizza;

public class Pizza {

	public int title; // properties pizza
	public int size; // properties pizza
	String nameS = "";// delivery properties
	int numberH;// delivery properties
	int flat;// delivery properties

	public String Name1() {
		String pizza = "Pepperoni";
		return pizza;
	}

	public String Name2() {
		String pizza = "Italia";
		return pizza;

	}

	public String Name3() {
		String pizza = "4 Seazon";
		return pizza;

	}

	public String Name4() {
		String pizza = "Margaritta";
		return pizza;

	}

	public int size1() {
		int size = 15;
		return size;
	}

	public int size2() {
		int size = 32;
		return size;
	}

	public int size3() {
		int size = 45;
		return size;
	}

	public String NamePizza(int operation) {

		String pizza = "";
		switch (operation) {
		case 1:
			pizza = Name1();
			break;
		case 2:
			pizza = Name2();
			break;
		case 3:
			pizza = Name3();
			break;
		case 4:
			pizza = Name4();
			break;
		}
		return pizza;
	}

	public int SizePizza(int size) {
		int a = 0;
		switch (size) {
		case 1:
			a = size1();
			break;
		case 2:
			a = size2();
			break;
		case 3:
			a = size3();
			break;

		}
		return a;
	}

}
