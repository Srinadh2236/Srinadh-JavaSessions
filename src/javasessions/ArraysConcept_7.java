package javasessions;

import java.util.Arrays;

public class ArraysConcept_7 {

	public static void main(String[] args) {
		
		//int range 2147483648
		int i[]=new int[4];// there is  limits for length n number e_x: i[2147483648]  range.
		
		// System.out.println(i[0]); by default array initials the value is 0 
		//[0][1][2][3] there is no out of index like -1 ,-2 from 0 only. 
		//and [4] also because of lent is 4 index is start form 0 1 2 3 .
		//System.out.println(i[0]);//0
		
		i[0]=10; 
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		//System.out.println(i[-1]);//Array index out of boundary exception AIOB 
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);
		
		int len=i.length;
		System.out.println("length of array is:" + len);
		System.out.println("highest index number is :" + (len-1));
		//----------------------
		//i[k];
		for( int k=0;k<=i.length-1; k++) {
			
			System.out.println(i[k]);
		}
		
		System.out.println(Arrays.toString(i));	//[10, 20, 30, 40]	
		System.out.println(Arrays.toString(i));
		

	}

}
