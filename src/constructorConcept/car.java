package constructorConcept;

public class car {
	String name;
	String color;
	double price;
	String model;
	String chasisNumber;

	public car(String name, String color) {

		this.name = name;
		this.color = color;
	}

	public car(String name, double price) {

		this.name = name;
		this.price = price;
	}

	public car(String name, String color, double price, String model, String chasisNumber) {

		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
		this.chasisNumber = chasisNumber;
	}

	public static void main(String[] args) {
	
		car c1= new car("BMW","White");
		car c2= new car("Audi",50.22);
		car c3= new car("Breza","Red",14.20,"top","1254sdn55");
		
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+c1.model+" "+c1.chasisNumber);
		System.out.println(c2.name+" "+c2.price+" "+c2.color+" "+c2.model+" "+c2.chasisNumber);
		System.out.println(c3.name+" "+c3.price+" "+c3.color+" "+c3.model+" "+c3.chasisNumber);
	}

}
