package Abstraction;

public class Test {

	public static void main(String[] args) {
		
		login lp = new login();
		
		lp.title();
		lp.url();
		lp.doLogin();
		lp.loading();
		
		// object creation of abstract class not allowed 
		// and interface also we cant create object 
		//Page p = new Page();// cant be initiate 
		
		
		
		// topcasting:
		
		Page p = new login();
		p.title();
		p.url();
		p.loading();
		p.dispalyLog();
	}

}
