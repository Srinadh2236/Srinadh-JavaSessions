package javasessions;

public class EmployeeSheet {

	// Method Over loading : poly(many) + morphism(form)
	// with in same class if we have multiple methods
	// 1.method name should be same
	// 2.and but different parameters
	// 3.and different sequence (if paramerets are same then only sequence will
	// applicapble)
	//
//imp	//4. return type doesn't matter (int double float string boolean ) anything doesn't matter

	public int test() {// 0 parameters
		System.out.println("test  1 method");
		return 100; // return type doesnot matter anything (int double float string boolean ) for
					// any method
	}

	public void test(int a) {// 1 parameter
		System.out.println("test 2 method");
	}

	public void test(int a, int b) {
		System.out.println("test 3 method");

	}

//	public void test(int x, int y) { // duplicate method bcz method variable are same int int passing the values
//		
//	}
	public void test(String x) {
		System.out.println("test 4  method");
	}

	public void test(String x, String y) {// 2 string parameters

	}

	public void test(int a, String x) {// 2 parameters

	}

	public void test(String x, int a) {// 2 parameters both are different because of sequence is different

	}

	/// use case for overloading --> same method but different parameters
	// 1.login
	public void login() {

	}

	public void login(String n, String p) {

	}

	public void login(String n, String p, int otp) {

	}

	// search
	public void search() {
		// by default home page launch
	}

	public void search(String prtName, String prtClr) {

	}

	public void search(String productName, String productClr, int priceRange) {
		System.out.println("Search with " + productName + "colour is " + productClr + "price is:" + priceRange);
	}
	// payment use case

	public void doPayment(String Upi) {

	}

	public void doPayment(String name, int cvv) {

	}

	public void doPayemnt(String name, int cvv, int otp) {

	}

	// Uber car booking
	public void carBooking(String stPoint, String endPoint) {

	}

	public void carBooking(String stPoint, String endPoint, String carType) {

	}

	public void carBooking(String stPoint, String endPoint, String carType, int passengers) {

	}

	//

	public Double calculateTax(int totalIncome, int bonus, int StockProfit) {

		System.out.println("Calculate the tax");

		double totalTax = (totalIncome * 20) / 100 + (bonus * 15) / 100 + (StockProfit * 2) / 100;
		return totalTax;
	}

	public Double calculateTax(int totalIncome, int bonus) {

		System.out.println("Calculate the tax without stocks ");

		double totalTax = (totalIncome * 20) / 100 + (bonus * 15) / 100;
		return totalTax;
	}
	
	//void with blank return
	public void click(String element) { // these are void return nothing
		System.out.println("click element"+ element);
		return;
	}

	public static void main(String[] args) {

		EmployeeSheet obj = new EmployeeSheet();
		int m = obj.test();// test 1 method compiler will understand there is no parameters so one method
							// will execute
		System.out.println(m);
		obj.test(95);// test 2 method executing

		obj.test("naveen");// test 4 executing

		// search
		obj.search("Tshirt", "Yellow", 5000);

		// calculate tax
		
	double	etax=obj.calculateTax(1500, 2500);
		System.out.println(etax);
		
		obj.calculateTax(1500, 2500, 50000);
	}

}
