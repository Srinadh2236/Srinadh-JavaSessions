package StringManipulations;

import java.util.Arrays;

public class StringM {

	public static void main(java.lang.String[] args) {
		
		String str = "hi this is my java code and i am so happy";
						
			System.out.println(str.charAt(5));
			
			System.out.println(str.charAt(0));
		
			System.out.println(str.indexOf('j'));
			
			System.out.println(str.length());
			
			System.out.println(str.charAt(40));
		
			System.out.println(str.charAt(20));//o
			
			System.out.println(str.charAt(11));//m
			
			System.out.println(str.charAt(25));//n
			
			char  m = str.charAt(25);
			System.out.println("charector at 25 position is: "+m);
			
			System.out.println(str.charAt(33));//s
			
		char m2=str.charAt(33);
		System.out.println("charector at 33 position is :"+m2);//s
		
		System.out.println(str.indexOf('j'));//14
		System.out.println(str.indexOf('v'));//16
		
		System.out.println(str.indexOf('y'));//12
		System.out.println(str.indexOf('p'));//38
		
		System.out.println(str.indexOf('c'));//19
		System.out.println(str.indexOf('o'));//20
		System.out.println(str.indexOf('d'));//21
		System.out.println(str.indexOf('e'));//22
		
		// 2nd occurrence
		
		System.out.println(str.indexOf('i', 2));//5
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		
		int m1=str.indexOf('i', str.indexOf('i')+1);
		System.out.println(m1);
		
		System.out.println(str.indexOf('i', m1+1));
		
		int ty =str.indexOf('i', m1+1);
		System.out.println(ty);
		System.out.println(str.indexOf('i', ty+1));
		
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.contains("java"));
		
		String msg ="welcome admin";
		
		if (msg.indexOf("admin")>0) {
			System.out.println("admin is present");
		}
		
		String st="10-11-1990";
		System.out.println(st.replace('-', '/'));
		
		
		String ss ="welcome java code";
		String sss="welcome java code";
		if(ss.equals(sss)) {
			System.out.println("pass");
		}
		
		String lan="JAVA_PYTHON_RUBY_SELENIUM";
		
		String lh[]=lan.split("_");
		System.out.println(lh.length);
		System.out.println(lh[0]);
		System.out.println(lh[1]);
		System.out.println(lh[2]);
		System.out.println(lh[3]);
		
		System.out.println(Arrays.toString(lh));
		
		System.out.println("array;java;selenium;code".split(";")[2]);
	}

}
