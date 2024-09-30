package ThrowKeyword;

public class testException {

	public static void main(String[] args) {
		
		//runtime exception
		int c =9/0; // this is run time exception. the moment i write it wnt show any error while executing the code at that time will show the error.
		
		//compiletime exception (checking imediatly)
		//FileInputStream ip= new FileInputStream("test.xls");// if file not fount it will check weather file is available or not ,. so its compile time exception.
		
		//*** 
			//compiletime exception are checked exceptions (it mean it already aware of exception so its called checked exception);
			//runtime exception are unchecked exception.
		
		
		try {
			Thread.sleep(5000);// compile time exception
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 5 sec
		
		
		
	}

}
