package Assignments;

import java.util.Arrays;

public class Arrays_assignment {

	public static void main(String[] args) {
		// copy of array i to l
		int i[] = new int[8];
		i[0] = 1;
		i[1] = 4;
		i[2] = 5;
		i[3] = 2;
		i[4] = 3;
		i[5] = 22;
		i[6] = 31;
		i[7] = 2;
		int l[] = new int[i.length];
		int p = 0;
		for (int k = 0; k <= i.length - 1; k++) {
			l[p] = i[k];
			p++;
		}
		System.out.println(Arrays.toString(l));

		// Deleting the array in particular number
		// {1,4,5,2,3,22,31, 2}; delete 22 number
		// so we need to reduce 22 in array list right so lentgh-1

		int m[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int a[] = new int[m.length - 1];// here we are deleting the 22 so index length reduce bye one
		int n = 0;
		for (int k = 0; k <= m.length - 1; k++) {
			if (m[k] != 22) {
				a[n] = m[k];
				n++;
			}
		}
		System.out.println(Arrays.toString(a));
		
		//2.Print all the elements of this array using for, for each, while and do-while loop:
			//2.1 For each loop
          int c[] = {1,3,4,5,22,56,89,90};
          for (int e:c) {
        	  System.out.print(e+ " ");
        	  
          }
          System.out.println();
		    //2.2 while loop
          int d[] = {1,3,4,5,22,56,89,90};
          int y=0;
          while(y<d.length) {
        	  
        	  System.out.println(Arrays.toString(d));
        	  break;
          }
		  // 2.3 Do while loop
          int f[] = {1,3,4,5,22,56,89,90};
          int g=1;
          do{
        	  Arrays.toString(f);
        	  }
        	   
          while(g>f.length-1); // 	
          
       // 3. Print all the elements of this array in reverse order using for, for each, while and do-while loop:
          // for each loop
          int h[] = {1,3,4,5,22,56,89,90};
          
          int cnt=h.length-1;
          for (int e:h) {
        	   e=cnt;
        	  System.out.print(h[e]+" ");
        	  cnt--;
          }
          
          //3.1 while loop
          System.out.println();
          
          int o[] = {1,3,4,5,22,56,89,90};
          int q=o.length-1;
          while(q>=0) {
        	  System.out.print(o[q]+" ");
        	  q--;
          }
          
          System.out.println();
          //3.2 Do while
          
          int r[] = {1,3,4,5,22,56,89,90};
          int s=r.length-1;
          do {
        	  System.out.print(r[s]+" "); 
        	  s--;
          }
          while(s>=0);
         
          System.out.println();

          int pp=10;
          while(pp>=0) {
        	  System.out.println(pp);
        	  pp--;
          }
          int sp =1;
          do {
        	  System.out.println(sp);
        	  sp++;
          }
		while(sp<=10);
          
          String sg =" Naveen ";
          switch (sg.toLowerCase().trim()) {
		case "naven":
			System.out.println(" naven");
			break;
		case "naveen":
			System.out.println(" this is naveen");
			break;
		default:
			System.out.println("this is not naveen");
			break;
		}
		
	}

}
