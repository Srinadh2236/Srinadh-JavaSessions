package StringManipulations;

import java.util.Arrays;

import ThrowKeyword.myExceptions;

public class strManipulation {
	
	
	public static String reverse(String st)  {
		System.out.println(st);
		
		if(st==null) {
			throw new myExceptions("================NULL POINTER EXCEPTION==================");
			
		}
		
		if (st.length()==0 || st.length()==1){
			return st;
		}
		
		
		int ln =st.length();
		String rev="";
		
		for(int i =ln-1;i>=0;i--) {
		 rev =rev+st.charAt(i);	
			
		}
		
		
		return rev;
		
	}
	
	

	public static void main(String[] args) {
		
		//String m1 ="selenium";
		String m1 =null;
		
		String t =reverse(m1);
		System.out.println(t);
		
		String str = "hi this is my java code and i am so happy";
		
		System.out.println(str.length());
		System.out.println("LI:"+ 0);
		 int ln=str.length();
		System.out.println("HI:"+ (ln-1));
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(40));
		
		System.out.println(str.indexOf('i'));
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		int trd =str.indexOf('i', str.indexOf('i')+1);
		System.out.println(str.indexOf('i', trd+1));
		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("phty"));
		
		String st = "welcomeadmin";
		
		if(st.indexOf("admin")>0) {
			System.out.println("Pass");
		}
		
		//split
		
		String lang ="java_ruby_phython_javascript";
		
	String lan[]=lang.split("_");
	System.out.println(Arrays.toString(lan));
		
	System.out.println(lan.length);
	
	String s1="Hello";
	String s2 ="Hello";
	
	System.out.println(s1.concat(s2).concat("hekko"));
	
	String s3=s1.concat(s2).concat("hekko");
		
	System.out.println(	s3.replace("llo", " "));
	
	
	
	
	StringBuilder sb = new StringBuilder("Selenium");
	
	sb.append(" automation");
	
	String ss = new String ("Welcome");
    String  ss1 =ss.intern();
	
	
	System.out.println(sb);
	
	StringBuffer sf = new StringBuffer("Java");
	sf.append(" automation");
	System.out.println(sf);
	
	
	System.out.println(sf.reverse());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
