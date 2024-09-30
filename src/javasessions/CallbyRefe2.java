package javasessions;

public class CallbyRefe2 {

	public void getmarks(int a1) { //  non static
		
		System.out.println(a1);

	}

	public void grade() { //  non static

		System.out.println("calling  get marks from grade");
		getmarks(666);
	}

	public static void displayMarks() {//  static

		System.out.println("DisplayMarks method");

	}

	public static void prtintMarks(CallbyRefe2 p1) { //   static call by reference
		System.out.println("prtintMarks method");
		p1.getmarks(555);
		p1.grade();

	}

	public static void memo() { //   static

		System.out.println("DisplyMarks method from memo class");
		CallbyRefe2.displayMarks();
	}

	public static void main(String[] args) { // main static method jvm calls first method psvm string 

		CallbyRefe2 obj = new CallbyRefe2();

		obj.getmarks(100);

		CallbyRefe2.displayMarks();

		CallbyRefe2.prtintMarks(obj);

	}

}
