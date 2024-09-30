package javasessions;

public class User {

	String name;
	int age;
 	double sal;
	 String city;

	public static void main(String[] args) {

		User u1 = new User();
		u1.name = "Naveen";
		u1.age = 30;
		//u1.sal = 90;
		u1.city = "LA";

		User u2 = new User();
		u2.name = "Tom";
		u2.age = 35;
		u2.sal = 60;
		u2.city = "MAA";

		User u3 = new User();
		u3.name = "Mark";
		u3.age = 32;
		u3.sal = 66;
		u3.city = "BAN";
		
		User u4 = new User();
		u4.name = "Arun";
		u4.age = 30;
		u4.sal = 15;
		u4.city = "HYD";

		//.out.println("----------------");
		System.out.println(u1.name + " " + u1.age + " " + u1.sal + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.sal + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.sal + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.sal + " " + u4.city);

		System.out.println("-------u1=u2------");
		
		u1=u2;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.sal + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.sal + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.sal + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.sal + " " + u4.city);

		System.out.println("-------u2=u3---------");
		u2=u3;

		System.out.println(u1.name + " " + u1.age + " " + u1.sal + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.sal + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.sal + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.sal + " " + u4.city);

		System.out.println("-------u3=u4----------");
		u3=u4;
		System.out.println(u1.name + " " + u1.age + " " + u1.sal + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.sal + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.sal + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.sal + " " + u4.city);
		System.out.println("--------u4=u1--------");
		u4=u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.sal + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.sal + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.sal + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.sal + " " + u4.city);
		System.out.println("------------");
//		u1=u4;
//		System.out.println(u1.name + " " + u1.age + " " + u1.sal + " " + u1.city);
//		System.out.println(u2.name + " " + u2.age + " " + u2.sal + " " + u2.city);
//		System.out.println(u3.name + " " + u3.age + " " + u3.sal + " " + u3.city);
//		System.out.println(u4.name + " " + u4.age + " " + u4.sal + " " + u4.city);
//		

	}

}
