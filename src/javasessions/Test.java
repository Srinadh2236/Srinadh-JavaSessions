package javasessions;

public class Test {

	public static void main(String[] args) {
//		int a=1, b=2;
//		System.out.println(--b - ++a + ++b - --a);
		
//		int i=19, j=29, k=0;
//		int m = i-- - j-- - k--;
//		System.out.println("i="+i);
//		System.out.println("j="+j);
//		System.out.println("k="+k);
		
//		int i = 11;
//		int k =i++;
//		int j = --k;
//		System.out.println(i);
//		System.out.println(k);
//		System.out.println(j);
//		
//		
//		int m = 0, n = 0;
//		int p = --m * --n * n-- * m--;
//		System.out.println(p);
//		System.out.println(m);
//		System.out.println(n);
		
//			int a=1;
//			a = a++ + ++a * --a - a--; 
//			System.out.println(a);
//		//int b=11;
//		int a = 11++; //b=11
//		System.out.println(a);
//		System.out.println(b);
//		
		
//		int ch = 'A';
//		System.out.println(++ch);
		
		
//		int a=35;
//		int b=-11;
//		
//		if (a>0) {
//		 System.out.println("given a is positive number" + a);
//		}
//		if(b<0)
//		{
//			 System.out.println("given b is negitive number" + b);
//
//		}
//		else {
//			System.out.println("given numer zero");
//		}
//		
//		
		
//		int a=25,b=78,c=87;
//		
//		if (a<b) {
//			if(b<c) {
//				System.out.println("c is greatest number :" + c);
//			}
//			else {
//				System.out.println("b is greatest number :" + b);
//			}
//		
//		}
//		else 
//		{
//			System.out.println("a is greatest number :" +a);
//		}
//		
//		int a=25,b=77,c=87,d=97;
//		
//		if (a<b) {
//			if(b<c) {
//				if(c<d) {
//					System.out.println(" D is greates number :"+d);
//				}
//					else{
//						System.out.println("c is the greates number : " +c);
//					}
//				}
//			else {
//				System.out.println("b is the greatest number :"+ b);
//			}
//			}
//		else {
//			System.out.println(" a is the greatst number :"+ a);
//		}
		
//		char ch='u';
//		switch (ch) {
//		case 'a':
//			System.out.println(" a is vowel:" + ch);
//			break;
//		case 'e':
//			System.out.println(" e is vowel:" + ch);
//			break;
//		case 'i':
//			System.out.println(" i is vowel:" + ch);
//			break;
//		case 'o':
//			System.out.println(" o is vowel:" + ch);
//			break;
//		case 'u':
//			System.out.println(" u is vowel:" + ch);
//			break;
//
//		default:
//			System.out.println("its is consonant:" + ch);
//			break;
//		}
		
		String loan ="Car Loan" ;
		int salary =3000;
		switch (loan.toLowerCase()) {
		case "housing loan":
			if (salary >=35000) {
				System.out.println("your APPLICABLE FOR Housing Loan");
			}
			else {
				System.out.println("your not NOT APPLICABLE FOR Housing Loan");
			}
			break;
		case "car loan":
			if (salary >=35000) {
				System.out.println("your APPLICABLE FOR car Loan");
			}
			else {
				System.out.println("your not NOT APPLICABLE FOR car Loan");
			}
			break;
		case "personal loan":
			if (salary >=35000) {
				System.out.println("your APPLICABLE FOR personal Loan");
			}
			else {
				System.out.println("your not NOT APPLICABLE FOR  personal Loan");
			}
			break;
		case "education loan":
			if (salary >=35000) {
				System.out.println("your APPLICABLE FOR education Loan");
			}
			else {
				System.out.println("your not NOT APPLICABLE FOR  education Loan");
			}
			break;

		default:
			System.out.println("Please enter valid loan type:" + loan);
			break;
		}
		
//		int x = 1;
//		while (x <= 10) {
//			System.out.println(x);
//			if (x % 7 == 0) {
//				System.out.println("bye, see you tomorrow");
//				break;
//			}
//			x++;

		}
		
		
	}


