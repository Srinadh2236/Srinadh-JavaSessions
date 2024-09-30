package javasessions;

public class NestedIFconditions {

	public static void main(String[] args) {
		int marks = 97;
		if(marks>=90) {
			System.out.println("Grade A ");
			if(marks>=97) {
				System.out.println("100% scholership");
				if(marks==100) {
					System.out.println("tution fee also free");
				}
				else {
					System.out.println("10%  free");
				}
			}
		}
		else {
			System.out.println("inavalid marks");
		}
		
		//if--elseif--elseif--else
		
//		String browser ="chrome";
//		
//		if (browser.equals("chrome")) {
//			System.out.println("chrome is lunched");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("firefox is launced");
//		}
//		if(browser.equals("edge")) {
//			System.out.println("edge is launced ");
//	
//		}
//		if(browser.equals("ie")) {
//			System.out.println("ie is launched");
//		}
//		else
//		{
//			System.out.println("please pass the valid browser : " + browser);
//		}
		
		String browser = "ch";
		
		if(browser.equals("chrome")) {
			
			System.out.println("chrome is lunched");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("firefox is launced");
		}
		else if (browser.equals("edge"))
		
		{
			System.out.println("edge is launced");
		}
		else if (browser.equals("ie"))
			
		{
			System.out.println("ie is launced");
		}
		else 
			
		{
			System.out.println("please pass the valid browser :" + browser);
		}
	}

}
