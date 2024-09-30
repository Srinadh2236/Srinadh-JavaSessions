package StringManipulations;

import java.util.Arrays;

public class stringReverse {
	
	
	public static String reverse(String st) {
		
		if (st==null) {
			throw new NullPointerException("value cant be null");
		}
		
		if (st.length()==1 || st.length()==0) {
			return st;
		}
		
		//selenium
		int len =st.length();
		String rev="";
		for(int i=len-1; i>=0;i--) {
			rev =rev+st.charAt(i);
		}
		return rev;
	}

	public static String reverfnt(String st) {
		
		int ln=st.length();
		String rev="";
		for (int i=0;i<=ln-1;i++) {
			rev=rev+st.charAt(i);
		}
		return st;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		String str ="selenium";
		
		//stringReverse sr = new stringReverse();
		//to avoid object creatuion make it static
		String m1=reverse(str);
		System.out.println(m1);
		
		
		System.out.println(reverse("testing"));// im calling directly in print statement.
		System.out.println(reverse("naveen"));
		// what if we pass bank and one charector.
		System.out.println(reverse("T")); // only one char
		//System.out.println(reverse(null));
		System.out.println(reverse("")); // no string
		System.out.println(" ");// 
		System.out.println(reverse("123"));//321
		System.out.println(reverse("null"));//llun  its normal string only.
		System.out.println(reverse("testing ").trim()); // with space
	
	//	String test ="java python ruby";
//		System.out.println("=================");
//		System.out.println(reverse(test));
//	String o1=reverse(test);
//		System.out.println(revarray(o1));
//		
		
		
		
		String test ="java python ruby";
		String p1=reverse(test);
		String p[]=p1.split(" ");
		System.out.println(p[2]);
		
		
		
		
		String k[]=test.split(" ");
		System.out.println(Arrays.toString(k));
		
		System.out.println(k[0]);
		
		String t1=k[0];
		StringBuilder sb = new StringBuilder(t1);
		sb.reverse();
		System.out.println(sb);
	
		String t2=k[1];
		StringBuilder sb1 = new StringBuilder(t2);
		sb1.reverse();
		System.out.println(sb1);
		
		String t3=k[2];
		StringBuilder sb2 = new StringBuilder(t3);
		sb2.reverse();
		System.out.println(sb2);
		 String tst =sb+" "+sb1+" "+sb2;
		System.out.println(tst);
		System.out.println(reverse(tst));
		
		
	}

}
