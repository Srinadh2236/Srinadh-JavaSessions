package DynamicArray;

import java.util.ArrayList;

public class ArrayListTst {

	public static void main(String[] args) {


		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		 
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());
		
		ar.remove(2);
		System.out.println(ar.size());
		System.out.println(ar);
		
		ar.set(1, 200);
		System.out.println(ar);
		
		System.out.println(ar.get(1));
		
		
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(100);
		ls.add(101);
		ls.add(102);
		ls.add(103);
		
		
		ArrayList<Object> lb= new ArrayList<Object>();
		lb.add(100);
		lb.add("naveen");
		lb.add(10.22);
		lb.add(true);
		lb.add('m');
		
		lb.add(0, 1000);
		System.out.println(lb);
		lb.set(0, 10001);
		System.out.println(lb);

		
		
		
	}

}
