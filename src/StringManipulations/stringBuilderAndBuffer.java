package StringManipulations;

public class stringBuilderAndBuffer {

	public static void main(String[] args) {

		
		//StringBuilder : it wnt allow liters and 1.4 after came
		StringBuilder sb= new StringBuilder();
		//StringBuilder st ="hello";// see here it wnt allow the string liters in string builders.
		
		
		StringBuilder sb1= new StringBuilder("selenium");

		sb1.append("automation");
		
		System.out.println(sb1);//seleniumautomation 
		
		System.out.println(sb1.reverse());
		
		//StringBuffer:   1.0 is came string buffer. and its thread safe.
		
		
		//reverse();
		String st ="selenium";
		//System.out.println(st.reve);// there is no reverse function. in literals
		
		StringBuilder sb2 = new StringBuilder("selenium");
		
		sb2.reverse();// we dnt want to save manipulates to main string.
		System.out.println(sb2);
		
		
		// so if we want to reverse the string 
		
		StringBuilder sb3 = new StringBuilder(st);
		sb3.reverse();
		System.out.println(sb3);
		
		
	}

}
