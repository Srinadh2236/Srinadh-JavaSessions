package BuilderPattern;

public class testLoginPage {

	public static void main(String[] args) {
	
		//normal way to call class methods by creating the objects and with the reference name we will call
//		loginPage lp = new loginPage();
//		lp.login();
//		lp.home();
//		lp.search("Tshirt", 1000);
//		lp.addToCart();
//		lp.doPayment("@icici");
//		lp.order();
//		lp.logOut();
		
		// builder pattern we will use return this keyword with return type is class name
		
		// so here
		//lp.login().home().search("lense", 399).addToCart().doPayment("icic").order().logOut()
		
		//and patter are showing right login after home after search and addtocart....logout.
		loginPage lp = new loginPage();
		
		lp.login()
			.home()
				.search("Bike", 300000)
					.addToCart()
						.doPayment("@icici")
							.order()
								.logOut();
		
		// some other pattern 
		lp.login()
			.order()
				.doPayment("@icici")
					.logOut();
		
		//we can easily find out pattern from login to logout which method callled..
		lp.login()
			.search("car", 1200000)
				.addToCart()
					.logOut();
		//
		lp.login()
			.logOut();
		
	}

}
