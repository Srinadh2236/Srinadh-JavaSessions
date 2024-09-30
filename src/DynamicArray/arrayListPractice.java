package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListPractice {

	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList();// import arraylist first and VC=10 PC=0;
		
		//virtual capacity or vitural segement and physical capacity
		// what is the size of arraylist is 0
		System.out.println(ar.size());//0
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2 i want to remove this 
		ar.add(400);//3
		System.out.println(ar.size());//4
		
		// so i want to remove second index 
		
		ar.remove(2);
		System.out.println(ar.size());//3 
		
		System.out.println(ar);//[100, 200, 400] see here 300 removed .
		
		// there is one method to get the values from arrays list is get(IndexNO);
		
		System.out.println(ar.get(2));//400
		
		// i want to print one bye one
		for(int i=0; i<=ar.size()-1;i++) {
			
			System.out.println(ar.get(i)); // i will get by one bye one 100 200 400;
			
			
		}
		
		
		//till now we used raw arraylist it will allow all type of data.lets check
		
		ArrayList ls = new ArrayList();// raw type array list.
		ls.add(100);
		ls.add(12.33);
		ls.add("admin");
		ls.add(true);
		ls.add('c');
		System.out.println(ls);//[100, 12.33, admin, true, c]
		
		// to print line bye line. use for loop and for each loop.
		for ( int k= 0; k<=ls.size()-1;k++){
			System.out.println(ls.get(k));
		}

		// Arrays with Generics: i want to store only in number 
		
		ArrayList <Integer> numList = new ArrayList<Integer>(); // it will allow only integers only.
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		//numList.add(10.22);// we cnt add double it will allow only integers only.
	
		//i want to add double data
		ArrayList<Double> ad = new ArrayList<Double>();
		ad.add(10.22);
		ad.add(11.22);
		ad.add(13.22);
		
		for (double e:ad) {
			System.out.println(e);
		}
		
		
		//String
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("Naveen");
		as.add("alice");
		as.add("tom");
		as.add(null);// null also allowed because of wrapers class and its no premitive so it will allow nulls
		
		
		for (String e:as) {
			System.out.println(e);
		}
		
		
		
		// Object it can allow all type of data :Emp data
		
		ArrayList<Object> ao = new ArrayList<Object>();
		
		ao.add("Naveen");
		ao.add(101);
		ao.add(12.33);
		ao.add(true);
		ao.add('m');
		
		System.out.println(ao);
		// for each loop
		for (Object e:ao) {
			System.out.println(e);
			if(e.equals("Naveen")) {
				System.out.println("Pass");
			}
		}
		//for loop
		
		for (int m=0;m<=ao.size()-1;m++) {
			System.out.println(ao.get(m));
			// no need to use this for condition based we can use if conditions .
//			if(ao.get(m).equals("Naveen")) {
//				System.out.println("Pass");
//			}
		}
	// output:
//		Naveen
//		101
//		12.33
//		true
//		m

		
		// footer List
		
		ArrayList<String> footerList = new ArrayList<String>();
		
		footerList.add("contact Us");
		footerList.add("Help");
		footerList.add("delivery");
		footerList.add("return");
		footerList.add("cart");
		footerList.add("accounts");
		
		footerList.get(0);
		System.out.println(footerList.get(0));
		footerList.set(0, "Naveen");
		
		
		for(String e:footerList) {
			
			System.out.println(e);
			if(e.equals("return")){
				System.out.println("clickin on retuns");
			break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
