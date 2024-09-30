package DataConverstion;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class dataConvert {

	public static void main(String[] args) {

		//String to int;
		System.out.println("=============String to int;===============");
		String s ="100";
		System.out.println(s+20);//10020 because of 100 is string so it appending 20 to the 100.o/p :10020
		// so i want to convert the data string to int.
		int j=Integer.parseInt(s);// Integer is class and paseInt is method to convert to int .
		
		System.out.println(j+20);//120
		
		String f="200";
		int f1=Integer.parseInt(f);
		System.out.println(f1+20);//220;
		
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648
		
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MIN_VALUE);//-128
		
		String k="100A";
//		int k1=Integer.parseInt(k);//NumberFormatException it wnt convert the data , it will through the exception.
//		System.out.println(k1+20);
//		
		//so string data must be in numbers only so i want to remove the A from 100A;
		
		String  k2=k.replace("A", "");
		System.out.println(k2); // now String ="100"; so we can easily convert to int .
		
		int f2=Integer.parseInt(k2);
		System.out.println(f2+20);//120
		
		String totalPrice ="1000";
		int price=	Integer.parseInt(totalPrice); //1000
		System.out.println(price - 100);//900;
		
		String tp ="1AB000";
		int tp1=Integer.parseInt(tp.replace("AB", ""));//1000
		System.out.println(tp1-100);//900
		
		//string to double
		
		System.out.println("===================string to double======================");
		String m="100.33";
		System.out.println(m+20);//100.3320 but expect o/p is 120.33
		// so we do convertion from string to double 
		double m1=Double.parseDouble(m); // Double wrapper class with the parseDouble method.
		System.out.println(m1+20);//120.33
		
		
		System.out.println("=======================String to boolean===========================");
		//String to boolean
		
		String b="true";
		boolean b1=	Boolean.parseBoolean(b);
		System.out.println(b1);//true
		
		if (b1) {
		System.out.println("PAss");
		}
		
		String fa="false";
		Boolean f11=Boolean.parseBoolean(fa);
		System.out.println(f11);
		
		if(f11){
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
//		
	//	String to int , double,boolean
//		Integer.parseInt(s);
//		Double.parseDouble(s);
//		Boolean.parseBoolean(s);
//		
		
		System.out.println("========================int to String ==========================");
		//int to String 
		int t=100; // i want to convert to String "100";
		System.out.println(t+20);//120 i want 10020;
		
		String tt=String.valueOf(t);// any data type we can convert into String.
		System.out.println(tt+20);//10020
		
		int i=1000;
		String i1=String.valueOf(i);// here we converted into int to string .
		System.out.println(i1+100);//1000100;
		
		int i2 =300;
		String i3=String.valueOf(i2);
		System.out.println(i3+200);//300200
		
		//doubel to string
		System.out.println("=================doubel to string=================");
		double marks =100.33;
		String mk=String.valueOf(marks);
		System.out.println(mk+200);//"100.33200"
		
		
		//char to String
		System.out.println("=======================char to String============================");
		char ch='A';
		String cs=String.valueOf(ch);
		System.out.println(cs+100);//"A100"
		
		
		// boolean to string
		
		boolean bk =true;
		
		String bk1=String.valueOf(bk);
		System.out.println(bk1+100);//"true100";
		
		//char array to String
		
		char cd[]= {'s','e','l','e','n','i','u','m'};
		String c=String.valueOf(cd);
		System.out.println(c);//selenium
		
		
		Integer v =100;
		//v.valueOf(v);
		int v1=	v.valueOf(v);
		System.out.println(v1);
		
		//
		
		//String rest="I Love java code"; // i love "java" code;
		
		String rest ="I Love \"java\" code"; // here \ is escaping the " in String
		System.out.println(rest);//I Love "java" code

		String rest1 ="I Love \"java\" \"co\" \"d\"e";
		System.out.println(rest1);// I Love "java" "co" "d"e
	
		
		String data ="Naveen;Alice;985859855895;hyd;india";
		
		// here i want to spilt.
		
		String a[]=data.split(";");
		System.out.println(Arrays.toString(a));
		
		
		String dat ="Naveen.Alice.985859855895.hyd.india";
		//String bat1[]=dat.split(".");// here . is used for some other purpose so use \\. so that it will consider to spilt
		String bat1[]=dat.split("\\.");// then only we will get correct split.
		//System.out.println(bat1);// getting [Ljava.lang.String;@5b1d2887
		System.out.println(Arrays.toString(bat1));//[Naveen, Alice, 985859855895, hyd, india]
		
		
		String det ="Naveen|Alice|985859855895";
		String det1[]=det.split("\\|");
	System.out.println(Arrays.toString(det1));//[Naveen, Alice]
	}
	
	
	}


