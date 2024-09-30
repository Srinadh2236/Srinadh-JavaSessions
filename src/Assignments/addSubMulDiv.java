package Assignments;

public class addSubMulDiv {

	
	// Methods assignment 
	// WAP add, Mul,Div,sub

	// 1.Add
	public void add(int a, int b) {

		int c = a + b;
		System.out.println("addition: " + c);

	}

	// 1.2.Mul
	public void mul(int a, int b) {

		int c = a * b;
		System.out.println("Multiplication : " + c);
	}

	// 1.3.Div
	public void div(int a, int b) {

		int c = a - b;

		System.out.println("Division : " + c);
	}

	// 1.4.Sub
	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("Subtraction :" + c);

	}

	// by using Switch add sub mul and div

	public void AddSwitch(String name, int a, int b) {

		switch (name.toLowerCase().trim()) {
		case "add":
			System.out.println("perfomed :" + name.toLowerCase());
			// add(10,20);
			int c = a + b;
			System.out.println("Addition of a and b: " + c);
			break;
		case "sub":
			System.out.println("perfomed :" + name.toLowerCase());
			// sub(20,10);
			int d = a - b;
			System.out.println("Subtraction of a and b :" + d);
			break;

		case "mul":
			System.out.println("perfomed :" + name.toLowerCase());
			// mul(20,10);
			int f = a * b;
			System.out.println("Multipilcation of a and b:" + f);

			break;

		case "div":
			System.out.println("perfomed :" + name.toLowerCase());
			// div(10,20);
			int g = a / b;
			System.out.println("Division of a and b :" + g);
			break;

		default:
			System.out.println("please pass the valid name: " + name);
		}
	}

	// 2.Define a method that returns the product of two double numbers.

	public double getInfo(double a, double b) {

		double c = a * b;
		return c;
	}

	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining
	// your own method.
	// formulas
	// curcumfrance :2 * pai* radius
	// area :pai *radius *radius

	public static double CalCurcumfrerence(double radius) {

		return 2 * Math.PI * radius;

	}

	public static double calArea(double radius) {

		return Math.PI * radius * radius;

	}

	// 4. Define two methods to print the maximum and the minimum number
	// respectively among three numbers.
	public static void maximum(int a, int b, int c) {

		if (a > b && a > c) {
			System.out.println("a is the maximum :" + a);

		} else if (b > c && b > a) {

			System.out.println("b is  the maximun :" + b);

		}

		else {
			System.out.println("c  the maximum :" + c);
		}

	}

	public static void minimum(int a, int b, int c) {

		if (a < b && a < c) {
			System.out.println("a is minimum : " + a);
		} else if (b < c && b < a) {
			System.out.println("b is the minumum : " + b);

		} else {
			System.out.println("c is the minimum : " + c);
		}
	}

	// 5.Def﻿ine a program to find out whether a given number is even or odd -
	// return true/false.

	public static boolean oddEven(int a) {

		if (a % 2 == 0) {
			System.out.println("Given number is even :" + a);
			return true;
		} else {
			System.out.println("Given number is odd :" + a);
			return false;
		}
	}

	// 6. A person is eligible to vote if his/her age is greater than or equal to
	// 18.
	//  Define a method to find out if he/she is eligible to﻿ vote. - return
	// true/false

	public static boolean vote(String name, int age) {

		if (age >= 18) {
			System.out.println(name + " is eligible for vote " + "age : " + age);
			return true;
		} else {
			System.out.println(name + " is not eligible for vote  age is lessthan 18 :");
			return false;
		}
	}

	// 7.7. Write a program which will ask the user to enter his/her marks (out of 100).
	// Define a method that will display grades according to the marks entered as below:
	
	public static String CalGrade(int marks) {
		
		if(marks>=91 && marks<=100) {
			System.out.println(" marks is : "+marks);
			return "AA";
			
		}
		else if(marks>=81 && marks<=90) {
			System.out.println(" marks is : "+marks);
			return "AB";
		}
		
		else if(marks>=71 && marks<=80) {
			System.out.println(" marks is : "+marks);
			return "BB";
		}
		else if(marks>=61 && marks<=70) {
			System.out.println(" marks is : "+marks);
			return "BC";
		}
		else if(marks>=51 && marks<=60) {
			System.out.println(" marks is : "+marks);
			return "CD";
		}
		else if(marks>=41 && marks<=50) {
			System.out.println(" marks is : "+marks);
			return "DD";
		}
		else
		{
			System.out.println(" marks is : "+marks);
			return "fail";
		}
	}

	//8.factorial 
	
	public static int factorial(int n) {
		
		
		if(n==0 || n==1) {
			
			return 1;
		}
		else
		{
			return n*factorial (n-1); 
		}
		
	}
	public static void main(String[] args) {

		addSubMulDiv ad = new addSubMulDiv();

		System.out.println("------normal methods---------------------");
		System.out.println();
		// 1.add
		ad.add(10, 20);
		// 2.Mul
		ad.mul(10, 20);
		// 3.Div
		ad.div(20, 10);
		// 4.Sub
		ad.sub(20, 10);

		System.out.println();
		System.out.println("----------by using switch case---------------------");
		System.out.println();
		ad.AddSwitch("aDd", 10, 20);
		ad.AddSwitch("suB", 20, 10);
		ad.AddSwitch("MUL", 10, 20);
		ad.AddSwitch("Div", 20, 10);

		System.out.println();
		System.out.println("-----------2.returns the product of two double numbers.-----------");
		System.out.println();
		// getInfo gi = new getInfo();
		double m = ad.getInfo(10.22, 11.22);

		System.out.println("Product of a and b is  :" + m);
		System.out.println();
		System.out.println("---cal--calculateCircumference---");
		System.out.println();
		double p = addSubMulDiv.CalCurcumfrerence(20.50);
		System.out.println("CalCurcumfrerence : " + p);
		double q = addSubMulDiv.calArea(40.50);
		System.out.println("Calculation od area : " + q);

		System.out.println();
		System.out.println("-----------Maximum  and minimum number of a and b and c is------");
		addSubMulDiv.maximum(10, 30, 20);

		addSubMulDiv.minimum(20, 30, 10);

		System.out.println("given number is even or odd - return true/false.");
		boolean flg = addSubMulDiv.oddEven(32);
		System.out.println(flg);
		System.out.println();
		System.out.println("-------------voter is eligible or not ----------");
		System.out.println();

		boolean f = addSubMulDiv.vote("Naveen", 18);

		System.out.println(f);
		
		System.out.println(" Grades according to the marks entered as below:");
		
		String gd=addSubMulDiv.CalGrade(35);
		
		System.out.println("Grade :"+gd);
		
		System.out.println("------------Factorial-----------");
		
		int ft=addSubMulDiv.factorial(4);
		
		System.out.println(ft);
		
	}

}
