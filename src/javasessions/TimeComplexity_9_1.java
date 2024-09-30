package javasessions;

public class TimeComplexity_9_1 {

	public static void main(String[] args) {

		// Tc Big Oh() --> Big O()

		// 1.
		int i = 0;
		System.out.println(i); //

		// O(1) --->constant time;

		// 2.

		for (int p = 1; p <= 10; p++) {
			System.out.println(p);// how many time it will run 10 times run. n times
		}

		// p=1  one time will run
		//p<=10 10 times will run so  p<=100   100 times will run  (p<=n  n times will run)
		// p++ also n times will increase 
		
		//1+n+n+n =>3n+1 linear equation 
		//	significance =>1 negligence and same 3 also finally
		// 3n =>3n=>n
		// O(n)  linear equation
		
		
		//3.
		    //for loop
					// for loop
		
			// for main loop O(n)	
			// inner loop o(n) so O(n*n)--->O(n^2)
		
		
		//4. n*n*n=n^3 ==>O(n^3)
		for (int a = 0; a <= 5; a++) {
			for (int b = 0; b <= 5; b++) {
				for (int c = 0; c <= 5; c++) {
					System.out.print(a + "" + b + "" + c + " ");
				}
				//break; inner loop will break.
			}

			System.out.println();
			
		// 5.n^k
			
		//6. Log n binary Search algorithm list find example 32 
			// n=32
			// n/2=16
			// 16/2=8
			// 8/2 =4
			// 4/2 =2
			
			//Tc=n/k
			//T=n/k
			
			//log T=log(n/k)
			//log T= log n -log k
			//log T =1-log k
			//log T= log k
			// O(log n) Big Oh
			
			
		
			
			

		}
	}

}
