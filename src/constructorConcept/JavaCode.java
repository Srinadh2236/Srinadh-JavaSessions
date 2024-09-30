package constructorConcept;

import java.util.Arrays;

public class JavaCode {

	
	public static void main(String args[]) {
	
		int a[] = {25,27,68,69,70,88,98,100};
		int n[]= {68};
		int i=a.length-1;
		int b=i/2;
		int p=0;
		//int m=60;
		//System.out.println(Arrays.toString(a[c]));
		//if (a[b]==n[0]) {
		if (a[b]==n[0]) { //69
		System.out.println(a[b]);
		System.out.println("First segment :"+ a[b]);
		
		}
		else if (n[0]<70  ) {//27 < 70
			b--;
			b--;
			if (n[0]==a[b]) { 
			System.out.println("2rd segment :" +a[b]);
			
			}
			else if(true)
			{
				b++;
				System.out.println("3rd segment :" +a[b]);
				}
				
		}
		else if(n[0]>a[b] ) {//88
			b++;
			b++;
			if (n[0]==a[b]) {
			System.out.println("4rd segment :" +a[b]);
			}
			else
			{
				b++;
				System.out.println("5rd segment :" +a[b]);

			}
		}
		else if (a[0]==n[0]) {//25
			System.out.println("6rd segment :" +a[0]);
		}
		//
		
		
//		for ( int  e: a) {
//			
//			System.out.println(e);
//			
//		}
		
		
	}
}
