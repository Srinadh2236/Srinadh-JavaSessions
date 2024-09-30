package javasessions;

public class FunctinonsinJava {
	
//	functions in java
//
//	functions/methods  both are same in java
//
//	functions is main reusability . no need to write again and again same code we can use multiple times same code to do a task or any to get any results(give something return something )
//
//	
//	input---->no return
//	input---->return
//	no input---->return
	
//	no input ---no return

	
	//class data members
	//1.Class variables  --->static and non static class variables
	//2.class Methods/function ---->static and non static class methods
	
	//what is void: void means no returning  anything 
	public void test() { //non static method so we need to create object reference name like obj call from obj.
		System.out.println("Test method/function");
	}
	public void calc() {// 0 parameters
		System.out.println("calc method");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);//30 println just printing the statement not retuning value .
	}
	//2. no iput ---> some return
	//public void getNumber()
	public int getNumber() { // here returning totaltax which data type int . so remove void  place a int datatype. if float expecting mention float and boolean also same getting returning respective datatype
		System.out.println("get number");
		int fee =100;
		int tax =20;
		int totaltax =fee + tax;
		return totaltax;
	}
	
	public String  getTrainerName() { // here returning string , so remove void place string
		System.out.println("get trainer name");
		return "Naveen ";
	}

	public boolean isUserActive() {
		System.out.println("checking is user active");
		return true;
	}
	
	//3.input ----> no return
	
	public void addNumber(int a,int b) {// when we declare functions values are parameters ... par and arg not same   
		System.out.println("adding two numbers");
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	//4.input --> some return
	public int sum(int a, int b) {
		System.out.println(" adding two intigers");
		int s=a+b;
		return s;
		
	}
	
	
	public static void main(String[] args) {
		
		//No input --->no return
		FunctinonsinJava obj =new FunctinonsinJava();
		obj.test();// it will call the function 
		
		obj.calc();
		
		//obj.getNumber(); return a value to object reference obj. value in obj
		 //System.out.println(obj.getNumber()); 
		
		 int t = obj.getNumber();// what ever value are getting store in t  so that we can use t variable for other purpose.
		 System.out.println(t);
		// System.out.println(t+20);// here adding discount giving 20 easy to add for you
		 
		 String tr= obj.getTrainerName();
		 System.out.println("YOUR trainer name is: "+ tr);
		 
		 boolean flag =obj.isUserActive();
		 System.out.println(flag);
		 
		 if (flag) {
			 System.out.println("Login to app");
		 }
		 
		 obj.addNumber(10, 20);//10,20 are arguments while calling function passing the values are arguments.
		 
		 int p =obj.sum(100, 200);
		 System.out.println(p);
		 
		 
		 
	}

}
