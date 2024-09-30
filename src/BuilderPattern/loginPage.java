package BuilderPattern;

public class loginPage {
	//normal way  vs builderPattern
	
//	public void login() {
//		System.out.println("Logged in successfully");
//		
//	}
//	public void home() {
//		System.out.println("Home page");
//	}
//	
//	public void search(String Pname,int price) {
//		System.out.println("search product "+" "+ Pname+" price "+ price);
//	}
//	
//	public void addToCart() {
//		System.out.println("Product added successfully");
//	}
//	
//	public void doPayment(String Upi) {
//		System.out.println("payment with Upi :"+Upi);
//	}
//	public void doPayment(String cc,int cvv) {
//		System.out.println("payment with credit card :"+cc+" Cvv no:"+cvv);
//	}
//	public void order() {
//		System.out.println("order plyced successfully");
//	}
//	public void logOut() {
//		System.out.println("LogOut ");
//	}
	
//	Builder pattern
	public loginPage login() {
		System.out.println("Logged in successfully");
		return this;
	}
	public loginPage home() {
		System.out.println("Home page");
		return this;
	}
	
	public loginPage search(String Pname,int price) {
		System.out.println("search product "+" "+ Pname+" price "+ price);
		return this;
	}
	
	public loginPage addToCart() {
		System.out.println("Product added successfully");
		return this;
	}
	
	public loginPage doPayment(String Upi) {
		System.out.println("payment with Upi :"+Upi);
		return this;
	}
	public loginPage doPayment(String cc,int cvv) {
		System.out.println("payment with credit card :"+cc+" Cvv no:"+cvv);
	return this;
	
	}
	public loginPage order() {
		System.out.println("order plyced successfully");
	return this;
	}
	public loginPage logOut() {
		System.out.println("LogOut ");
		return this;
	}
	
}
