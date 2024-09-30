package DataConverstion;

import java.util.Arrays;

public class dataTest {

	public static void main(String[] args) {

		// String to Int
		String st = "100";
		int a = Integer.parseInt(st);
		System.out.println(a + 200);

		String str = "100";
		int b = Integer.parseInt(str);

		System.out.println(b + 10);
		String sat = "100A";
		String av = sat.replace("A", "");// removed A from sat and stored in av ,
		int x = Integer.parseInt(av);
		System.out.println(av);
		System.out.println(x + 20);

		// String to boolean

		String s = "true";
		boolean bn = Boolean.parseBoolean(s);

		System.out.println(bn);// true

		if (bn) {
			System.out.println("pass");
		}

		String sg = "false";
		boolean bb = Boolean.parseBoolean(sg);
		System.out.println(bb);// false
		if (bb) {
			System.out.println("pass");
		}
		{
			System.out.println("failed");
		}

		// String to double

		String sl = "10.22";

		double ds = Double.parseDouble(sl);
		System.out.println(ds + 100);// 110.22

		// int to String

		int a1 = 100;

		String a2 = String.valueOf(a1);
		System.out.println(a2 + 100);// 100100

		// double to string

		double f = 10.22;

		String f1 = String.valueOf(f);
		System.out.println(f1 + 100);// 10.22100

		// boolean to String

		boolean m = true;

		String m1 = String.valueOf(m);

		System.out.println(m1 + 100);// true100

		// char array to String
		
		char ch[]= {'s','e','l','e','n','i','u','m'};
		
		String ch1=String.valueOf(ch);
		
		System.out.println(ch1);
		
		
		String v ="\"I love \"java\" code\"";
		System.out.println(v);//"I love "java" code"

		
		String dat ="Naveen.Alice.985859855895.hyd.india";

		String chd []=dat.split("\\.");	
		
		System.out.println(Arrays.toString(chd));
		
	}

}
