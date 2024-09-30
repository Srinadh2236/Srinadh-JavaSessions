package Assignments;

public class carCon {
	String make;
	String model;
	int year;
	
	public carCon(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
		
	}
	
	public carCon() {
		
		this.make="Unknown";
		this.model="Unknown";
		this.year=-1;
		
	}
	
	
	
	

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		
		
		carCon cn = new carCon("Toyota","creamy",2024);
		carCon cn1 = new carCon("Honda","white",2024);
		carCon cn2 = new carCon();
		
		
		System.out.println("car1 :");
		
		System.out.println("Make :"+cn.getMake());
		System.out.println("Model :"+cn.getModel());
		System.out.println("year :"+cn.getYear());
		System.out.println("car2: ");
		System.out.println("Make :"+cn1.getModel());
		System.out.println("Model :"+cn1.getModel());
		System.out.println("year :"+cn1.getYear());
		System.out.println("car3: ");
		System.out.println("Make :"+cn2.getModel());
		System.out.println("Model :"+cn2.getModel());
		System.out.println("year :"+cn2.getYear());
		
		
		
	}

}
