package WebDriverArch;

public class AmazonTest {

	public static void main(String[] args) {
		

		//chromeDriver driver = new chromeDriver();
		
		//firefoxDriver driver = new firefoxDriver();
		
		//safariDriver driver = new safariDriver();

		
		//cross browser logic : top casting 
		String  browserName ="chrome"; // some were im getting this file xml, some were its coming im simply writing here
		
		//top casting  
		webDriver driver = null;
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			//webDriver driver =new chromeDriver();
			driver = new chromeDriver();
			break;
		case "firefox":
			//webDriver driver =new chromeDriver();
			driver = new firefoxDriver();
			 break;
		case "safari":
			//webDriver driver =new chromeDriver();
			driver = new safariDriver();
			 break;

		default:
			System.out.println(" please pass the valid browser "+ browserName );
			break;
		}
		
		
		
		
		driver.get("https://google.com");
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		
		driver.sendKeys("search Files", "Naveen automation labs");
		
		driver.click("Search icon");
		
		driver.close()	;
		
		
		
	}

}
