package MapConcept;

import java.util.HashMap;

public class maptesting {

	public static void main(String[] args) {
		//Collection:<key,Value> 
		//HashMap(c)----List(I); 
		//its is a non order based collection --- no order
		// only on null key can be maintained . if we write an other it will over rite the old one , updated as latest value.
		//but multiple null values allowed.
		// duplicates not allowed . but it will be updated old data.
		//<null,value>if we have null key value could be anything, it will stored at first position.
		
		
		
		//String ,Integer
		HashMap<String ,Integer> map = new HashMap<String, Integer>();
		map.put("Chrome", 100);
		map.put("safari", 96);
		map.put("edge", 201);
		
		//Integer ,Integer
		HashMap<Integer,Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(1, 101);
		map1.put(121, 2552);
		map1.put(22, 2545);
		
		//String Object
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("Name", "Naveen");
		data.put("age", 30);
		data.put("designation", "SDET2");
		data.put("isPerm", true);
		//data.put("Gender", 'm');
		//data.put(null, "India");// it pick   latest value and its overrite old value , only one value null will be stored.
		data.put("Phone", null);
		data.put("city", null);
		data.put("Address", " ");
		data.put("", 32.33);
		data.put("age", 31);
		
		
		
		//to get values use Get();
		System.out.println(data.get("Name"));
		System.out.println(data.get("age"));
		System.out.println(data.get("Gender"));
		System.out.println(data.get("isPerm"));
		//System.out.println(data.get(null));// India
		System.out.println(data.get("Phone"));//null
		System.out.println(data.get("city"));//null
		System.out.println(data.get("Address"));// " " // space
		System.out.println(data.get(""));//32.33
		
		//remove("key");
		data.remove("designation");
		System.out.println(data.get("designation"));// its removed so it not available so it null;
		
		
		System.out.println("----------------");
		System.out.println(data);// dont followed order , always first preference given to the null .
		
		//
		//default Virtual capacity is 15 for HasMap. and what is the virtual capacity for 	ArrayList is 10
		HashMap<String,Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Tom", 20);
		empMap.put("Alice", 30);
		empMap.put("upstock", 40);
		empMap.put("Naveen", 50);
		
		System.out.println(empMap);
		
		// o ---14 segments will be created initially 
		// in each segment(node) have 3 parts or 3 sections 
		// 1: HashCode
		// 2:key
		// 3:value
		
		//put(key,value){
		//hascode(key)---hashcode("Tom")---98789.
		//based on key it generate the hashcode. based on key :lets take Hashcode is 98789 is my hashcode
		
		//index=(mod(98789),15)= it will give you index number like 4; data stored in index 4
				// (%(hashcode),VC =4(index)
		

		// now tom will be go the 4th index.  98789|Tom|20
		
		//hashcode(Alice)---90899---mod(90899),14-- 2 index is 2 given having some mod operations with hashcode and VC given index number were will stored in that index segment
		
		//hashcode(Naveen)--98789 also got same hashcode will given it can be duplicate.collision happen if 
		
		// when will be collition happen and how many times collision will be happen :8
		     //1.for the both key having same Hashcode and also got same index number then it will happen collision. both happen "link list"
		
		//********** imp after JDK 1.7 
		//0 --7 it will maintain linklist once its reached threshold 8  then it will covert into binary tree.
		
		
		
		
	}

}
