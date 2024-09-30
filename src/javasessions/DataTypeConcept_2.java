package javasessions;

public class DataTypeConcept_2 {

	public static void main(String[] args) {
		
		//Data types
		//1.primitive data types
		// 	1.1 numeric family
		
				// byte,short,int
		//2.Non primitive data types:class,arrays.etc

		// 1.byte:
		// range 1byte -- 8bits (-128 to 127) -2^7
				byte d = 100;
				 //d =  90;
				 byte s = 22;
				System.out.println(d);
				System.out.println(s);
				
		//2.short :
				// 2bytes : 2*8 =16 bits (-32769 to 32768) =2^15
				short sh = 300;
				System.out.println(sh);
		//3.int :
				//4bytes :4*8=32 bits (-2147483648 to 2147483647) == 2^31
				 int i = 10000;
				 System.out.println(i);
		//4.long : 
				 //8bytes :8*8=64 bits = 2^63 
				 
				 long lg = 7665655777L;// for large numbers must mentioned end is L or l.
				 System.out.println(lg);
				 long dist =76876786777L;
				 System.out.println(dist);// for distance purpose will we use long data type.
		//5 float: // range after dot 6-7 digits can take
				 
				 //***why we place "f" in float because of by default for 12.33 it can assign 8 byte so for that we can mentioned "f" (4byte)
				 //"" double D = 12.33; no need to place f because java by default taken as double 8 byte 
			 float f = 12.33555555555555f; // range after dot 6-7 digits can take 
			 // out put 12.335556
			 float fe = 12.1234567f;
			 System.out.println(fe);
			 //or
			 float ft =(float) 12.45 ;
			 System.out.println(ft);
			 float n1 = 100;// out put 100.0
			 System.out.println(n1);
			 
			 float tj = 39123456789123456789123456789123456000f;//38+f==39 before dot 39 digits can allow;
			 System.out.println("srinadh");
			 System.out.println(tj);
			 
		// Double : 8 byte = 64 bits  after dot 15 digits can allow
			 // for double before dot  309 digits can allow
			 double de = 32.1234561234567891111111;
			 System.out.println(de);
			 
	 // char : 2 bytes  = 16 bits (unicode values + ASCII)
			 char ch ='a';
			 System.out.println(ch);
			 char v2 ='1';//0-9 can store in char 
			 System.out.println(v2);
			 char v4 ='$';//Not can $$ only single symbols and single number only
			 System.out.println(v4);
			 
			 System.out.println('t');
			 System.out.println('t'+12);// ASCII + 12 =128
	// boolean : true/false
			 boolean b = true;
			 System.out.println(b);
		
			 
	}

}
