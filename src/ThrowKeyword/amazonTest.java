package ThrowKeyword;


public class amazonTest {

	public static void main(String[] args) {

		String browser ="Naveen";
		
		switch (browser) {
		case "chrome":
			System.out.println("chrome launched");
			break;
		case "firefox":
			System.out.println("firefox launched");
			break;
		case "safari":
			System.out.println("safari launched");
			break;
		case "ie":
			System.out.println("ie launched");
			break;

		default:
			
			System.out.println("please pass the right browser:"+browser);
			// i want to throw exception browser is in valid i dn't want to continue.
			 throw new myExceptions("=========Wrong Browser Passed=========");//  it will terminate the program 
			
		}
		
		
		System.out.println("launch url..!!");
		System.out.println("launch the amazon app");
		System.out.println("shop a product");
		System.out.println("close browser...!!!");
		
	}

}
