package ThrowKeyword;


public class throwKeyword {

	public static void main(String[] args) {
		
		// throw keyword is a own  custom  exception:user defined exception.
		
		 // if un wanted file or name are coming i dnt want to continue the next lines of code. i want to throw exception.
		
		String data = null;
		
		if (data==null)// if data is null means file is missing  at that time i want to throw an exception.
		{
			 throw new RuntimeException("My user defined exception : file is missing ");// this is message  i want to supply in run time if file is missing .
			 
		} // RuntimeException this is class 
		
		// this is unrachble code because of data is null and we are throwing exception it will stop there i dnt want to run next line of code we are terminating the code.simply. if it run what is the use  with out file.
		System.out.println("Bye!!!");
		
		
	}

}
