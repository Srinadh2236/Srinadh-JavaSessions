package WebDriverArch;

public interface webDriver {
	
	public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendKeys(String element,String value );
	
	public void close();
	
}
