package StringManipulations;

public class stringIntern {

	public static void main(String[] args) {

		
		String s= new String("Hello java");// 2 objects created in one is heap memory and another one is string constant pool.
		//in heap memory object having reference is s; but in scp object no reference so the we use intern();
			// it will assign reference for scp objects which is not having no references.
		String s1=s.intern();// in SCP "Hello java"  object reference is assigned as s1.
		System.out.println(s1);//Hello java
		
		System.out.println(s==s1);//false 
		System.out.println(s.equals(s1));//true it will check only matters same or not;
		
		//lets check 
		
		String s2 ="Hello java"; // here what will happen already in SCP "Hello java" reference is s1 and again we assigned as s2  total 2 references for "Hell;
		
		System.out.println(s1==s2);//true because both reference are same . to the Hello java only.
		
		
		

		
		
		
		
	}

}
