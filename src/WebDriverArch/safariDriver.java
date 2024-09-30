package WebDriverArch;

public class safariDriver  implements webDriver {

	public safariDriver() {
		System.out.println("Launch safari browser....");
	}
	
	@Override
	public void get(String url) {
		System.out.println("entering url : "+url);
	}

	@Override
	public String getTitle() {
		
		return "Google";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element :"+ element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering value : "+value + "into field "+ element);
	}

	@Override
	public void close() {
		System.out.println("closing browser");
	}

}
