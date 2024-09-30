package javasessions;

import java.util.Arrays;

public class ArraysConcept_ArrayLiterals8 {

	public static void main(String[] args) {
	//int arrays	
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println("length of index : " + i.length);
		// System.out.println(i[0]);

		System.out.println(Arrays.toString(i));

		System.out.println("-------for each loop-------------");
		for (int e : i) {
			System.out.println(e);
		}

		System.out.println("----for loop --------");

		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);
		}

		System.out.println("---for loop reverse print----------");

		for (int k = i.length - 1; k >= 0; k--) {

			System.out.println(i[k]);

		}
		System.out.println("----for each loop- reverse print------");
		int cnt = i.length - 1;
		for (int e : i) {
			//int k = cnt;
			e=cnt;
			System.out.println(i[e]);// i[cnt]
			cnt--;
		}
// 	String array
		String s[] = new String[4];
		s[0] = "amit";
		s[1] = "tom";
		s[2] = "lisa";
		s[3] = "naveen";

		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);

		System.out.println(Arrays.toString(s));
		System.out.println("-------------");
		for (String e : s) {
			System.out.println(e);
		}
		System.out.println("-------------");
		for (int k = 0; k <= s.length - 1; k++) {
			System.out.println(s[k]);
		}
		System.out.println("--------------");

		for (int u = s.length - 1; u >= 0; u--) {
			System.out.println(s[u]);
		}
		System.out.println("---------------");
		int fnt = s.length - 1;
		for (String e : s) {
			int k = fnt;
			System.out.println(s[k]);
			fnt--;
		}
		// char array
		char c[] = new char[5];

		c[0] = 'a';
		c[1] = 'e';
		c[2] = 'i';
		c[3] = 'o';
		c[4] = 'u';

		System.out.println(Arrays.toString(c));

		for (char e : c) {
			System.out.println(e);
		}
		System.out.println("----------------");
		int p = c.length - 1;
		for (char e : c) {
			int g = p;
			System.out.println(c[g]);
			p--;
		}
// Object array

		Object o[] = new Object[4];

		o[0] = "Naveen";
		o[1] = 'M';
		o[2] = 32.33;
		o[3] = true;

		System.out.println(Arrays.toString(o));

		for (Object e : o) {
			System.out.println(e);
		}

		for (int k = 0; k <= 3; k++) {
			System.out.println(o[k]);
		}
		System.out.println("-----------");
		
		int pnt = o.length - 1;
		for (Object e : o) {
			//int y = pnt;
			System.out.println(o[pnt]);
			pnt--;
		}
// double array
		double d[] = new double[2];
		d[0]=10.11;
		d[1]=11.11;
		System.out.println(Arrays.toString(d));
		
		//Array literals
		
		int l[]= {10,20,30,40,50,60,70};
		//if we have already data with us. we will use array literals
		System.out.println(Arrays.toString(l));
		l[0]=400;// here we are loosing the data old newly added.
		System.out.println(Arrays.toString(l));
		
		int x[]= new int[40];
		x[0]=10;
		x[1]=20;
		x[3]=30;
		x[4]=40;
		x[5]=50;// i know only some of the data and we are not sure about the full data .
		//..... x[39] 
		
		String ss[]= {"naveen","tom","amit"};
		
		System.out.println(Arrays.toString(ss));
		ss[0]="lisa"; //newly added data but old data we loosing in any kind of data type.
		System.out.println(Arrays.toString(ss));
		
		
	}

}
