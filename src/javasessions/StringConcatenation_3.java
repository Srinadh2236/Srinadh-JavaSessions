package javasessions;

public class StringConcatenation_3 {

	public static void main(String[] args) {
		//System.out.println("srinadh is blessing with durgamma");
		
		// Range of ASCII values
		//a-z = 97 to 122
		//A-Z = 65 to 90
		//0-9 = 48 to 57
		
		String name = "Srinadh";
		String gg ="1000";// if we write any number in " double quotes is treated as string " so here 1000 is string not number.
		System.out.println(name);

		String x = "Hello";
		String y = "selenium";
		
		int a =100;
		int b =200;
		
		System.out.println(a+b);//300
		System.out.println(x+y);//Helloselenium
		System.out.println(x+a);//Hello100 (here when ever doing operation with x is string + number it will concatenation 
		System.out.println(a+x);//100Hello
		System.out.println(a+b+x);//300Hello
		System.out.println(a+b+x+y);//300Helloselenium
		
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
	
		System.out.println("the value of a " + a); // with in double quotes is string so is concatination 
		System.out.println("the value of b " + b); 
		System.out.println("the sum of a and b is " + a+b);// the sum of a and b is 100200 
		System.out.println("the sum of a and b is " + (a+b));//the sum of a and b is 300
		
		
		char ch = 'a';
		String str = "selemium";
		System.out.println(str + ch);//"selenium"
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1+c2);//ASCII 97+98=195 here two char do a arthamatic operation ASCII values will use.
		
		// Range of ASCII values
		//a-z = 97 to 122
		//A-Z = 65 to 90
		//0-9 = 48 to 57

		System.out.println('A' + 'B' );//65+66=131
		System.out.println(c1);/// i want to print a ASCII value so
		System.out.println((byte)c1);//97
		System.out.println((byte)'$');//36
		System.out.println((byte)'*');//42
		System.out.println('$');

	}

}
