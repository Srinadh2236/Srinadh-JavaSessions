package StringManipulations;

import java.util.Arrays;

public class stringManuplation {

	public static void main(String[] args) {
		
		
		String str ="hi this is my java code and i am so happy";
		
		
		//length of sting is 
		System.out.println(str.length());//41
		
		int len =str.length();
		
		System.out.println("Lowest index  :" + 0 );
		
		System.out.println("Highest index :" + (len-1));
		
		//charAt(value);
		System.out.println(str.charAt(0));//h we can find charector by uing charAt(0)
		System.out.println(str.charAt(3));//t
		System.out.println(str.charAt(40));//y
	    //System.out.println(str.charAt(41)); // SIOB error we went out side of range "String index out of range".
		//System.out.println(str.charAt(-1)); //SIOB
		//indexOf('h')
		System.out.println(str.indexOf('h')); //0  it is exact opposite of charAt(); same right.
		System.out.println(str.indexOf('t')); //3
		System.out.println(str.indexOf('y')); // first occurrence of string 
		
		//interview question
		// find the second occurrence of i
		System.out.println(str.indexOf('i',2 )); // hot coded value is 2 every time we cant hotcoded  so . we formulte .
		int c =str.indexOf('i'); // finding the i index number from that we can search next of i adding +1 it will search next of i;
		System.out.println(str.indexOf('i',c+1 ));//5
		
		// find the 3rd occurrence 
		
		int thrd =str.indexOf('i',c+1 ); // secnd value saved into another int +1 so it will search of next of i;
		System.out.println(str.indexOf('i', thrd+1)); // 8
		
		int frth =str.indexOf('i', thrd+1);
		System.out.println(str.indexOf('i', frth+1));//28 4rth occurrence of i ;
		
		
		// what if we search of string again we do same
		
		System.out.println(str.indexOf("java"));// java strating from the 14th position of index j.
		
		System.out.println(str.indexOf("hello"));// -1 if string "hello"  is no available in so that return -1 value;
		
		
		String msg = "welcome admin";
		
		System.out.println(msg.indexOf("admin"));// 8
		
		if(msg.indexOf("admin")>0) {
			System.out.println("admin present");
			
		}
		else {
			System.out.println("admin not present");
		}
		
		
		//
		
		String m1 ="By creating an account you will be able to shop faster,"
				+ " be up to date on an order's status, and keep track of the "
				+ "orders you have previously made.";
		
		if (m1.indexOf("shop faster")>0) {
			System.out.println("PASS");
		}
				
		//remove space left side and right side. bith side. by using trim();
		
		String t1 = "   hello world   ";
		System.out.println(t1.trim());//hello world

		
		// lowercase to uppercase
		
		String u1 = "hello java world";
		System.out.println(u1.toUpperCase());//HELLO JAVA WORLD
		System.out.println(u1.toLowerCase());//hello java world

		// replace method
		
		String dob ="01-01-1990";
		System.out.println(dob.replace("-", "/"));//01/01/1990
		
		// replace space with nothing
		
		String t2 = "   hello   world   ";
		System.out.println(t2.replace(" ", ""));//helloworld

		// contains: it will check it contains or not it will return true or false;
		
		String test="i love java coding";
		
		System.out.println(test.contains("java"));// true.   it will return boolean ;
		System.out.println(test.contains("Java"));// false because of case sensitive. it check exact same . and returns true or false
		
		if(test.contains("java")) {
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		//equals:
		
		String r1="Hello Selenium";
		String r2="Hello selenium";
		
		System.out.println(r1.equals(r2));//true
		System.out.println(r1.equalsIgnoreCase(r2)); // case sentive so it will ignore the cases
		
		//split
		
		String lan ="JAVA_PHYTHON_RUBY_JAVASCRIPT";
				   //JAVA|PHYTHON|RUBY|JAVASCRIPT; // Iam splitting  into based on _ ;
					// 0     1      2     3        // index of array
		
		 // iam spiltting and storing to an array lan.split("_"); 
		
		String lg[]= lan.split("_");
		System.out.println(lg[0]);// lg[0] index 0 is JAVA
		System.out.println(lg[3]);// lg[3] index 3 is JAVASCRIPT
		
		System.out.println(lg.length);
		
		// i want to print all arrays 
		
		System.out.println(Arrays.toString(lg)); //[JAVA, PHYTHON, RUBY, JAVASCRIPT]
		
		
		
		// interview question
		
		String pop ="xXHelloXxXseleniumxXtestingXxXGoogleX";// it will break based on xX so first itself is there so left nothing so result nothing
		
		String pp[]=pop.split("xX");
		System.out.println(pp[0]);// nothing
		System.out.println(pp[2]);
		
		System.out.println(Arrays.toString(pp));// [, HelloX, selenium, testingX, GoogleX]

		
		//we can write also like this.
		
		System.out.println("naveen;automation;labs".split(";")[0]);//naveen
		
		//
		
		String otp ="your otp number is 12345";
		
		String ot[]=otp.split(" ");
		
		int tr =ot.length-1; // is the highest index of number so we 
		//System.out.println(ot[ot.length-1]);
		System.out.println(ot[tr]);
		
		String d[]= new String[3];// lenght is 3
		d[0]="naveen";
		d[1]="pop";
		d[2]="test";
     //int dl=d.length;
    // System.out.println(dl);
		System.out.println(Arrays.toString(d));
		
	}

}
