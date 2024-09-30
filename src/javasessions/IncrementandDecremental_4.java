package javasessions;

public class IncrementandDecremental_4 {

	public static void main(String[] args) {
		int a =1;
		int b =a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(2);
		
// 1.		
//		int i = 11;
//		int j = i++ + ++i;// intially i =11 
//		//      11+1 + 1+12  =24
//		System.out.println(i);
//		System.out.println(j);

		
//2.
//		int a=11, b=22;
//		 int c=a + b + a++ + b++ + ++a + ++b ;
//		// 11+22+ 11  + 22   + 1+12 + 1+23
//		System.out.println("a =" + a);//13
//		System.out.println("b =" + b);//24
//		System.out.println("c =" + c);//103
		
//3.  		
//		int i= 0;
//		int j = i++ - --i + ++i - i--;
//		//      0   - 0   -  1  - 1 
//		System.out.println(i);//0
//		System.out.println(j);//0
 		
	//4.
		char ch ='A';
		System.out.println(ch); //A
		System.out.println((int)ch); //65
		
		int i = 65 ;
		System.out.println(i); //65
		System.out.println((char)i); //A
		
		
		
	}

}
