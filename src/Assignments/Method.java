package Assignments;

public class Method {

	// 1.print hello World!
	public void printHello() {
		System.out.println("Hello World!");
	}

	// 2.Add
	public int add(int num1, int num2) {
		System.out.println("adding number " + num1 + " " + num2);
		return num1 + num2;
	}

	// 3.Compare two strings
	public boolean compareString(String str1, String str2) {

		if (str1 == str2) {
			return true;
		} else {
			return false;

		}
	}

	public double calAvg(double numbers[]) {

		double sum = 0.0;
		for (double e : numbers) {

			sum = sum + e;
			// System.out.println(e);

		}
		return sum / numbers.length;

	}

	public int caladd(int num[]) {

		int sum = 0;

		for (int e : num) {

			sum = sum + e;
			// System.out.println(e);

		}

		return sum;
	}

	// 5.con string
	public String contString(String str[]) {

		String s = "";

		for (String e : str) {
			// System.out.print(e);
			s = s + e;
			// System.out.println(e+s);
		}
		return s;
	}

	// 6.reverse
	public void revArray(int r[]) {

		int sum = 0;
		int ln = r.length;
		for (int e : r) {
			e = sum + ln;
			System.out.println(e);
			ln--;
		}

	}

	// 7.
	public static void mulArray(int fact, int m[]) {

		for (int e : m) {
			e = fact * e;
			System.out.print(e + " ");
		}
	}

	// 8.print status success or failed
	public static void printStutus(String str, boolean flg) {

		if (str == "success" && flg == true) {

			System.out.println("Operation completed successfully" + " " + flg);
		} else if (str == "success" && flg == false) {
			System.out.println("Operation success but status : " + " " + flg);

		} else {
			System.out.println("Operation filed :" + " " + flg);
		}

	}
	// 9.String array reverse order

	public void revString(String str[]) {
		// System.out.println("reversing string");

//		String nam = "Naveen";
//		int k = 3;
//		int strlen = nam.length() - k;
//		System.out.println(nam.substring(strlen));
//		k++;
//
//		int ln = str.length - 1;
//
//		for (String e : str) {
//
//			System.out.println(e.length() - 5);
//
//			// int slen =e.length()-5;
//			// System.out.println(e.substring(slen));
		
//		for (int i=0; i<=str.length;i++) {
//			
//			String word =str[i]; // name
//			word = new  StringBulider
//			
//			}
//		}
	
	}
	
	
	public static void main(String[] args) {
		// 1.
		Method cn = new Method();
		cn.printHello();
		// 2.
		int ad = cn.add(10, 20);
		System.out.println("sum: " + ad);

		// 3.
		boolean str3 = cn.compareString("naveen", "naveen");
		System.out.println("string are same: " + str3);

		// 4.Avg Double array

		double d[] = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };

		double avg = cn.calAvg(d);
		System.out.println(avg);

		int f[] = { 1, 2, 3, 4, 5, 6 };

		int ae = cn.caladd(f);
		System.out.println(ae);

		// 5.String concatenation
		String s[] = { "Na", "ve", "en" };

		String ss = cn.contString(s);
		System.out.println(ss);

		// 6.reverse array

		int r1[] = { 1, 2, 3, 4, 5, 6 };
		cn.revArray(r1);// o/p:

		// 7. mul * factor =2
		int m1[] = { 1, 2, 3, 4, 5, 6 };
		mulArray(2, m1); // o/p :2 4 6 8 10 12

		// 8.print success
		System.out.println();
		printStutus("success", true);
		printStutus("success", false);

		// 9.String array reverse order

		String revStr[] = { "naveen", "tom", "alice" };
		// String revStr[]= {"naveen"};
		cn.revString(revStr);

	}

}
