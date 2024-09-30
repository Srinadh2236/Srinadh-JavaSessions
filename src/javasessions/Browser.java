package javasessions;

public class Browser {
	
	//WAF launch Browser(String Bname)//Browser Name
	//Bname: chrome,edge,safari,firefox 
	// print success message and retun boolen true/false
	
	public boolean launchBrowser(String Bname) {
		System.out.println("Browser name :" +Bname);
		boolean flag=true;
		switch (Bname.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome browser launched");
			break;
		case "Edge":
			System.out.println("edge browser launched");
			break;
		case "safari":
			System.out.println("safari browser launched");
			break;
		case "firefox":
			System.out.println("firefox browser launched");
			break;

		default:
			System.out.println(" Please pass the valid browser :"+ Bname);
			 flag =false;
			 break;
		}
		
		return flag;
	}

	public static void main(String[] args) {
		
		Browser obj= new Browser();
		boolean  exe=obj.launchBrowser("edge");
		System.out.println(exe);
		
		if(exe) {
			System.out.println("enter the url");
		}
		
		
		
		
	}

}
