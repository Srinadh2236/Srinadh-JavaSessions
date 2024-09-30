package javasessions;

public class LoopsConceptWhileloop_6_Assignment {

	public static void main(String[] args) {

		
		
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}
		System.out.println("--------------------");

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " is" + " = " + (byte) ch);
		}

		System.out.println("--------------------");
		int i = 1;
		while (i <= 5) {
			System.out.println("I am Batman﻿");
			i++;
		}

		System.out.println("--------------------");
		int p = 1;
		while (p <= 9) {
			System.out.println(" I am Batman﻿ " + p);
			p++;
		}
		System.out.println("--------------------");
		int q = 10;
		while (q >= 1) {
			System.out.println(" I am Batman﻿ " + q);
			q--;
		}
		System.out.println("--------------------");

		int o = 1;
		while (o <= 10) {
			System.out.println(" Hello World");
			o++;
		}

		System.out.println("--------------------");

		int k = 1;
		int l = 5;
		int m = 1;
		while (k <= 100) {
			m = l * k;
			System.out.println(l + "*" + k + " = " + m);
			k++;
		}

		System.out.println("--------------------");

		int z = 5, y = 1;
		for (int x = 1; x <= 100; x++) {
			y = z * x;
			System.out.println(z + "*" + x + "=" + y);
		}

		System.out.println("--------------------");

//	for( ; ; ) //condition by default is true so program will continue infinity times
//	{
//		System.out.println("Welcome to TAJ");
//	}

//	 while(true)//condition by default is true so program will continue infinity times
//	 {
//		 System.out.println( "Welcome to TAJ");
//	 }

		System.out.println("--------------------");
		// 6.Print all odd and even numbers between 1 to 100

		int ii = 1;
		while (ii <= 100) {
			if (ii % 2 == 0) {

				System.out.println(ii + " is Even");
			} else if (ii % 2 == 1) {
				System.out.println(ii + " is odd");
			}
			ii++;
		}

		System.out.println("--------------------");

		// 7. What will be the output of this program:

//		int i1 = 1;
//		while(i1<=1){
//		System.out.println("Hi Java");//infinate loop
//		}

		System.out.println("--------------------");
		// 8. Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one
		// using while and for loop.

		char cr = 'A';
		while (cr <= 'Z') {
			System.out.println(cr + " = " + (byte) cr);
			cr++;
		}

		System.out.println("--------------------");
		char rc = 'a';
		while (rc <= 'z') {
			System.out.println(rc + " = " + (byte) rc);
			rc++;
		}
		System.out.println("--------------------");

		for (char ca = 'A'; ca <= 'Z'; ca++) {
			System.out.println(ca + " = " + (byte) ca);
		}
		System.out.println("--------------------");

		for (char ac = 'a'; ac <= 'z'; ac++) {
			System.out.println(ac + " = " + (byte) ac);
		}

		System.out.println("--------------------");

		for (char cp = '0'; cp <= '9'; cp++) {
			System.out.println(cp + " = " + (byte) cp);
		}

		System.out.println("--------------------");
		char ha = '0';
		while (ha <= '9') {
			System.out.println(ha + " = " + (byte) ha);
			ha++;
		}

		System.out.println("--------------------");
		// 9.1 Reverse Alphabet Series: Develop a Java program to print the series of
		// lowercase alphabets in reverse order from 'z' to 'a'
		System.out.println("------Reverse Alphabet Series z to a  for loop --------------");

		for (char fr = 'z'; fr >= 'a'; fr--) {
			System.out.println(fr);
		}
		System.out.println("------Reverse Alphabet Series z to a---while --------------");

		char rf = 'z';
		while (rf >= 'a') {
			System.out.println(rf);
			rf--;
		}

		// Even Numbers Series: Write a Java program to print the series of even numbers
		// from 2 to 100.
		System.out.println("-- forloop-----even numbers from 2 to 100.-------------");

		int en = 2;
		while (en <= 100) {
			if (en % 2 == 0) {
				System.out.println(en);
			}
			en++;
		}
		System.out.println("-- while loop-----even numbers from 2 to 100.-------------");

		for (int hu = 2; hu <= 100; hu++) {
			if (hu % 2 == 0) {
				System.out.println(hu);
			}
		}

		// Floating Point Series: Write a Java program to print the series of
		// floating-point numbers from 1.0 to 10.0.

		System.out.println("---for loop-----Floating Point Series--from 1.0 to 10.0----------");

		for (float lo = 1.0f; lo <= 10.0; lo++) {
			System.out.println(lo);
		}

		System.out.println("---while-----Floating Point Series--from 1.0 to 10.0----------");
		float ol = 1.0f;
		while (ol <= 10.0) {
			System.out.println(ol);
			ol++;
		}

		// Multiples of 9 Series: Develop a Java program to print the series of numbers
		// where each number is a multiple of 9, starting from 0 and ending at 99.
		System.out.println("----while loop----------Multiples of 9--starting from 0 and ending at 99.---------------");

		int tp = 9;
		int ts = 0;
		int hw = 1;

		while (ts <= 99) {
			hw = tp * ts;
			System.out.println(tp + " * " + ts + " = " + hw);
			ts++;
		}
		System.out.println("----for loop----------Multiples of 9--starting from 0 and ending at 99.---------------");

		int ns = 9;
		int jj = 1;
		for (int em = 0; em <= 99; em++) {
			jj = ns * em;
			System.out.println(ns + "*" + em + "=" + jj);

		}
		System.out.println("--------for loop vowels---------------");
		
		//10.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.

		for(char rh='a'; rh<='z'; rh++) {
			if(rh=='a' || rh=='e' || rh=='i' || rh=='o' || rh=='u') {
				System.out.println(rh + " is vowel");
			}
		}
		System.out.println("-------while loop vowels----------------");

	char ip='a';
	while (ip <= 'z') {
		if (ip == 'a' || ip == 'e' || ip == 'i' || ip == 'o' || ip == 'u') {
			System.out.println(ip + " is vowel");
			
		}
		ip++;
	}	
		
	//11.Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".	
		
	int ap=1;
	while(ap<=10) {
		System.out.println(ap);
		if (ap==7) {
		System.out.println("bye, see you tomorrow");
		break;
		}
		ap++;
	}
	
		
	//int i[]= new int[3];
	
	//i[0]=10;
	
		
		
		
		
		
	}
}
