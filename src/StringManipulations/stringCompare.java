package StringManipulations;

public class stringCompare {

	public static void main(String[] args) {
		
		
		//String literals
		String s1="Hello selenium";
		
		String s2 = new String("Hello selenium");
		
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		String s3 ="Hello selenium";
		System.out.println(s1==s3);//true
		System.out.println(s2.equals(s3));//true
		
		// if we want to compare any strings of two contents of string use always .equals methods it will check only content of strings only
		
		
		String s4 ="Hello Selenium";// here S is capital so its case sensitive
		System.out.println(s1==s4);// false because it case sensitive.
		
		String str = new String("testing");//2  it will created two values one is object created and an other is String constant pool created but no reference will be created .
		String st ="testing"; // 0 objects created bcx already in scp. when we try to created same String value in previous SCP check String is there are not if its there it will  assigh testing=s4 reference;
		
		
		//concatination
		String t1="Hello";
		System.out.println(t1.concat("selenium"));// here we are just concat with t1 and displying not storing into any references. sonprint t1 it will give Hello only.
		System.out.println(t1);
		
		String t2="Hello";// strings are in mutetables bcz once created string cant be changed . if we want to store in diffrent references.
		String t3=t1.concat("selenium");// here we are storing into t3 manipulation done and stored to some references t3.
		System.out.println(t3);//Helloselenium
	
		
		String t3 = new String("cypress");
		
		
		
		
		
		
		
	}

}
