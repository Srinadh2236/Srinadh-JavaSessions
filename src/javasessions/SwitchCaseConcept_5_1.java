package javasessions;

public class SwitchCaseConcept_5_1 {

	public static void main(String[] args) {

		
		// cntrl+space then enter for switch syntax 
//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		String browser = " Chrome   ";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome browser");
			break;

		case "firefox":
			System.out.println("launch firefox browser");
			break;
		case "edge":
			System.out.println("launch edge browser");
			break;
		case "ie":
			System.out.println("launch ie browser");
			break;

		default:
			System.out.println("please pass the right browser :" + browser);
			break;
		}

		char ch = 'u';
		switch (ch) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;
		default:
			System.out.println(ch + "is consonat");
			break;
		}
	}

}
