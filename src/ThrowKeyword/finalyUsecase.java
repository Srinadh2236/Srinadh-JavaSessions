package ThrowKeyword;

public class finalyUsecase {

	public static int getMarks(String name) {

		System.out.println("getting student marks: " + name);

		// in exception block having return  10 and finally block having 100 , in both cases exception coming or not it will goto finally block it will return in finally return value only doent matter in catch block having or not 
		// if in catch block having return it override the latest return value is 100.
		
		if (name.equals("Naveen")) {

			try {
				System.exit(1); // it will shutdown the jvm. it wnt go to even fianlly block also;
				int p =9/0;//if 9/3 it wont go to catch block it will return 100.
			//System.exit(1);
			}
			catch(ArithmeticException e) {
				System.out.println("AE is coming");
				return 10;// when exception is coming it will comes to the catch block return 10 will come , it wnt go to return 100.
			}
			finally {
				System.out.println("finally block..!!!");
				return 100;
			}
		}
		
		else if (name.equals("Alice")) {
			return 80;
		} 
		
		else if (name.equals("tom")) {
			return 70;
		}

		else {
			System.out.println("no data found :" + name);
			return -1;

		}

	}

	public static void main(String[] args) {
		
		

		int m1 = getMarks("Naveen");
		System.out.println(m1);

		// use case: lets take an example DB connection
		// 1.make the connection in :Uname,Pwd : if connection failed exception is
		// comming and went to finally block to close the connection.
		// 2.hit the sql query : same for all failed it went to finally block to close
		// the connection
		// 3.result from DB
		// 4.display the data on UI
		// 5.logout

		// we will write code in finally block to close the connection DB.
		// ****
		// finally {

		// close the connection weather getting result or not does not matter once you
		// logout . it will close the db connection.
		// other wise connection still there its hard to results and its burden to the
		// server
		// }

		// reading excel /file :

		// 1. read the data
		// 2. fetch the data
		// 3. display the data

		// and finally we write in finally block "file.close" we disconection
		
		
		///******
		
		 //" system.exit(1); is shoutdown the jvm;
				//system.exit(0);
	}

}
