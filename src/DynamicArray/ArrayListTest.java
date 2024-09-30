package DynamicArray;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		//list (interface) ----> arrayList(c) implemented in array list.
		
		//**** initaily  default  vc=10 size virtual capacity or virtual segment 
				// and    pc=0  we are trying to add in array list pc will increse pc=1 and vc=9;
		
		
		// VIRTUAL CAPACITY OR VIRTUAL SEGMENT
		// PHYSICAL CAPACITY ... always check we are ar.size(); with pc only 
		
		// and it id always maintain the order we are adding data .
		
		ArrayList ar = new ArrayList();// impost arrayList class when we try to create object for arrayList it will show error , then import arraylist.
		System.out.println(ar.size());//size of the array is //0 intaily we are not yet added. so size is 0;
		
		
		ar.add(100); //index 0  
		ar.add(200); // index 1
		
		System.out.println(ar.size());// size of the array is //2   vc=8 pc=2;
		ar.add(300); //index 2
		ar.add(400);//index 3
		
		System.out.println(ar.size());//size of the array is //4   vc=6 pc=4;
		ar.add(500);
		ar.add(600);
		ar.add(700);
		ar.add(800);
		ar.add(900);
		ar.add(1000); //VC=0 and PC=10 
		
		//initai default virtual capacity java given VC=10 and it got filled then for next cycle how many virtual segments will added?
		
		//load factor= pc/2; ----->10/2==5; for next cycle 5 segments will be added .
		ar.add(1100); // vc=5; pc=11; 
		// again 5 got filled vc=0 and pc=15 then what will be next load factor
		
		//LF=pc/2---->15/2====7.5 so it will add nxt cycle  7 segments
		
		ArrayList ac = new ArrayList(5);// initialy vc =10 so i dnt want 10 we can pass vc  as 5;
		
		ac.add(100); // vc=5 and pc=1
		ac.add(200);
		ac.add(300);
		ac.add(400);
		ac.add(500);// vc=0;pc =5 and it got filled java will automatically will be add the load factor pc/2 is 5/2 is 2;
		
		ac.add(600);
		ac.add(700); 
		
		ArrayList av= new ArrayList(50); // now i want 50 so i have given as 50.
		// vc=50 and pc=0;
		// and all segments got filled then what will be the next load factor.
	// and vc became =0 and pc is 50;
		//LF=pc/2 ---->50/2--->25;
		
		// next load factor 25 segment will be added to the arrayslist
		
		
		
		
		
	}

}
